
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
 * <p>Classe Java pour client complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="client">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soapService.meriame.com/}user">
 *       &lt;sequence>
 *         &lt;element name="adhesionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="agence" type="{http://soapService.meriame.com/}agence" minOccurs="0"/>
 *         &lt;element name="agent" type="{http://soapService.meriame.com/}agent" minOccurs="0"/>
 *         &lt;element name="comptes" type="{http://soapService.meriame.com/}compte" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "adhesionDate",
    "agence",
    "agent",
    "comptes"
})
public class Client
    extends User
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adhesionDate;
    protected Agence agence;
    protected Agent agent;
    @XmlElement(nillable = true)
    protected List<Compte> comptes;

    /**
     * Obtient la valeur de la propriété adhesionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdhesionDate() {
        return adhesionDate;
    }

    /**
     * Définit la valeur de la propriété adhesionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdhesionDate(XMLGregorianCalendar value) {
        this.adhesionDate = value;
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
     * Obtient la valeur de la propriété agent.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Définit la valeur de la propriété agent.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setAgent(Agent value) {
        this.agent = value;
    }

    /**
     * Gets the value of the comptes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comptes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComptes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compte }
     * 
     * 
     */
    public List<Compte> getComptes() {
        if (comptes == null) {
            comptes = new ArrayList<Compte>();
        }
        return this.comptes;
    }

}
