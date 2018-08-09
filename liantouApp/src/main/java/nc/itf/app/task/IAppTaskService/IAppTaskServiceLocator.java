/**
 * IAppTaskServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nc.itf.app.task.IAppTaskService;

public class IAppTaskServiceLocator extends org.apache.axis.client.Service implements nc.itf.app.task.IAppTaskService.IAppTaskService {

    public IAppTaskServiceLocator() {
    }


    public IAppTaskServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IAppTaskServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IAppTaskServiceSOAP11port_http
    private java.lang.String IAppTaskServiceSOAP11port_http_address = "http://192.168.10.14:9002/uapws/service/IAppTaskService";

    public java.lang.String getIAppTaskServiceSOAP11port_httpAddress() {
        return IAppTaskServiceSOAP11port_http_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IAppTaskServiceSOAP11port_httpWSDDServiceName = "IAppTaskServiceSOAP11port_http";

    public java.lang.String getIAppTaskServiceSOAP11port_httpWSDDServiceName() {
        return IAppTaskServiceSOAP11port_httpWSDDServiceName;
    }

    public void setIAppTaskServiceSOAP11port_httpWSDDServiceName(java.lang.String name) {
        IAppTaskServiceSOAP11port_httpWSDDServiceName = name;
    }

    public nc.itf.app.task.IAppTaskService.IAppTaskServicePortType getIAppTaskServiceSOAP11port_http() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IAppTaskServiceSOAP11port_http_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIAppTaskServiceSOAP11port_http(endpoint);
    }

    public nc.itf.app.task.IAppTaskService.IAppTaskServicePortType getIAppTaskServiceSOAP11port_http(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            nc.itf.app.task.IAppTaskService.IAppTaskServiceSOAP11BindingStub _stub = new nc.itf.app.task.IAppTaskService.IAppTaskServiceSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getIAppTaskServiceSOAP11port_httpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIAppTaskServiceSOAP11port_httpEndpointAddress(java.lang.String address) {
        IAppTaskServiceSOAP11port_http_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (nc.itf.app.task.IAppTaskService.IAppTaskServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                nc.itf.app.task.IAppTaskService.IAppTaskServiceSOAP11BindingStub _stub = new nc.itf.app.task.IAppTaskService.IAppTaskServiceSOAP11BindingStub(new java.net.URL(IAppTaskServiceSOAP11port_http_address), this);
                _stub.setPortName(getIAppTaskServiceSOAP11port_httpWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IAppTaskServiceSOAP11port_http".equals(inputPortName)) {
            return getIAppTaskServiceSOAP11port_http();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://task.app.itf.nc/IAppTaskService", "IAppTaskService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://task.app.itf.nc/IAppTaskService", "IAppTaskServiceSOAP11port_http"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IAppTaskServiceSOAP11port_http".equals(portName)) {
            setIAppTaskServiceSOAP11port_httpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
