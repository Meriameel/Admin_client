
package com.meriame.soapservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="compte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://soapService.meriame.com/}client" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCompte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="versementdest" type="{http://soapService.meriame.com/}versement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="versementsour" type="{http://soapService.meriame.com/}versement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "client",
    "etat",
    "idCompte",
    "solde",
    "versementdest",
    "versementsour"
})
public class Compte {

    protected Client client;
    protected String etat;
    protected Long idCompte;
    protected double solde;
    @XmlElement(nillable = true)
    protected List<Versement> versementdest;
    @XmlElement(nillable = true)
    protected List<Versement> versementsour;

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété idCompte.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCompte() {
        return idCompte;
    }

    /**
     * Définit la valeur de la propriété idCompte.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCompte(Long value) {
        this.idCompte = value;
    }

    /**
     * Obtient la valeur de la propriété solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Gets the value of the versementdest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versementdest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersementdest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Versement }
     * 
     * 
     */
    public List<Versement> getVersementdest() {
        if (versementdest == null) {
            versementdest = new ArrayList<Versement>();
        }
        return this.versementdest;
    }

    /**
     * Gets the value of the versementsour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versementsour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersementsour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Versement }
     * 
     * 
     */
    public List<Versement> getVersementsour() {
        if (versementsour == null) {
            versementsour = new ArrayList<Versement>();
        }
        return this.versementsour;
    }

}
