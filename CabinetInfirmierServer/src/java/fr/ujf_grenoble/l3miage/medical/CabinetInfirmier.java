/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ujf_grenoble.l3miage.medical;

import fr.ujf_grenoble.l3miage.medical.XMLUtil.DocumentFactory;
import fr.ujf_grenoble.l3miage.medical.XMLUtil.DocumentTransform;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Aurel
 */
@WebService(serviceName = "CabinetInfirmier")
public class CabinetInfirmier {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        if(txt != null){
           return "Hello " + txt + " !";
        }
        else 
           return "Hello !";        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getStrLength")
    public java.lang.Integer getStrLength(@WebParam(name = "p1") String p1) {
        return p1.length();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getNomCabinet")
    public String getNomCabinet() {
        Cabinet e = this.fromResource();
        return e.getNom();
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
System.out.println("erreur chargement cabinet.xml");        }
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getListePatientsStr")
    public String getListePatientsStr(@WebParam(name = "id") Integer id) {
       String aretourner = "Patients de l'infirmière [" + id + "] :";   
               Cabinet e = this.fromResource();

       for(int i = 0 ; i < e.patients.getPatients().size();i++){
           Patient p = e.patients.getPatients().get(i);
           if(p.visite.intervenant == id)
           {
               aretourner += "[" +p.nom + "," +p.prénom + "]";
           }
       }



        return aretourner;
    }

    /**
     * Retourne la liste des patients qde l'infirmier id 
     */
    @WebMethod(operationName = "getListePatients")
    public List<Patient> getListePatients(@WebParam(name = "id") Integer id) {
      
        
       ArrayList<Patient> aretourner = new ArrayList<Patient>();   
               Cabinet e = this.fromResource();

       for(int i = 0 ; i < e.patients.getPatients().size();i++){
           Patient p = e.patients.getPatients().get(i);
           if(p.visite.intervenant == id)
           {
               aretourner.add(p);
           }
       }
       return aretourner;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCoutPatient")
    public String getCoutPatient(@WebParam(name = "id") Integer id) {
        //TODO write your implementation code here:
        return null;
    }

   /**
     * Retourne une page HTML contenant les informations de l'infirmiere numero "001" (informations personnelles et visites
     * aupres de ses patients)
     */
    @WebMethod(operationName = "getHTML")
    public String getHTML() {
        try {
            // On récupère une instance de cabinet depuis la resource.
            Cabinet c = fromResource();
            
            // Traitements préliminaires éventuels ... en Java
            /*
            * ici sont réalisés les traitements souhaités pour récupérer les informations utiles
            * ex: classement des patients par ordre alphabétique
            * ex: classement de la liste des patients d'une infirmière selon la distance
            */
            
            // On fabrique un document DOM à partir d'un objet, ici un cabinet
            Document doc = DocumentFactory.fromObject(c);
            // On récupère ici la feuille de transformation de l'infirmière
            StreamSource xslSource = fromResource("resources/pageInfirmiere.xsl"); // !!!!!!!!! ATTENTION, changer le nom si nécessaire
            // On fabrique une processeur de document (Transformer)
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xslSource);
            // On donne un nom au paramètre ; ce nom est celui utilisé dans la feuille de transformation
            String id = "destinedId";
            // On indique au processeur de document d'appliquer un paramètre auquel on donne sa valeur.
            transformer.setParameter(id, Integer.parseInt("001"));
            // On applique la transformation    
            return DocumentTransform.fromTransformation(transformer, doc);
        } catch (TransformerException | JAXBException | ParserConfigurationException | SAXException | IOException ex) {
System.out.println("Erreur getHTML : " + ex.getMessage());        }
        return null;
    }

    /**
     * Retourne une page HTML contenant les informations de l'infirmiere (informations personnelles et visites
     * aupres de ses patients)
     */
    @WebMethod(operationName = "getInfirmiere")
    public String getInfirmiere(@WebParam(name = "infirmierId") String infirmierId) {
        try {
            // On récupère une instance de cabinet depuis la resource.
            Cabinet c = fromResource();
            
            // Traitements préliminaires éventuels ... en Java
            /*
            * ici sont réalisés les traitements souhaités pour récupérer les informations utiles
            * ex: classement des patients par ordre alphabétique
            * ex: classement de la liste des patients d'une infirmière selon la distance
            */
            
            // On fabrique un document DOM à partir d'un objet, ici un cabinet
            Document doc = DocumentFactory.fromObject(c);
            // On récupère ici la feuille de transformation de l'infirmière
            StreamSource xslSource = fromResource("resources/pageInfirmiere.xsl"); // !!!!!!!!! ATTENTION, changer le nom si nécessaire
            // On fabrique une processeur de document (Transformer)
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xslSource);
            // On donne un nom au paramètre ; ce nom est celui utilisé dans la feuille de transformation
            String id = "destinedId";
            // On indique au processeur de document d'appliquer un paramètre auquel on donne sa valeur.
            transformer.setParameter(id, Integer.parseInt(infirmierId));
            // On applique la transformation    
            return DocumentTransform.fromTransformation(transformer, doc);
        } catch (TransformerException | JAXBException | ParserConfigurationException | SAXException | IOException ex) {
System.out.println("**********************************************************" + ex.getMessage());        }
        return null;
    }

    
    
    
    
    
    
    
    
    
    
}
