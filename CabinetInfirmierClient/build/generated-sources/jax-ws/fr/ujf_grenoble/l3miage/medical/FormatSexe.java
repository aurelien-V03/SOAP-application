
package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour formatSexe.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="formatSexe"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "formatSexe", namespace = "http://www.ujf-grenoble.fr/l3miage/medical")
@XmlEnum
public enum FormatSexe {

    M,
    F;

    public String value() {
        return name();
    }

    public static FormatSexe fromValue(String v) {
        return valueOf(v);
    }

}
