package com.github.mkalin.jwsur2.ch5.images.mtom.client.generated;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SkiImageServiceService", targetNamespace = "http://mtom.images.ch5.jwsur2.mkalin.github.com/", wsdlLocation = "http://localhost:8080/jwsur2-ch5/images/mtom?wsdl")
@HandlerChain(file = "SkiImageServiceService_handler.xml")
public class SkiImageServiceService extends Service {

    private final static URL SKIIMAGESERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SKIIMAGESERVICESERVICE_EXCEPTION;
    private final static QName SKIIMAGESERVICESERVICE_QNAME = new QName(
	    "http://mtom.images.ch5.jwsur2.mkalin.github.com/",
	    "SkiImageServiceService");

    static {
	URL url = null;
	WebServiceException e = null;
	try {
	    url = new URL("http://localhost:8080/jwsur2-ch5/images/mtom?wsdl");
	} catch (MalformedURLException ex) {
	    e = new WebServiceException(ex);
	}
	SKIIMAGESERVICESERVICE_WSDL_LOCATION = url;
	SKIIMAGESERVICESERVICE_EXCEPTION = e;
    }

    public SkiImageServiceService() {
	super(__getWsdlLocation(), SKIIMAGESERVICESERVICE_QNAME);
    }

    public SkiImageServiceService(WebServiceFeature... features) {
	super(__getWsdlLocation(), SKIIMAGESERVICESERVICE_QNAME, features);
    }

    public SkiImageServiceService(URL wsdlLocation) {
	super(wsdlLocation, SKIIMAGESERVICESERVICE_QNAME);
    }

    public SkiImageServiceService(URL wsdlLocation,
	    WebServiceFeature... features) {
	super(wsdlLocation, SKIIMAGESERVICESERVICE_QNAME, features);
    }

    public SkiImageServiceService(URL wsdlLocation, QName serviceName) {
	super(wsdlLocation, serviceName);
    }

    public SkiImageServiceService(URL wsdlLocation, QName serviceName,
	    WebServiceFeature... features) {
	super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return returns SkiImageService
     */
    @WebEndpoint(name = "SkiImageServicePort")
    public SkiImageService getSkiImageServicePort() {
	return super.getPort(new QName(
		"http://mtom.images.ch5.jwsur2.mkalin.github.com/",
		"SkiImageServicePort"), SkiImageService.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
     *            on the proxy. Supported features not in the
     *            <code>features</code> parameter will have their default
     *            values.
     * @return returns SkiImageService
     */
    @WebEndpoint(name = "SkiImageServicePort")
    public SkiImageService getSkiImageServicePort(WebServiceFeature... features) {
	return super.getPort(new QName(
		"http://mtom.images.ch5.jwsur2.mkalin.github.com/",
		"SkiImageServicePort"), SkiImageService.class, features);
    }

    private static URL __getWsdlLocation() {
	if (SKIIMAGESERVICESERVICE_EXCEPTION != null) {
	    throw SKIIMAGESERVICESERVICE_EXCEPTION;
	}
	return SKIIMAGESERVICESERVICE_WSDL_LOCATION;
    }

}
