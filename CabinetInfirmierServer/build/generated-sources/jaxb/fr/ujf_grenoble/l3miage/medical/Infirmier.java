//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.04.04 � 07:11:33 PM CEST 
//


package fr.ujf_grenoble.l3miage.medical;

import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.transform.stream.StreamSource;


/**
 * <p>Classe Java pour Infirmier complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Infirmier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatString"/>
 *         &lt;element name="pr�nom" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatString"/>
 *         &lt;element name="photo" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatPhotoPng"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatIdInfirmier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Infirmier", propOrder = {
    "nom",
    "pr\u00e9nom",
    "photo"
})
public class Infirmier {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String prénom;
    @XmlElement(required = true)
    protected String photo;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propri�t� pr�nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrénom() {
        return prénom;
    }

    /**
     * D�finit la valeur de la propri�t� pr�nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrénom(String value) {
        this.prénom = value;
    }

    /**
     * Obtient la valeur de la propri�t� photo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * D�finit la valeur de la propri�t� photo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoto(String value) {
        this.photo = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }
    
    
    
    
        /**
     * Cette méthode : 
     * - récupère le document XML contenant l'organisation complète du cabinet infirmier en tant que ressource du Web Service
     * - réalise un unmarshalling à partir de cette ressource et du JAXB binding produit à partir du XML Schema 
     * - renvoie une référence sur l'instance de Cabinet, racine du système d'information
     *
     * @return racine du document XML (instance de la classe Cabinet)
     */
    private Cabinet fromResource() {
        // déclare un cabinet
        Cabinet cabinet = null;
        try {
            // récupération  de la ressource à partir du fichier XML
            URL cabinetXMLURL = CabinetInfirmier.class.getResource("resources/cabinet.xml");

            // création du contexte
            javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext.newInstance(Cabinet.class.getPackage().getName());

            // création d'un unmarshaller 
            javax.xml.bind.Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();

            // unmarshalling... (utilisation d'un transtypage)
            cabinet = (Cabinet) unmarshaller.unmarshal(cabinetXMLURL); //NOI18N

        } catch (JAXBException ex) {
            Logger.getLogger(CabinetInfirmier.class.getName()).log(Level.SEVERE, null, ex);
        }
        // retourne une instance de cabinet, ou null si le chargement du fichier a 
        return cabinet;
    }

    /**
     * Cette méthode du WS permet de récupérer une resource distante sous la
     * forme d'un flux source (StreamSource) pouvant être utilisée dans les méthodes de XMLUtil (trandformation XSLT ...).
     *
     * @param resourceFile
     * @return
     */
    private StreamSource fromResource(String resourceFile) {
        // crée un flux d'entrée qui récupère la resource distante comme un flux
        InputStream resourceStream = this.getClass().getResourceAsStream(resourceFile);
        // Retourne ce flux d'entrée sous la forme d'un flux source
        return new StreamSource(resourceStream);
    } 

}
