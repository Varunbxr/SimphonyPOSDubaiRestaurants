//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 02:11:47 AM IST 
//


package com.simphony.pos.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimphonyPosApi_TmedDetailItemEx2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_TmedDetailItemEx2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extensibility" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_Extensibility" minOccurs="0"/&gt;
 *         &lt;element name="TmedEPayment" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_EPaymentEx" minOccurs="0"/&gt;
 *         &lt;element name="TmedObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TmedPartialPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TmedReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_TmedDetailItemEx2", propOrder = {
    "extensibility",
    "tmedEPayment",
    "tmedObjectNum",
    "tmedPartialPayment",
    "tmedReference"
})
public class SimphonyPosApiTmedDetailItemEx2 {

    @XmlElement(name = "Extensibility")
    protected SimphonyPosApiExtensibility extensibility;
    @XmlElement(name = "TmedEPayment")
    protected SimphonyPosApiEPaymentEx tmedEPayment;
    @XmlElement(name = "TmedObjectNum")
    protected int tmedObjectNum;
    @XmlElement(name = "TmedPartialPayment")
    protected String tmedPartialPayment;
    @XmlElement(name = "TmedReference")
    protected String tmedReference;

    /**
     * Gets the value of the extensibility property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiExtensibility }
     *     
     */
    public SimphonyPosApiExtensibility getExtensibility() {
        return extensibility;
    }

    /**
     * Sets the value of the extensibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiExtensibility }
     *     
     */
    public void setExtensibility(SimphonyPosApiExtensibility value) {
        this.extensibility = value;
    }

    /**
     * Gets the value of the tmedEPayment property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiEPaymentEx }
     *     
     */
    public SimphonyPosApiEPaymentEx getTmedEPayment() {
        return tmedEPayment;
    }

    /**
     * Sets the value of the tmedEPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiEPaymentEx }
     *     
     */
    public void setTmedEPayment(SimphonyPosApiEPaymentEx value) {
        this.tmedEPayment = value;
    }

    /**
     * Gets the value of the tmedObjectNum property.
     * 
     */
    public int getTmedObjectNum() {
        return tmedObjectNum;
    }

    /**
     * Sets the value of the tmedObjectNum property.
     * 
     */
    public void setTmedObjectNum(int value) {
        this.tmedObjectNum = value;
    }

    /**
     * Gets the value of the tmedPartialPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmedPartialPayment() {
        return tmedPartialPayment;
    }

    /**
     * Sets the value of the tmedPartialPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmedPartialPayment(String value) {
        this.tmedPartialPayment = value;
    }

    /**
     * Gets the value of the tmedReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmedReference() {
        return tmedReference;
    }

    /**
     * Sets the value of the tmedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmedReference(String value) {
        this.tmedReference = value;
    }

}