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
 * <p>Java class for SimphonyPosApi_ConfigInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_ConfigInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeObjectNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RVCObjectNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ConfigurationInfo" type="{http://micros-hosting.com/EGateway/}ArrayOfSimphonyPosApi_ConfigInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_ConfigInfoRequest", propOrder = {
    "vendorCode",
    "employeeObjectNumber",
    "rvcObjectNumber",
    "configurationInfo"
})
public class SimphonyPosApiConfigInfoRequest {

    @XmlElement(name = "VendorCode")
    protected String vendorCode;
    @XmlElement(name = "EmployeeObjectNumber")
    protected int employeeObjectNumber;
    @XmlElement(name = "RVCObjectNumber")
    protected int rvcObjectNumber;
    @XmlElement(name = "ConfigurationInfo")
    protected ArrayOfSimphonyPosApiConfigInfo configurationInfo;

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the employeeObjectNumber property.
     * 
     */
    public int getEmployeeObjectNumber() {
        return employeeObjectNumber;
    }

    /**
     * Sets the value of the employeeObjectNumber property.
     * 
     */
    public void setEmployeeObjectNumber(int value) {
        this.employeeObjectNumber = value;
    }

    /**
     * Gets the value of the rvcObjectNumber property.
     * 
     */
    public int getRVCObjectNumber() {
        return rvcObjectNumber;
    }

    /**
     * Sets the value of the rvcObjectNumber property.
     * 
     */
    public void setRVCObjectNumber(int value) {
        this.rvcObjectNumber = value;
    }

    /**
     * Gets the value of the configurationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimphonyPosApiConfigInfo }
     *     
     */
    public ArrayOfSimphonyPosApiConfigInfo getConfigurationInfo() {
        return configurationInfo;
    }

    /**
     * Sets the value of the configurationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimphonyPosApiConfigInfo }
     *     
     */
    public void setConfigurationInfo(ArrayOfSimphonyPosApiConfigInfo value) {
        this.configurationInfo = value;
    }

}
