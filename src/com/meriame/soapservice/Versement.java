
package com.meriame.soapservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour versement complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="versement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmptDestination" type="{http://soapService.meriame.com/}compte" minOccurs="0"/>
 *         &lt;element name="cmptSource" type="{http://soapService.meriame.com/}compte" minOccurs="0"/>
 *         &lt;element name="dateTransaction" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "versement", propOrder = {
    "cmptDestination",
    "cmptSource",
    "dateTransaction",
    "id",
    "montant"
})
public class Versement {

    protected Compte cmptDestination;
    protected Compte cmptSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTransaction;
    protected Long id;
    protected double montant;

    /**
     * Obtient la valeur de la propri�t� cmptDestination.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getCmptDestination() {
        return cmptDestination;
    }

    /**
     * D�finit la valeur de la propri�t� cmptDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setCmptDestination(Compte value) {
        this.cmptDestination = value;
    }

    /**
     * Obtient la valeur de la propri�t� cmptSource.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getCmptSource() {
        return cmptSource;
    }

    /**
     * D�finit la valeur de la propri�t� cmptSource.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setCmptSource(Compte value) {
        this.cmptSource = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateTransaction.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTransaction() {
        return dateTransaction;
    }

    /**
     * D�finit la valeur de la propri�t� dateTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTransaction(XMLGregorianCalendar value) {
        this.dateTransaction = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
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
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * D�finit la valeur de la propri�t� montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

}
