<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl='http://www.w3.org/1999/XSL/Transform' 
                version='1.0'
                xmlns:cbn='http://www.ujf-grenoble.fr/l3miage/medical'
                xmlns:act='http://www.ujf-grenoble.fr/l3miage/actes'
>
    <xsl:output method="html"/>
    
    <xsl:param name="destinedId"/>     
    <xsl:variable name="actes" select="document('actes.xml', /)/ngap"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>visites.xsl</title>
                <style type="text/css">
                    .gras{ font-weight:bold;}
                    td{ border:1px black solid;
                    }
                </style>
                <script type="text/javascript" >
                    function openFacture(prenom, nom, actes) {
                    var width  = 500;
                    var height = 300;
                    if(window.innerWidth) {
                    var left = (window.innerWidth-width)/2;
                    var top = (window.innerHeight-height)/2;
                    }
                    else {
                    var left = (document.body.clientWidth-width)/2;
                    var top = (document.body.clientHeight-height)/2;
                    }
                    var factureWindow = window.open('','facture','menubar=yes, scrollbars=yes, top='+top+', left='+left+', width='+width+', height='+height+'');
                    factureText = "Facture pour : " + prenom + " " + nom;
                    factureWindow.document.write(factureText);
                    }      
                    
                </script>
                <link rel="stylesheet" type="text/css" href="cabinet.css"/>
            </head>
            <body>

                
                <!-- Recupere le prénom de l'infirmere -->
                <p>
                    <span class="gras">Bienvenue 
                        <xsl:value-of select="/cabinet/infirmiers/infirmier[@id=$destinedId]/prénom/text()" /> 
                    </span> sur votre profil !
                   
                         
                    <img>
                        <xsl:attribute name="src">
                            <xsl:value-of select="/cabinet/infirmiers/infirmier[@id=$destinedId]/photo/text()"/>
                        </xsl:attribute>
                    </img>
                </p>
                
                <p> 
                    <span class="gras">Numero  de l'infirmiere: </span>
                    <xsl:value-of select="$destinedId"/> 
                </p> 
                <p>Nombre d'infirmiers du cabinet : <xsl:value-of select="count(//infirmier)"/> </p>
               

                
                
                
                <!-- Nombre de patietn pour l'infirmiere -->
                <p>
                    <span class="titre">Aujourd'hui nombre de patients :</span> 
                    <xsl:value-of select ="count(//visite[@intervenant=$destinedId])"/>
                </p>
                <!-- Affichade des visites de patients de l'infirmiere --> 
                <xsl:apply-templates select="/cabinet/patients/patient/visite[@intervenant=$destinedId]/..">
                    <xsl:sort select="/cabinet/patients/patient/visite/@date" order="ascending" type="xsl:date"/>
                </xsl:apply-templates>
               
            </body>
        </html>
    </xsl:template>
    
    <!-- INFORMATIONS DU PATIENT -->
    <xsl:template match="patient">
        <h2>Informations du patient</h2>
        <table>
            <tr>
                <td>Nom</td>
                <td> 
                    <xsl:value-of select="nom/text()"/>
                </td>
            </tr>
                
            <tr>
                <td>Etage </td>
                <td>
                    <xsl:value-of select="adresse/étage/text()"/> 
                </td>
            </tr>
            <tr>
                <td>Numero</td>
                <td>
                    <xsl:value-of select="adresse/numéro/text()"/>
                </td>
            </tr>
            <tr>
                <td>Rue</td>
                <td>
                    <xsl:value-of select="adresse/rue/text()"/> 
                </td>
            </tr>
            <tr>
                <td>Ville</td>
                <td> 
                    <xsl:value-of select="adresse/ville/text()"/>
                </td>
            </tr>
            <tr>
                <td>Code postal</td>
                <td>
                    <xsl:value-of select="adresse/codePostal/text()"/>
                </td>
            </tr>
        </table>
        
        <!-- VISITES -->
        <xsl:apply-templates select="//visite[@intervenant=$destinedId]"/>
        <!-- Button "FACTURE"-->
        <xsl:element name="input">            
            <xsl:param  name="nodeSetACtes" select="visite/acte"/> 
            <xsl:attribute name="type">Submit</xsl:attribute>
            <xsl:attribute name = "value">Facture</xsl:attribute>
            <xsl:attribute name="onclick">
                openFacture('<xsl:value-of select="nom"/>', 
                '<xsl:value-of select="prénom"/>', 
                '<xsl:value-of select="$nodeSetACtes"/>')
            </xsl:attribute>   
        </xsl:element>

    </xsl:template>


    <!-- Visites d'un patient -->
    <xsl:template match="visite">
        <table id="tabSoins">
            <tr>
                <td>Numero du soin</td>
                <td>Description</td>
            </tr>
            <xsl:apply-templates select="acte"/>
        </table>
    </xsl:template>
    
    <!-- Un acte  -->
    <xsl:template match="acte">
        <xsl:param  name="numeroId" select="@id"/>   
        <h2>Soins à réaliser chez le patient </h2>
        
        <tr>
            <td>
                <xsl:value-of select="$numeroId"/>
            </td>
            <td>
                <xsl:value-of select="$actes/act:actes/act:acte[@id=$numeroId]"/>  
            </td>
        </tr>
     
       
    </xsl:template>
</xsl:stylesheet>
