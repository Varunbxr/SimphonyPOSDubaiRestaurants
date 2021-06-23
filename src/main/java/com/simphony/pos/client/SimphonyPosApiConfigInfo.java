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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimphonyPosApi_ConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_ConfigInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigurationInfoTypeID" type="{http://micros-hosting.com/EGateway/}EConfigurationInfoType"/&gt;
 *         &lt;element name="StartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaxRecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_ConfigInfo", propOrder = {
    "configurationInfoTypeID",
    "startIndex",
    "maxRecordCount"
})
public class SimphonyPosApiConfigInfo {

    @XmlElement(name = "ConfigurationInfoTypeID", required = true)
    @XmlSchemaType(name = "string")
    protected EConfigurationInfoType configurationInfoTypeID;
    @XmlElement(name = "StartIndex")
    protected int startIndex;
    @XmlElement(name = "MaxRecordCount")
    protected int maxRecordCount;

    /**
     * Gets the value of the configurationInfoTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link EConfigurationInfoType }
     *     
     */
    public EConfigurationInfoType getConfigurationInfoTypeID() {
        return configurationInfoTypeID;
    }

    /**
     * Sets the value of the configurationInfoTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EConfigurationInfoType }
     *     
     */
    public void setConfigurationInfoTypeID(EConfigurationInfoType value) {
        this.configurationInfoTypeID = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the maxRecordCount property.
     * 
     */
    public int getMaxRecordCount() {
        return maxRecordCount;
    }

    /**
     * Sets the value of the maxRecordCount property.
     * 
     */
    public void setMaxRecordCount(int value) {
        this.maxRecordCount = value;
    }

}