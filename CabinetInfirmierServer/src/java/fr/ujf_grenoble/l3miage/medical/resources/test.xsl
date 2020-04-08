<?xml version='1.1' encoding='UTF-8' ?> 
<!--
    Document   : test.xsl
    Created on : 19 octobre 2017, 18:12
    Author     : Nicolas GLADE
    Description: Cette feuille de test montre comment transformer un centre médical.
                 et déclarer un paramètre pour recevoir une valeur fournie par le processeur XSLT
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                xmlns:cbn='http://www.ujf-grenoble.fr/l3miage/medical' 
                version="1.0">
    <xsl:output method="html"/>

    <!-- ICI, on déclare un paramètre, c'est à dire une valeur pouvant être reçue du processeur XSLT -->
    <xsl:param name="idInfirmier" />
    
    <xsl:template match="/">
        <html>
            <head>
                <title>Cabinet Infirmier (demo)</title>
            </head>
            <body>
                <h1>Cabinet Infirmier (demo)</h1>
                <br/>
                <b>Nombre d'infirmiers du cabinet : </b><xsl:value-of select="count(//infirmier)"/>

                <!-- Ici, on utilise ce paramètre. Attention à bien mettre un $ devant le nom du paramètre -->
                <b>Numero de l'infirmier: </b><xsl:value-of select="$idInfirmier"/>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
