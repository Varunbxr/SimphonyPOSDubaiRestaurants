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
 * <p>Java class for ArrayOfSimphonyPosApi_CheckSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSimphonyPosApi_CheckSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SimphonyPosApi_CheckSummary" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_CheckSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSimphonyPosApi_CheckSummary", propOrder = {
    "simphonyPosApiCheckSummary"
})
public class ArrayOfSimphonyPosApiCheckSummary {

    @XmlElement(name = "SimphonyPosApi_CheckSummary", nillable = true)
    protected List<SimphonyPosApiCheckSummary> simphonyPosApiCheckSummary;

    /**
     * Gets the value of the simphonyPosApiCheckSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simphonyPosApiCheckSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimphonyPosApiCheckSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimphonyPosApiCheckSummary }
     * 
     * 
     */
    public List<SimphonyPosApiCheckSummary> getSimphonyPosApiCheckSummary() {
        if (simphonyPosApiCheckSummary == null) {
            simphonyPosApiCheckSummary = new ArrayList<SimphonyPosApiCheckSummary>();
        }
        return this.simphonyPosApiCheckSummary;
    }

}
