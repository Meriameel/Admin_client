
package com.meriame.soapservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.meriame.soapservice package. 
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

    private final static QName _FindAllAgencesResponse_QNAME = new QName("http://soapService.meriame.com/", "findAllAgencesResponse");
    private final static QName _FindAllAgentResponse_QNAME = new QName("http://soapService.meriame.com/", "findAllAgentResponse");
    private final static QName _EditAgence_QNAME = new QName("http://soapService.meriame.com/", "editAgence");
    private final static QName _EditAgenceResponse_QNAME = new QName("http://soapService.meriame.com/", "editAgenceResponse");
    private final static QName _FindAllAgences_QNAME = new QName("http://soapService.meriame.com/", "findAllAgences");
    private final static QName _GetAgence_QNAME = new QName("http://soapService.meriame.com/", "getAgence");
    private final static QName _AdminLogin_QNAME = new QName("http://soapService.meriame.com/", "AdminLogin");
    private final static QName _AddAgentResponse_QNAME = new QName("http://soapService.meriame.com/", "addAgentResponse");
    private final static QName _AddAgenceResponse_QNAME = new QName("http://soapService.meriame.com/", "addAgenceResponse");
    private final static QName _DeleteAgenceResponse_QNAME = new QName("http://soapService.meriame.com/", "deleteAgenceResponse");
    private final static QName _AgentSOAPDTO_QNAME = new QName("http://soapService.meriame.com/", "AgentSOAP_DTO");
    private final static QName _EditAgentResponse_QNAME = new QName("http://soapService.meriame.com/", "editAgentResponse");
    private final static QName _GetAgenceResponse_QNAME = new QName("http://soapService.meriame.com/", "getAgenceResponse");
    private final static QName _DeleteAgence_QNAME = new QName("http://soapService.meriame.com/", "deleteAgence");
    private final static QName _DeleteAgentResponse_QNAME = new QName("http://soapService.meriame.com/", "deleteAgentResponse");
    private final static QName _EditAgent_QNAME = new QName("http://soapService.meriame.com/", "editAgent");
    private final static QName _FindAllAgent_QNAME = new QName("http://soapService.meriame.com/", "findAllAgent");
    private final static QName _AdminLoginResponse_QNAME = new QName("http://soapService.meriame.com/", "AdminLoginResponse");
    private final static QName _DeleteAgent_QNAME = new QName("http://soapService.meriame.com/", "deleteAgent");
    private final static QName _AddAgent_QNAME = new QName("http://soapService.meriame.com/", "addAgent");
    private final static QName _GetAgent_QNAME = new QName("http://soapService.meriame.com/", "getAgent");
    private final static QName _GetAgentResponse_QNAME = new QName("http://soapService.meriame.com/", "getAgentResponse");
    private final static QName _AddAgence_QNAME = new QName("http://soapService.meriame.com/", "addAgence");
    private final static QName _AgenceSOAPDTO_QNAME = new QName("http://soapService.meriame.com/", "AgenceSOAP_DTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.meriame.soapservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAgentResponse }
     * 
     */
    public DeleteAgentResponse createDeleteAgentResponse() {
        return new DeleteAgentResponse();
    }

    /**
     * Create an instance of {@link EditAgent }
     * 
     */
    public EditAgent createEditAgent() {
        return new EditAgent();
    }

    /**
     * Create an instance of {@link FindAllAgent }
     * 
     */
    public FindAllAgent createFindAllAgent() {
        return new FindAllAgent();
    }

    /**
     * Create an instance of {@link DeleteAgence }
     * 
     */
    public DeleteAgence createDeleteAgence() {
        return new DeleteAgence();
    }

    /**
     * Create an instance of {@link GetAgenceResponse }
     * 
     */
    public GetAgenceResponse createGetAgenceResponse() {
        return new GetAgenceResponse();
    }

    /**
     * Create an instance of {@link EditAgentResponse }
     * 
     */
    public EditAgentResponse createEditAgentResponse() {
        return new EditAgentResponse();
    }

    /**
     * Create an instance of {@link AgentSOAPDTO }
     * 
     */
    public AgentSOAPDTO createAgentSOAPDTO() {
        return new AgentSOAPDTO();
    }

    /**
     * Create an instance of {@link AgenceSOAPDTO }
     * 
     */
    public AgenceSOAPDTO createAgenceSOAPDTO() {
        return new AgenceSOAPDTO();
    }

    /**
     * Create an instance of {@link AddAgence }
     * 
     */
    public AddAgence createAddAgence() {
        return new AddAgence();
    }

    /**
     * Create an instance of {@link GetAgent }
     * 
     */
    public GetAgent createGetAgent() {
        return new GetAgent();
    }

    /**
     * Create an instance of {@link GetAgentResponse }
     * 
     */
    public GetAgentResponse createGetAgentResponse() {
        return new GetAgentResponse();
    }

    /**
     * Create an instance of {@link AddAgent }
     * 
     */
    public AddAgent createAddAgent() {
        return new AddAgent();
    }

    /**
     * Create an instance of {@link AdminLoginResponse }
     * 
     */
    public AdminLoginResponse createAdminLoginResponse() {
        return new AdminLoginResponse();
    }

    /**
     * Create an instance of {@link DeleteAgent }
     * 
     */
    public DeleteAgent createDeleteAgent() {
        return new DeleteAgent();
    }

    /**
     * Create an instance of {@link EditAgence }
     * 
     */
    public EditAgence createEditAgence() {
        return new EditAgence();
    }

    /**
     * Create an instance of {@link FindAllAgentResponse }
     * 
     */
    public FindAllAgentResponse createFindAllAgentResponse() {
        return new FindAllAgentResponse();
    }

    /**
     * Create an instance of {@link FindAllAgencesResponse }
     * 
     */
    public FindAllAgencesResponse createFindAllAgencesResponse() {
        return new FindAllAgencesResponse();
    }

    /**
     * Create an instance of {@link DeleteAgenceResponse }
     * 
     */
    public DeleteAgenceResponse createDeleteAgenceResponse() {
        return new DeleteAgenceResponse();
    }

    /**
     * Create an instance of {@link AddAgenceResponse }
     * 
     */
    public AddAgenceResponse createAddAgenceResponse() {
        return new AddAgenceResponse();
    }

    /**
     * Create an instance of {@link AdminLogin }
     * 
     */
    public AdminLogin createAdminLogin() {
        return new AdminLogin();
    }

    /**
     * Create an instance of {@link AddAgentResponse }
     * 
     */
    public AddAgentResponse createAddAgentResponse() {
        return new AddAgentResponse();
    }

    /**
     * Create an instance of {@link EditAgenceResponse }
     * 
     */
    public EditAgenceResponse createEditAgenceResponse() {
        return new EditAgenceResponse();
    }

    /**
     * Create an instance of {@link FindAllAgences }
     * 
     */
    public FindAllAgences createFindAllAgences() {
        return new FindAllAgences();
    }

    /**
     * Create an instance of {@link GetAgence }
     * 
     */
    public GetAgence createGetAgence() {
        return new GetAgence();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link Admin_Type }
     * 
     */
    public Admin_Type createAdmin_Type() {
        return new Admin_Type();
    }

    /**
     * Create an instance of {@link Agence }
     * 
     */
    public Agence createAgence() {
        return new Agence();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Versement }
     * 
     */
    public Versement createVersement() {
        return new Versement();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAgencesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "findAllAgencesResponse")
    public JAXBElement<FindAllAgencesResponse> createFindAllAgencesResponse(FindAllAgencesResponse value) {
        return new JAXBElement<FindAllAgencesResponse>(_FindAllAgencesResponse_QNAME, FindAllAgencesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "findAllAgentResponse")
    public JAXBElement<FindAllAgentResponse> createFindAllAgentResponse(FindAllAgentResponse value) {
        return new JAXBElement<FindAllAgentResponse>(_FindAllAgentResponse_QNAME, FindAllAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAgence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "editAgence")
    public JAXBElement<EditAgence> createEditAgence(EditAgence value) {
        return new JAXBElement<EditAgence>(_EditAgence_QNAME, EditAgence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAgenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "editAgenceResponse")
    public JAXBElement<EditAgenceResponse> createEditAgenceResponse(EditAgenceResponse value) {
        return new JAXBElement<EditAgenceResponse>(_EditAgenceResponse_QNAME, EditAgenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAgences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "findAllAgences")
    public JAXBElement<FindAllAgences> createFindAllAgences(FindAllAgences value) {
        return new JAXBElement<FindAllAgences>(_FindAllAgences_QNAME, FindAllAgences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "getAgence")
    public JAXBElement<GetAgence> createGetAgence(GetAgence value) {
        return new JAXBElement<GetAgence>(_GetAgence_QNAME, GetAgence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "AdminLogin")
    public JAXBElement<AdminLogin> createAdminLogin(AdminLogin value) {
        return new JAXBElement<AdminLogin>(_AdminLogin_QNAME, AdminLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "addAgentResponse")
    public JAXBElement<AddAgentResponse> createAddAgentResponse(AddAgentResponse value) {
        return new JAXBElement<AddAgentResponse>(_AddAgentResponse_QNAME, AddAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAgenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "addAgenceResponse")
    public JAXBElement<AddAgenceResponse> createAddAgenceResponse(AddAgenceResponse value) {
        return new JAXBElement<AddAgenceResponse>(_AddAgenceResponse_QNAME, AddAgenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAgenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "deleteAgenceResponse")
    public JAXBElement<DeleteAgenceResponse> createDeleteAgenceResponse(DeleteAgenceResponse value) {
        return new JAXBElement<DeleteAgenceResponse>(_DeleteAgenceResponse_QNAME, DeleteAgenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentSOAPDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "AgentSOAP_DTO")
    public JAXBElement<AgentSOAPDTO> createAgentSOAPDTO(AgentSOAPDTO value) {
        return new JAXBElement<AgentSOAPDTO>(_AgentSOAPDTO_QNAME, AgentSOAPDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "editAgentResponse")
    public JAXBElement<EditAgentResponse> createEditAgentResponse(EditAgentResponse value) {
        return new JAXBElement<EditAgentResponse>(_EditAgentResponse_QNAME, EditAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "getAgenceResponse")
    public JAXBElement<GetAgenceResponse> createGetAgenceResponse(GetAgenceResponse value) {
        return new JAXBElement<GetAgenceResponse>(_GetAgenceResponse_QNAME, GetAgenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAgence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "deleteAgence")
    public JAXBElement<DeleteAgence> createDeleteAgence(DeleteAgence value) {
        return new JAXBElement<DeleteAgence>(_DeleteAgence_QNAME, DeleteAgence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "deleteAgentResponse")
    public JAXBElement<DeleteAgentResponse> createDeleteAgentResponse(DeleteAgentResponse value) {
        return new JAXBElement<DeleteAgentResponse>(_DeleteAgentResponse_QNAME, DeleteAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "editAgent")
    public JAXBElement<EditAgent> createEditAgent(EditAgent value) {
        return new JAXBElement<EditAgent>(_EditAgent_QNAME, EditAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "findAllAgent")
    public JAXBElement<FindAllAgent> createFindAllAgent(FindAllAgent value) {
        return new JAXBElement<FindAllAgent>(_FindAllAgent_QNAME, FindAllAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "AdminLoginResponse")
    public JAXBElement<AdminLoginResponse> createAdminLoginResponse(AdminLoginResponse value) {
        return new JAXBElement<AdminLoginResponse>(_AdminLoginResponse_QNAME, AdminLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "deleteAgent")
    public JAXBElement<DeleteAgent> createDeleteAgent(DeleteAgent value) {
        return new JAXBElement<DeleteAgent>(_DeleteAgent_QNAME, DeleteAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "addAgent")
    public JAXBElement<AddAgent> createAddAgent(AddAgent value) {
        return new JAXBElement<AddAgent>(_AddAgent_QNAME, AddAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "getAgent")
    public JAXBElement<GetAgent> createGetAgent(GetAgent value) {
        return new JAXBElement<GetAgent>(_GetAgent_QNAME, GetAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "getAgentResponse")
    public JAXBElement<GetAgentResponse> createGetAgentResponse(GetAgentResponse value) {
        return new JAXBElement<GetAgentResponse>(_GetAgentResponse_QNAME, GetAgentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAgence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "addAgence")
    public JAXBElement<AddAgence> createAddAgence(AddAgence value) {
        return new JAXBElement<AddAgence>(_AddAgence_QNAME, AddAgence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgenceSOAPDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapService.meriame.com/", name = "AgenceSOAP_DTO")
    public JAXBElement<AgenceSOAPDTO> createAgenceSOAPDTO(AgenceSOAPDTO value) {
        return new JAXBElement<AgenceSOAPDTO>(_AgenceSOAPDTO_QNAME, AgenceSOAPDTO.class, null, value);
    }

}
