//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.04.04 � 07:11:33 PM CEST 
//


package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Patient complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Patient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pr�nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sexe" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatSexe"/>
 *         &lt;element name="naissance" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="num�ro" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatNumeroSecu"/>
 *         &lt;element name="adresse" type="{http://www.ujf-grenoble.fr/l3miage/medical}Adresse"/>
 *         &lt;element name="visite" type="{http://www.ujf-grenoble.fr/l3miage/medical}Visite"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "nom",
    "pr\u00e9nom",
    "sexe",
    "naissance",
    "num\u00e9ro",
    "adresse",
    "visite"
})
public class Patient {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String prénom;
    @XmlElement(required = true)
    protected FormatSexe sexe;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar naissance;
    protected long numéro;
    @XmlElement(required = true)
    protected Adresse adresse;
    @XmlElement(required = true)
    protected Visite visite;

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
     * Obtient la valeur de la propri�t� sexe.
     * 
     * @return
     *     possible object is
     *     {@link FormatSexe }
     *     
     */
    public FormatSexe getSexe() {
        return sexe;
    }

    /**
     * D�finit la valeur de la propri�t� sexe.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatSexe }
     *     
     */
    public void setSexe(FormatSexe value) {
        this.sexe = value;
    }

    /**
     * Obtient la valeur de la propri�t� naissance.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNaissance() {
        return naissance;
    }

    /**
     * D�finit la valeur de la propri�t� naissance.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNaissance(XMLGregorianCalendar value) {
        this.naissance = value;
    }

    /**
     * Obtient la valeur de la propri�t� num�ro.
     * 
     */
    public long getNuméro() {
        return numéro;
    }

    /**
     * D�finit la valeur de la propri�t� num�ro.
     * 
     */
    public void setNuméro(long value) {
        this.numéro = value;
    }

    /**
     * Obtient la valeur de la propri�t� adresse.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * D�finit la valeur de la propri�t� adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAdresse(Adresse value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propri�t� visite.
     * 
     * @return
     *     possible object is
     *     {@link Visite }
     *     
     */
    public Visite getVisite() {
        return visite;
    }

    /**
     * D�finit la valeur de la propri�t� visite.
     * 
     * @param value
     *     allowed object is
     *     {@link Visite }
     *     
     */
    public void setVisite(Visite value) {
        this.visite = value;
    }

}
