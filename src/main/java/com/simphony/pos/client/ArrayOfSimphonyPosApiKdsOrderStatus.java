//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 02:11:47 AM IST 
//


package com.simphony.pos.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSimphonyPosApi_KdsOrderStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSimphonyPosApi_KdsOrderStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SimphonyPosApi_KdsOrderStatus" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_KdsOrderStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSimphonyPosApi_KdsOrderStatus", propOrder = {
    "simphonyPosApiKdsOrderStatus"
})
public class ArrayOfSimphonyPosApiKdsOrderStatus {

    @XmlElement(name = "SimphonyPosApi_KdsOrderStatus", nillable = true)
    protected List<SimphonyPosApiKdsOrderStatus> simphonyPosApiKdsOrderStatus;

    /**
     * Gets the value of the simphonyPosApiKdsOrderStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simphonyPosApiKdsOrderStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimphonyPosApiKdsOrderStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimphonyPosApiKdsOrderStatus }
     * 
     * 
     */
    public List<SimphonyPosApiKdsOrderStatus> getSimphonyPosApiKdsOrderStatus() {
        if (simphonyPosApiKdsOrderStatus == null) {
            simphonyPosApiKdsOrderStatus = new ArrayList<SimphonyPosApiKdsOrderStatus>();
        }
        return this.simphonyPosApiKdsOrderStatus;
    }

}
