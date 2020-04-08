
package fr.ujf_grenoble.l3miage.medical;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CabinetInfirmier", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CabinetInfirmier {


    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListePatientsStr", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetListePatientsStr")
    @ResponseWrapper(localName = "getListePatientsStrResponse", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetListePatientsStrResponse")
    @Action(input = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getListePatientsStrRequest", output = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getListePatientsStrResponse")
    public String getListePatientsStr(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.HelloResponse")
    @Action(input = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/helloRequest", output = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param p1
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStrLength", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetStrLength")
    @ResponseWrapper(localName = "getStrLengthResponse", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetStrLengthResponse")
    @Action(input = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getStrLengthRequest", output = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getStrLengthResponse")
    public Integer getStrLength(
        @WebParam(name = "p1", targetNamespace = "")
        String p1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNomCabinet", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetNomCabinet")
    @ResponseWrapper(localName = "getNomCabinetResponse", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetNomCabinetResponse")
    @Action(input = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getNomCabinetRequest", output = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getNomCabinetResponse")
    public String getNomCabinet();

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<fr.ujf_grenoble.l3miage.medical.Patient>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListePatients", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetListePatients")
    @ResponseWrapper(localName = "getListePatientsResponse", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetListePatientsResponse")
    @Action(input = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getListePatientsRequest", output = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getListePatientsResponse")
    public List<Patient> getListePatients(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCoutPatient", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetCoutPatient")
    @ResponseWrapper(localName = "getCoutPatientResponse", targetNamespace = "http://medical.l3miage.ujf_grenoble.fr/", className = "fr.ujf_grenoble.l3miage.medical.GetCoutPatientResponse")
    @Action(input = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getCoutPatientRequest", output = "http://medical.l3miage.ujf_grenoble.fr/CabinetInfirmier/getCoutPatientResponse")
    public String getCoutPatient(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

}
