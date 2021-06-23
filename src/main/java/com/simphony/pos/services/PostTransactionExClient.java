package com.simphony.pos.services;

import com.simphony.pos.client.PostTransactionEx2;
import com.simphony.pos.client.PostTransactionEx2Response;
import com.simphony.pos.client.PostTransactionExResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@Slf4j
public class PostTransactionExClient extends WebServiceGatewaySupport {
    org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PostTransactionExClient.class);
    private static final String DEFAULT_NS = "xmlns:SOAP-ENV";
    private static final String SOAP_ENV_NAMESPACE = "http://schemas.xmlsoap.org/soap/envelope/";
    private static final String PREFERRED_PREFIX = "soap";
    private static final String HEADER_LOCAL_NAME = "Header";
    private static final String BODY_LOCAL_NAME = "Body";
    private static final String FAULT_LOCAL_NAME = "Fault";
    public PostTransactionEx2Response postTransaction(PostTransactionEx2 postTransactionEx){
        LOGGER.info("Came here to call the service of Micros Simphony {} ", postTransactionEx);
        return (PostTransactionEx2Response)   getWebServiceTemplate().marshalSendAndReceive("http://192.168.1.104:8080/EGateway/SimphonyPosApiWeb.asmx",postTransactionEx, webServiceMessage -> {
            SoapMessage soapMessage = (SoapMessage) webServiceMessage;
            soapMessage.setSoapAction("http://micros-hosting.com/EGateway/PostTransactionEx2");
           alterSoapEnvelope((SaajSoapMessage) soapMessage);
        });

       /*(PostTransactionExResponse)  getWebServiceTemplate().marshalSendAndReceive("http://192.168.1.104:8080/EGateway/SimphonyPosApiWeb.asmx",
              postTransactionEx,new SoapActionCallback("http://micros-hosting.com/EGateway/PostTransactionEx2"));*/
    }

    private void alterSoapEnvelope(SaajSoapMessage soapResponse) {
        Document doc = soapResponse.getDocument();
        Element rootElement = doc.getDocumentElement();
        rootElement.setPrefix(PREFERRED_PREFIX);
        // Remove default SOAP namespace
        rootElement.removeAttribute(DEFAULT_NS);
        NodeList headerNodes = doc.getElementsByTagNameNS(SOAP_ENV_NAMESPACE, HEADER_LOCAL_NAME);
        NodeList bodyNodes = doc.getElementsByTagNameNS(SOAP_ENV_NAMESPACE, BODY_LOCAL_NAME);
        NodeList faultNodes = doc.getElementsByTagNameNS(SOAP_ENV_NAMESPACE, FAULT_LOCAL_NAME);
        // Remove Header node.
        if (headerNodes.getLength() != 0) {
            rootElement.removeChild(headerNodes.item(0));
        }
        // Change Body's SOAP namespace prefix.
        if (bodyNodes.getLength() != 0) {
            Element bodyElement = (Element) bodyNodes.item(0);
            bodyElement.setPrefix(PREFERRED_PREFIX);
        }
        if (faultNodes.getLength() != 0) {
            Element faultElement = (Element) faultNodes.item(0);
            faultElement.setPrefix(PREFERRED_PREFIX);
        }
    }

}
