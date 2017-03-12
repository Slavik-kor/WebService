package edu.epam.service.ws;

public class ServiceWSProxy implements edu.epam.service.ws.ServiceWS {
  private String _endpoint = null;
  private edu.epam.service.ws.ServiceWS serviceWS = null;
  
  public ServiceWSProxy() {
    _initServiceWSProxy();
  }
  
  public ServiceWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceWSProxy();
  }
  
  private void _initServiceWSProxy() {
    try {
      serviceWS = (new edu.epam.service.ws.ServiceWSServiceLocator()).getServiceWSPort();
      if (serviceWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceWS != null)
      ((javax.xml.rpc.Stub)serviceWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.epam.service.ws.ServiceWS getServiceWS() {
    if (serviceWS == null)
      _initServiceWSProxy();
    return serviceWS;
  }
  
  
}