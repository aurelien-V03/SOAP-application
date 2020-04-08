//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.04.04 à 07:11:33 PM CEST 
//


package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Infirmier complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Infirmier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatString"/>
 *         &lt;element name="prénom" type="{http://www.ujf-grenoble.fr/l3miage/medical}formatString"/>
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
     * Obtient la valeur de la propriété photo.
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
     * Définit la valeur de la propriété photo.
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
     * Obtient la valeur de la propriété id.
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
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
