//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.04.04 à 07:11:33 PM CEST 
//


package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Cabinet complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Cabinet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresse" type="{http://www.ujf-grenoble.fr/l3miage/medical}Adresse"/>
 *         &lt;element name="infirmiers" type="{http://www.ujf-grenoble.fr/l3miage/medical}Infirmiers"/>
 *         &lt;element name="patients" type="{http://www.ujf-grenoble.fr/l3miage/medical}Patients"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cabinet", propOrder = {
    "nom",
    "adresse",
    "infirmiers",
    "patients"
})
@XmlRootElement(name = "cabinet")
public class Cabinet {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected Adresse adresse;
    @XmlElement(required = true)
    protected Infirmiers infirmiers;
    @XmlElement(required = true)
    protected Patients patients;

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
     * Obtient la valeur de la propriété infirmiers.
     * 
     * @return
     *     possible object is
     *     {@link Infirmiers }
     *     
     */
    public Infirmiers getInfirmiers() {
        return infirmiers;
    }

    /**
     * Définit la valeur de la propriété infirmiers.
     * 
     * @param value
     *     allowed object is
     *     {@link Infirmiers }
     *     
     */
    public void setInfirmiers(Infirmiers value) {
        this.infirmiers = value;
    }

    /**
     * Obtient la valeur de la propriété patients.
     * 
     * @return
     *     possible object is
     *     {@link Patients }
     *     
     */
    public Patients getPatients() {
        return patients;
    }

    /**
     * Définit la valeur de la propriété patients.
     * 
     * @param value
     *     allowed object is
     *     {@link Patients }
     *     
     */
    public void setPatients(Patients value) {
        this.patients = value;
    }

}
