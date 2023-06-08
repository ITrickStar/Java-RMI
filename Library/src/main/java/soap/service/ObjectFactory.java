
package soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.service package. 
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

    private final static QName _AddLib_QNAME = new QName("http://soap/", "addLib");
    private final static QName _AddLibResponse_QNAME = new QName("http://soap/", "addLibResponse");
    private final static QName _BorrowLib_QNAME = new QName("http://soap/", "borrowLib");
    private final static QName _BorrowLibResponse_QNAME = new QName("http://soap/", "borrowLibResponse");
    private final static QName _ChkRightsLib_QNAME = new QName("http://soap/", "chkRightsLib");
    private final static QName _ChkRightsLibResponse_QNAME = new QName("http://soap/", "chkRightsLibResponse");
    private final static QName _GetLib_QNAME = new QName("http://soap/", "getLib");
    private final static QName _GetLibResponse_QNAME = new QName("http://soap/", "getLibResponse");
    private final static QName _Hello_QNAME = new QName("http://soap/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://soap/", "helloResponse");
    private final static QName _NewLib_QNAME = new QName("http://soap/", "newLib");
    private final static QName _NewLibResponse_QNAME = new QName("http://soap/", "newLibResponse");
    private final static QName _RegUser_QNAME = new QName("http://soap/", "regUser");
    private final static QName _RegUserResponse_QNAME = new QName("http://soap/", "regUserResponse");
    private final static QName _ReturnLib_QNAME = new QName("http://soap/", "returnLib");
    private final static QName _ReturnLibResponse_QNAME = new QName("http://soap/", "returnLibResponse");
    private final static QName _ShowDebts_QNAME = new QName("http://soap/", "showDebts");
    private final static QName _ShowDebtsResponse_QNAME = new QName("http://soap/", "showDebtsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddLib }
     * 
     */
    public AddLib createAddLib() {
        return new AddLib();
    }

    /**
     * Create an instance of {@link AddLibResponse }
     * 
     */
    public AddLibResponse createAddLibResponse() {
        return new AddLibResponse();
    }

    /**
     * Create an instance of {@link BorrowLib }
     * 
     */
    public BorrowLib createBorrowLib() {
        return new BorrowLib();
    }

    /**
     * Create an instance of {@link BorrowLibResponse }
     * 
     */
    public BorrowLibResponse createBorrowLibResponse() {
        return new BorrowLibResponse();
    }

    /**
     * Create an instance of {@link ChkRightsLib }
     * 
     */
    public ChkRightsLib createChkRightsLib() {
        return new ChkRightsLib();
    }

    /**
     * Create an instance of {@link ChkRightsLibResponse }
     * 
     */
    public ChkRightsLibResponse createChkRightsLibResponse() {
        return new ChkRightsLibResponse();
    }

    /**
     * Create an instance of {@link GetLib }
     * 
     */
    public GetLib createGetLib() {
        return new GetLib();
    }

    /**
     * Create an instance of {@link GetLibResponse }
     * 
     */
    public GetLibResponse createGetLibResponse() {
        return new GetLibResponse();
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
     * Create an instance of {@link NewLib }
     * 
     */
    public NewLib createNewLib() {
        return new NewLib();
    }

    /**
     * Create an instance of {@link NewLibResponse }
     * 
     */
    public NewLibResponse createNewLibResponse() {
        return new NewLibResponse();
    }

    /**
     * Create an instance of {@link RegUser }
     * 
     */
    public RegUser createRegUser() {
        return new RegUser();
    }

    /**
     * Create an instance of {@link RegUserResponse }
     * 
     */
    public RegUserResponse createRegUserResponse() {
        return new RegUserResponse();
    }

    /**
     * Create an instance of {@link ReturnLib }
     * 
     */
    public ReturnLib createReturnLib() {
        return new ReturnLib();
    }

    /**
     * Create an instance of {@link ReturnLibResponse }
     * 
     */
    public ReturnLibResponse createReturnLibResponse() {
        return new ReturnLibResponse();
    }

    /**
     * Create an instance of {@link ShowDebts }
     * 
     */
    public ShowDebts createShowDebts() {
        return new ShowDebts();
    }

    /**
     * Create an instance of {@link ShowDebtsResponse }
     * 
     */
    public ShowDebtsResponse createShowDebtsResponse() {
        return new ShowDebtsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLib }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLib }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addLib")
    public JAXBElement<AddLib> createAddLib(AddLib value) {
        return new JAXBElement<AddLib>(_AddLib_QNAME, AddLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLibResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLibResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addLibResponse")
    public JAXBElement<AddLibResponse> createAddLibResponse(AddLibResponse value) {
        return new JAXBElement<AddLibResponse>(_AddLibResponse_QNAME, AddLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowLib }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BorrowLib }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "borrowLib")
    public JAXBElement<BorrowLib> createBorrowLib(BorrowLib value) {
        return new JAXBElement<BorrowLib>(_BorrowLib_QNAME, BorrowLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowLibResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BorrowLibResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "borrowLibResponse")
    public JAXBElement<BorrowLibResponse> createBorrowLibResponse(BorrowLibResponse value) {
        return new JAXBElement<BorrowLibResponse>(_BorrowLibResponse_QNAME, BorrowLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkRightsLib }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChkRightsLib }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "chkRightsLib")
    public JAXBElement<ChkRightsLib> createChkRightsLib(ChkRightsLib value) {
        return new JAXBElement<ChkRightsLib>(_ChkRightsLib_QNAME, ChkRightsLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChkRightsLibResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChkRightsLibResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "chkRightsLibResponse")
    public JAXBElement<ChkRightsLibResponse> createChkRightsLibResponse(ChkRightsLibResponse value) {
        return new JAXBElement<ChkRightsLibResponse>(_ChkRightsLibResponse_QNAME, ChkRightsLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLib }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLib }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getLib")
    public JAXBElement<GetLib> createGetLib(GetLib value) {
        return new JAXBElement<GetLib>(_GetLib_QNAME, GetLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLibResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getLibResponse")
    public JAXBElement<GetLibResponse> createGetLibResponse(GetLibResponse value) {
        return new JAXBElement<GetLibResponse>(_GetLibResponse_QNAME, GetLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "hello")
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
    @XmlElementDecl(namespace = "http://soap/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewLib }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewLib }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "newLib")
    public JAXBElement<NewLib> createNewLib(NewLib value) {
        return new JAXBElement<NewLib>(_NewLib_QNAME, NewLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewLibResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NewLibResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "newLibResponse")
    public JAXBElement<NewLibResponse> createNewLibResponse(NewLibResponse value) {
        return new JAXBElement<NewLibResponse>(_NewLibResponse_QNAME, NewLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "regUser")
    public JAXBElement<RegUser> createRegUser(RegUser value) {
        return new JAXBElement<RegUser>(_RegUser_QNAME, RegUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "regUserResponse")
    public JAXBElement<RegUserResponse> createRegUserResponse(RegUserResponse value) {
        return new JAXBElement<RegUserResponse>(_RegUserResponse_QNAME, RegUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnLib }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnLib }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "returnLib")
    public JAXBElement<ReturnLib> createReturnLib(ReturnLib value) {
        return new JAXBElement<ReturnLib>(_ReturnLib_QNAME, ReturnLib.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnLibResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnLibResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "returnLibResponse")
    public JAXBElement<ReturnLibResponse> createReturnLibResponse(ReturnLibResponse value) {
        return new JAXBElement<ReturnLibResponse>(_ReturnLibResponse_QNAME, ReturnLibResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowDebts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowDebts }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "showDebts")
    public JAXBElement<ShowDebts> createShowDebts(ShowDebts value) {
        return new JAXBElement<ShowDebts>(_ShowDebts_QNAME, ShowDebts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowDebtsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowDebtsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "showDebtsResponse")
    public JAXBElement<ShowDebtsResponse> createShowDebtsResponse(ShowDebtsResponse value) {
        return new JAXBElement<ShowDebtsResponse>(_ShowDebtsResponse_QNAME, ShowDebtsResponse.class, null, value);
    }

}
