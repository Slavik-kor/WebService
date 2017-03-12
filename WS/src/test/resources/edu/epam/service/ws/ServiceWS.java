
package edu.epam.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ServiceWS", targetNamespace = "http://ws.service.epam.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceWS {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://ws.service.epam.edu/", className = "edu.epam.service.ws.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://ws.service.epam.edu/", className = "edu.epam.service.ws.TestResponse")
    @Action(input = "http://ws.service.epam.edu/ServiceWS/testRequest", output = "http://ws.service.epam.edu/ServiceWS/testResponse")
    public String test();

}
