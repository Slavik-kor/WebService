
package edu.epam.service.ws;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "ServiceWSService", targetNamespace = "http://ws.service.epam.edu/", wsdlLocation = "WEB-INF/wsdl/ServiceWSService.wsdl")
public class ServiceWSService
    extends Service
{

    private final static URL SERVICEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEWSSERVICE_EXCEPTION;
    private final static QName SERVICEWSSERVICE_QNAME = new QName("http://ws.service.epam.edu/", "ServiceWSService");

    static {
            SERVICEWSSERVICE_WSDL_LOCATION = edu.epam.service.ws.ServiceWSService.class.getResource("/WEB-INF/wsdl/ServiceWSService.wsdl");
        WebServiceException e = null;
        if (SERVICEWSSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'WEB-INF/wsdl/ServiceWSService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        SERVICEWSSERVICE_EXCEPTION = e;
    }

    public ServiceWSService() {
        super(__getWsdlLocation(), SERVICEWSSERVICE_QNAME);
    }

    public ServiceWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEWSSERVICE_QNAME, features);
    }

    public ServiceWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEWSSERVICE_QNAME);
    }

    public ServiceWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEWSSERVICE_QNAME, features);
    }

    public ServiceWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceWS
     */
    @WebEndpoint(name = "ServiceWSPort")
    public ServiceWS getServiceWSPort() {
        return super.getPort(new QName("http://ws.service.epam.edu/", "ServiceWSPort"), ServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceWS
     */
    @WebEndpoint(name = "ServiceWSPort")
    public ServiceWS getServiceWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.service.epam.edu/", "ServiceWSPort"), ServiceWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEWSSERVICE_EXCEPTION!= null) {
            throw SERVICEWSSERVICE_EXCEPTION;
        }
        return SERVICEWSSERVICE_WSDL_LOCATION;
    }

}
