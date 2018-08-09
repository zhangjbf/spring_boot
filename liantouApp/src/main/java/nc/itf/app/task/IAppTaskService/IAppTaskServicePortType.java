/**
 * IAppTaskServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nc.itf.app.task.IAppTaskService;

public interface IAppTaskServicePortType extends java.rmi.Remote {
    public java.lang.String queryBillJson(java.lang.String string, java.lang.String string1) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String getTaskButtonList(java.lang.String string, java.lang.String string1) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String doAgree(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String doDisAgree(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String doAddApprover(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String doReject(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String doReassign(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
    public java.lang.String getMessageAttachment(java.lang.String string, java.lang.String string1, java.lang.String string2, java.lang.String string3, java.lang.String string4) throws java.rmi.RemoteException, nc.uap.ws.lang.Exception;
}
