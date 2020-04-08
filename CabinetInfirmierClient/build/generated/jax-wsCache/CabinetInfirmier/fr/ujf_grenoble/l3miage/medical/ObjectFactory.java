
package fr.ujf_grenoble.l3miage.medical;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _GetCoutPatient_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getCoutPatient");
    private final static QName _GetCoutPatientResponse_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getCoutPatientResponse");
    private final static QName _GetListePatients_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getListePatients");
    private final static QName _GetListePatientsResponse_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getListePatientsResponse");
    private final static QName _GetListePatientsStr_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getListePatientsStr");
    private final static QName _GetListePatientsStrResponse_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getListePatientsStrResponse");
    private final static QName _GetNomCabinet_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getNomCabinet");
    private final static QName _GetNomCabinetResponse_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getNomCabinetResponse");
    private final static QName _GetStrLength_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getStrLength");
    private final static QName _GetStrLengthResponse_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "getStrLengthResponse");
    private final static QName _Hello_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://medical.l3miage.ujf_grenoble.fr/", "helloResponse");

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
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link GetCoutPatient }
     * 
     */
    public GetCoutPatient createGetCoutPatient() {
        return new GetCoutPatient();
    }

    /**
     * Create an instance of {@link GetCoutPatientResponse }
     * 
     */
    public GetCoutPatientResponse createGetCoutPatientResponse() {
        return new GetCoutPatientResponse();
    }

    /**
     * Create an instance of {@link GetListePatients }
     * 
     */
    public GetListePatients createGetListePatients() {
        return new GetListePatients();
    }

    /**
     * Create an instance of {@link GetListePatientsResponse }
     * 
     */
    public GetListePatientsResponse createGetListePatientsResponse() {
        return new GetListePatientsResponse();
    }

    /**
     * Create an instance of {@link GetListePatientsStr }
     * 
     */
    public GetListePatientsStr createGetListePatientsStr() {
        return new GetListePatientsStr();
    }

    /**
     * Create an instance of {@link GetListePatientsStrResponse }
     * 
     */
    public GetListePatientsStrResponse createGetListePatientsStrResponse() {
        return new GetListePatientsStrResponse();
    }

    /**
     * Create an instance of {@link GetNomCabinet }
     * 
     */
    public GetNomCabinet createGetNomCabinet() {
        return new GetNomCabinet();
    }

    /**
     * Create an instance of {@link GetNomCabinetResponse }
     * 
     */
    public GetNomCabinetResponse createGetNomCabinetResponse() {
        return new GetNomCabinetResponse();
    }

    /**
     * Create an instance of {@link GetStrLength }
     * 
     */
    public GetStrLength createGetStrLength() {
        return new GetStrLength();
    }

    /**
     * Create an instance of {@link GetStrLengthResponse }
     * 
     */
    public GetStrLengthResponse createGetStrLengthResponse() {
        return new GetStrLengthResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Visite.Acte }
     * 
     */
    public Visite.Acte createVisiteActe() {
        return new Visite.Acte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoutPatient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCoutPatient }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getCoutPatient")
    public JAXBElement<GetCoutPatient> createGetCoutPatient(GetCoutPatient value) {
        return new JAXBElement<GetCoutPatient>(_GetCoutPatient_QNAME, GetCoutPatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoutPatientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCoutPatientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getCoutPatientResponse")
    public JAXBElement<GetCoutPatientResponse> createGetCoutPatientResponse(GetCoutPatientResponse value) {
        return new JAXBElement<GetCoutPatientResponse>(_GetCoutPatientResponse_QNAME, GetCoutPatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListePatients }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListePatients }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getListePatients")
    public JAXBElement<GetListePatients> createGetListePatients(GetListePatients value) {
        return new JAXBElement<GetListePatients>(_GetListePatients_QNAME, GetListePatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListePatientsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListePatientsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getListePatientsResponse")
    public JAXBElement<GetListePatientsResponse> createGetListePatientsResponse(GetListePatientsResponse value) {
        return new JAXBElement<GetListePatientsResponse>(_GetListePatientsResponse_QNAME, GetListePatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListePatientsStr }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListePatientsStr }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getListePatientsStr")
    public JAXBElement<GetListePatientsStr> createGetListePatientsStr(GetListePatientsStr value) {
        return new JAXBElement<GetListePatientsStr>(_GetListePatientsStr_QNAME, GetListePatientsStr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListePatientsStrResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListePatientsStrResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getListePatientsStrResponse")
    public JAXBElement<GetListePatientsStrResponse> createGetListePatientsStrResponse(GetListePatientsStrResponse value) {
        return new JAXBElement<GetListePatientsStrResponse>(_GetListePatientsStrResponse_QNAME, GetListePatientsStrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNomCabinet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNomCabinet }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getNomCabinet")
    public JAXBElement<GetNomCabinet> createGetNomCabinet(GetNomCabinet value) {
        return new JAXBElement<GetNomCabinet>(_GetNomCabinet_QNAME, GetNomCabinet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNomCabinetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNomCabinetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getNomCabinetResponse")
    public JAXBElement<GetNomCabinetResponse> createGetNomCabinetResponse(GetNomCabinetResponse value) {
        return new JAXBElement<GetNomCabinetResponse>(_GetNomCabinetResponse_QNAME, GetNomCabinetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStrLength }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStrLength }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getStrLength")
    public JAXBElement<GetStrLength> createGetStrLength(GetStrLength value) {
        return new JAXBElement<GetStrLength>(_GetStrLength_QNAME, GetStrLength.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStrLengthResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStrLengthResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "getStrLengthResponse")
    public JAXBElement<GetStrLengthResponse> createGetStrLengthResponse(GetStrLengthResponse value) {
        return new JAXBElement<GetStrLengthResponse>(_GetStrLengthResponse_QNAME, GetStrLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://medical.l3miage.ujf_grenoble.fr/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
