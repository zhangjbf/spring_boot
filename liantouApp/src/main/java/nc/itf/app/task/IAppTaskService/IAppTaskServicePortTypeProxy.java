package nc.itf.app.task.IAppTaskService;

public class IAppTaskServicePortTypeProxy implements nc.itf.app.task.IAppTaskService.IAppTaskServicePortType {
  private String _endpoint = null;
  private nc.itf.app.task.IAppTaskService.IAppTaskServicePortType iAppTaskServicePortType = null;
  
  public IAppTaskServicePortTypeProxy() {
    _initIAppTaskServicePortTypeProxy();
  }
  
  public IAppTaskServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAppTaskServicePortTypeProxy();
  }
  
  private void _initIAppTaskServicePortTypeProxy() {
    try {
      iAppTaskServicePortType = (new nc.itf.app.task.IAppTaskService.IAppTaskServiceLocator()).getIAppTaskServiceSOAP11port_http();
      if (iAppTaskServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAppTaskServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAppTaskServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAppTaskServicePortType != null)
      ((javax.xml.rpc.Stub)iAppTaskServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public nc.itf.app.task.IAppTaskService.IAppTaskServicePortType getIAppTaskServicePortType() {
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType;
  }
  
  public java.lang.String queryBillJson(java.lang.String string, java.lang.String string1) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.queryBillJson(string, string1);
  }
  
  public java.lang.String getTaskButtonList(java.lang.String string, java.lang.String string1) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.getTaskButtonList(string, string1);
  }
  
  public java.lang.String doAgree(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.doAgree(string, string1, string2, string3, string4);
  }
  
  public java.lang.String doDisAgree(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.doDisAgree(string, string1, string2, string3, string4);
  }
  
  public java.lang.String doAddApprover(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.doAddApprover(string, string1, string2, string3, string4);
  }
  
  public java.lang.String doReject(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.doReject(string, string1, string2, string3, string4);
  }
  
  public java.lang.String doReassign(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.doReassign(string, string1, string2, string3, string4);
  }
  
  public java.lang.String getMessageAttachment(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception{
    if (iAppTaskServicePortType == null)
      _initIAppTaskServicePortTypeProxy();
    return iAppTaskServicePortType.getMessageAttachment(string, string1, string2, string3, string4);
  }
  
  
}