
package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Adresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Adresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="étage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="numéro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresse", namespace = "http://www.ujf-grenoble.fr/l3miage/medical", propOrder = {
    "\u00e9tage",
    "num\u00e9ro",
    "rue",
    "ville",
    "codePostal"
})
public class Adresse {

    protected Integer étage;
    protected String numéro;
    @XmlElement(required = true)
    protected String rue;
    @XmlElement(required = true)
    protected String ville;
    @XmlElement(required = true)
    protected String codePostal;

    /**
     * Obtient la valeur de la propriété étage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getÉtage() {
        return étage;
    }

    /**
     * Définit la valeur de la propriété étage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setÉtage(Integer value) {
        this.étage = value;
    }

    /**
     * Obtient la valeur de la propriété numéro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuméro() {
        return numéro;
    }

    /**
     * Définit la valeur de la propriété numéro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuméro(String value) {
        this.numéro = value;
    }

    /**
     * Obtient la valeur de la propriété rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Définit la valeur de la propriété rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propriété codePostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Définit la valeur de la propriété codePostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePostal(String value) {
        this.codePostal = value;
    }

}
