
package org.tempuri;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSMSWithPriority }
     * 
     */
    public SendSMSWithPriority createSendSMSWithPriority() {
        return new SendSMSWithPriority();
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     * 
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link IsValidCredentials }
     * 
     */
    public IsValidCredentials createIsValidCredentials() {
        return new IsValidCredentials();
    }

    /**
     * Create an instance of {@link SendSMS }
     * 
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link IsValidCredentialsResponse }
     * 
     */
    public IsValidCredentialsResponse createIsValidCredentialsResponse() {
        return new IsValidCredentialsResponse();
    }

    /**
     * Create an instance of {@link SendSMSWithPriorityResponse }
     * 
     */
    public SendSMSWithPriorityResponse createSendSMSWithPriorityResponse() {
        return new SendSMSWithPriorityResponse();
    }

}
