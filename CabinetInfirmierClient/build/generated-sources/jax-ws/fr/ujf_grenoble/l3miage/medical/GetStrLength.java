
package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getStrLength complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getStrLength"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="p1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStrLength", propOrder = {
    "p1"
})
public class GetStrLength {

    @XmlElement(namespace = "")
    protected String p1;

    /**
     * Obtient la valeur de la propriété p1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP1() {
        return p1;
    }

    /**
     * Définit la valeur de la propriété p1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP1(String value) {
        this.p1 = value;
    }

}
