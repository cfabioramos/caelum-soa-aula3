
package br.com.caelum.estoque.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EstoqueWSService", targetNamespace = "http://caelum.com.br/estoque/v1", wsdlLocation = "http://localhost:8080/fj36-webservice/EstoqueWS?wsdl")
public class EstoqueWSService
    extends Service
{

    private final static URL ESTOQUEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ESTOQUEWSSERVICE_EXCEPTION;
    private final static QName ESTOQUEWSSERVICE_QNAME = new QName("http://caelum.com.br/estoque/v1", "EstoqueWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/fj36-webservice/EstoqueWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ESTOQUEWSSERVICE_WSDL_LOCATION = url;
        ESTOQUEWSSERVICE_EXCEPTION = e;
    }

    public EstoqueWSService() {
        super(__getWsdlLocation(), ESTOQUEWSSERVICE_QNAME);
    }

    public EstoqueWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ESTOQUEWSSERVICE_QNAME, features);
    }

    public EstoqueWSService(URL wsdlLocation) {
        super(wsdlLocation, ESTOQUEWSSERVICE_QNAME);
    }

    public EstoqueWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ESTOQUEWSSERVICE_QNAME, features);
    }

    public EstoqueWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EstoqueWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort() {
        return super.getPort(new QName("http://caelum.com.br/estoque/v1", "EstoqueWSPort"), EstoqueWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EstoqueWS
     */
    @WebEndpoint(name = "EstoqueWSPort")
    public EstoqueWS getEstoqueWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://caelum.com.br/estoque/v1", "EstoqueWSPort"), EstoqueWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ESTOQUEWSSERVICE_EXCEPTION!= null) {
            throw ESTOQUEWSSERVICE_EXCEPTION;
        }
        return ESTOQUEWSSERVICE_WSDL_LOCATION;
    }

}
