//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.04.04 à 07:11:33 PM CEST 
//


package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.ujf_grenoble.l3miage.medical package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.ujf_grenoble.l3miage.medical
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Visite }
     * 
     */
    public Visite createVisite() {
        return new Visite();
    }

    /**
     * Create an instance of {@link Cabinet }
     * 
     */
    public Cabinet createCabinet() {
        return new Cabinet();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link Infirmiers }
     * 
     */
    public Infirmiers createInfirmiers() {
        return new Infirmiers();
    }

    /**
     * Create an instance of {@link Patients }
     * 
     */
    public Patients createPatients() {
        return new Patients();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Infirmier }
     * 
     */
    public Infirmier createInfirmier() {
        return new Infirmier();
    }

    /**
     * Create an instance of {@link Visite.Acte }
     * 
     */
    public Visite.Acte createVisiteActe() {
        return new Visite.Acte();
    }

}
