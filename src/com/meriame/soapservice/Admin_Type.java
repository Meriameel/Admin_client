
package com.meriame.soapservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour admin complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="admin">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soapService.meriame.com/}user">
 *       &lt;sequence>
 *         &lt;element name="agences" type="{http://soapService.meriame.com/}agence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agents" type="{http://soapService.meriame.com/}agent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admin", propOrder = {
    "agences",
    "agents"
})
public class Admin_Type
    extends User
{

    @XmlElement(nillable = true)
    protected List<Agence> agences;
    @XmlElement(nillable = true)
    protected List<Agent> agents;

    /**
     * Gets the value of the agences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agence }
     * 
     * 
     */
    public List<Agence> getAgences() {
        if (agences == null) {
            agences = new ArrayList<Agence>();
        }
        return this.agences;
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

}
