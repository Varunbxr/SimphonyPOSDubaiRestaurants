//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 02:11:47 AM IST 
//


package com.simphony.pos.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ppJobStatus" type="{http://micros-hosting.com/EGateway/}SimphonyPrintApi_PrintJobStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ppJobStatus"
})
@XmlRootElement(name = "CheckPrintJobStatusResponse")
public class CheckPrintJobStatusResponse {

    protected SimphonyPrintApiPrintJobStatus ppJobStatus;

    /**
     * Gets the value of the ppJobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPrintApiPrintJobStatus }
     *     
     */
    public SimphonyPrintApiPrintJobStatus getPpJobStatus() {
        return ppJobStatus;
    }

    /**
     * Sets the value of the ppJobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPrintApiPrintJobStatus }
     *     
     */
    public void setPpJobStatus(SimphonyPrintApiPrintJobStatus value) {
        this.ppJobStatus = value;
    }

}
