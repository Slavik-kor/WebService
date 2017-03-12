/**
 * ServiceWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.epam.service.ws;

public interface ServiceWSService extends javax.xml.rpc.Service {
    public java.lang.String getServiceWSPortAddress();

    public edu.epam.service.ws.ServiceWS getServiceWSPort() throws javax.xml.rpc.ServiceException;

    public edu.epam.service.ws.ServiceWS getServiceWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
