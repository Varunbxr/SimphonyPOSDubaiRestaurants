package com.simphony.pos.config;

import com.simphony.pos.services.PostTransactionExClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

@Configuration
public class SoapClientConfig {


    @Bean
    public SaajSoapMessageFactory messageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_12);
        messageFactory.afterPropertiesSet();
        return messageFactory;
    }

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("com.simphony.pos.client");
        return jaxb2Marshaller;
    }

    @Bean
    public PostTransactionExClient postTransactionClient(Jaxb2Marshaller jaxb2Marshaller) {
        PostTransactionExClient transactionExClient = new PostTransactionExClient();
        transactionExClient.setDefaultUri("http://micros-hosting.com/EGateway/");
        transactionExClient.setMarshaller(jaxb2Marshaller);
        transactionExClient.setUnmarshaller(jaxb2Marshaller);
        return transactionExClient;
    }

}
