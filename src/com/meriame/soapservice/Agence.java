
package com.meriame.soapservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour agence complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="agence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admin" type="{http://soapService.meriame.com/}admin" minOccurs="0"/>
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agents" type="{http://soapService.meriame.com/}agent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clients" type="{http://soapService.meriame.com/}client" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datedouverture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agence", propOrder = {
    "admin",
    "adresse",
    "agents",
    "clients",
    "datedouverture",
    "id"
})
public class Agence {

    protected Admin_Type admin;
    protected String adresse;
    @XmlElement(nillable = true)
    protected List<Agent> agents;
    @XmlElement(nillable = true)
    protected List<Client> clients;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datedouverture;
    protected Long id;

    /**
     * Obtient la valeur de la propriété admin.
     * 
     * @return
     *     possible object is
     *     {@link Admin_Type }
     *     
     */
    public Admin_Type getAdmin() {
        return admin;
    }

    /**
     * Définit la valeur de la propriété admin.
     * 
     * @param value
     *     allowed object is
     *     {@link Admin_Type }
     *     
     */
    public void setAdmin(Admin_Type value) {
        this.admin = value;
    }

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the agents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agent }
     * 
     * 
     */
    public List<Agent> getAgents() {
        if (agents == null) {
            agents = new ArrayList<Agent>();
        }
        return this.agents;
    }

    /**
     * Gets the value of the clients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Client }
     * 
     * 
     */
    public List<Client> getClients() {
        if (clients == null) {
            clients = new ArrayList<Client>();
        }
        return this.clients;
    }

    /**
     * Obtient la valeur de la propriété datedouverture.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatedouverture() {
        return datedouverture;
    }

    /**
     * Définit la valeur de la propriété datedouverture.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatedouverture(XMLGregorianCalendar value) {
        this.datedouverture = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
