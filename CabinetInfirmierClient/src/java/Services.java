
import fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service;
import javax.xml.ws.WebServiceRef;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aurel
 */
public class Services {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CabinetInfirmierServer/CabinetInfirmier.wsdl")
    private CabinetInfirmier_Service service;

    public String getNomCabinet() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getNomCabinet();
    }

    public Integer getStrLength(java.lang.String p1) {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getStrLength(p1);
    }

    public String hello(java.lang.String name) {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.hello(name);
    }

    public String getListePatientsStr(java.lang.Integer id) {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getListePatientsStr(id);
    }

    public java.util.List<fr.ujf_grenoble.l3miage.medical.Patient> getListePatients(java.lang.Integer id) {
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service service = new fr.ujf_grenoble.l3miage.medical.CabinetInfirmier_Service();
        fr.ujf_grenoble.l3miage.medical.CabinetInfirmier port = service.getCabinetInfirmierPort();
        return port.getListePatients(id);
    }

}
