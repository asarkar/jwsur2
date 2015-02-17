package com.github.mkalin.jwsur2.ch5.transportlevel.client.generated;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Echo", targetNamespace = "http://transportlevel.ch5.jwsur2.mkalin.github.com/")
@HandlerChain(file = "Echo_handler.xml")
@XmlSeeAlso({ ObjectFactory.class })
public interface Echo {

    /**
     * 
     * @param arg0
     * @return returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echo", targetNamespace = "http://transportlevel.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.transportlevel.client.generated.Echo_Type")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://transportlevel.ch5.jwsur2.mkalin.github.com/", className = "com.github.mkalin.jwsur2.ch5.transportlevel.client.generated.EchoResponse")
    @Action(input = "http://transportlevel.ch5.jwsur2.mkalin.github.com/Echo/echoRequest", output = "http://transportlevel.ch5.jwsur2.mkalin.github.com/Echo/echoResponse")
    public String echo(
	    @WebParam(name = "arg0", targetNamespace = "") String arg0);

}
