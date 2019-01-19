
package com.meriame.soapservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour agent complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="agent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soapService.meriame.com/}user">
 *       &lt;sequence>
 *         &lt;element name="admin" type="{http://soapService.meriame.com/}admin" minOccurs="0"/>
 *         &lt;element name="agence" type="{http://soapService.meriame.com/}agence" minOccurs="0"/>
 *         &lt;element name="clients" type="{http://soapService.meriame.com/}client" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {
    "admin",
    "agence",
    "clients"
})
public class Agent
    extends User
{

    protected Admin_Type admin;
    protected Agence agence;
    @XmlElement(nillable = true)
    protected List<Client> clients;

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
     * Obtient la valeur de la propriété agence.
     * 
     * @return
     *     possible object is
     *     {@link Agence }
     *     
     */
    public Agence getAgence() {
        return agence;
    }

    /**
     * Définit la valeur de la propriété agence.
     * 
     * @param value
     *     allowed object is
     *     {@link Agence }
     *     
     */
    public void setAgence(Agence value) {
        this.agence = value;
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

}
