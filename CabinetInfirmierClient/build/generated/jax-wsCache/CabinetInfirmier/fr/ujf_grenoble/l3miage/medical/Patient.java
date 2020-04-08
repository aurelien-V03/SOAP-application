
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
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prénom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexe" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatSexe"/&gt;
 *         &lt;element name="naissance" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="numéro" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="adresse" type="{http://www.ujf-grenoble.fr/l3miage/medical}Adresse"/&gt;
 *         &lt;element name="visite" type="{http://www.ujf-grenoble.fr/l3miage/medical}Visite"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", namespace = "http://www.ujf-grenoble.fr/l3miage/medical", propOrder = {
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
    @XmlSchemaType(name = "string")
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
     * Obtient la valeur de la propriété nom.
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
     * Définit la valeur de la propriété nom.
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
     * Obtient la valeur de la propriété prénom.
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
     * Définit la valeur de la propriété prénom.
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
     * Obtient la valeur de la propriété sexe.
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
     * Définit la valeur de la propriété sexe.
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
     * Obtient la valeur de la propriété naissance.
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
     * Définit la valeur de la propriété naissance.
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
     * Obtient la valeur de la propriété numéro.
     * 
     */
    public long getNuméro() {
        return numéro;
    }

    /**
     * Définit la valeur de la propriété numéro.
     * 
     */
    public void setNuméro(long value) {
        this.numéro = value;
    }

    /**
     * Obtient la valeur de la propriété adresse.
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
     * Définit la valeur de la propriété adresse.
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
     * Obtient la valeur de la propriété visite.
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
     * Définit la valeur de la propriété visite.
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
