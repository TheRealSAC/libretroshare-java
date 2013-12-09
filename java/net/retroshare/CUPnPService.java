/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class CUPnPService {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CUPnPService(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CUPnPService obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_CUPnPService(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPropertyMap(SWIGTYPE_p_std__mapT_std__string_std__string_t value) {
    RetroshareJNI.CUPnPService_propertyMap_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_std__string_t getPropertyMap() {
    return new SWIGTYPE_p_std__mapT_std__string_std__string_t(RetroshareJNI.CUPnPService_propertyMap_get(swigCPtr, this), true);
  }

  public CUPnPService(CUPnPControlPoint upnpControlPoint, CUPnPLib upnpLib, SWIGTYPE_p_IXML_Element service, SWIGTYPE_p_std__string URLBase) {
    this(RetroshareJNI.new_CUPnPService(CUPnPControlPoint.getCPtr(upnpControlPoint), upnpControlPoint, CUPnPLib.getCPtr(upnpLib), upnpLib, SWIGTYPE_p_IXML_Element.getCPtr(service), SWIGTYPE_p_std__string.getCPtr(URLBase)), true);
  }

  public SWIGTYPE_p_std__string GetServiceType() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetServiceType(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetServiceId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetServiceId(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetSCPDURL() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetSCPDURL(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetAbsSCPDURL() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetAbsSCPDURL(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetControlURL() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetControlURL(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetEventSubURL() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetEventSubURL(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetAbsControlURL() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetAbsControlURL(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetAbsEventSubURL() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetAbsEventSubURL(swigCPtr, this), false);
  }

  public int GetTimeout() {
    return RetroshareJNI.CUPnPService_GetTimeout(swigCPtr, this);
  }

  public void SetTimeout(int t) {
    RetroshareJNI.CUPnPService_SetTimeout(swigCPtr, this, t);
  }

  public SWIGTYPE_p_int GetTimeoutAddr() {
    long cPtr = RetroshareJNI.CUPnPService_GetTimeoutAddr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public String GetSID() {
    return RetroshareJNI.CUPnPService_GetSID(swigCPtr, this);
  }

  public void SetSID(String s) {
    RetroshareJNI.CUPnPService_SetSID(swigCPtr, this, s);
  }

  public SWIGTYPE_p_std__string GetKey() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetKey(swigCPtr, this), false);
  }

  public boolean IsSubscribed() {
    return RetroshareJNI.CUPnPService_IsSubscribed(swigCPtr, this);
  }

  public void SetSCPD(CUPnPSCPD SCPD) {
    RetroshareJNI.CUPnPService_SetSCPD(swigCPtr, this, CUPnPSCPD.getCPtr(SCPD), SCPD);
  }

  public boolean Execute(SWIGTYPE_p_std__string ActionName, SWIGTYPE_p_std__vectorT_CUPnPArgumentValue_t ArgValue) {
    return RetroshareJNI.CUPnPService_Execute(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ActionName), SWIGTYPE_p_std__vectorT_CUPnPArgumentValue_t.getCPtr(ArgValue));
  }

  public SWIGTYPE_p_std__string GetStateVariable(SWIGTYPE_p_std__string stateVariableName) {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPService_GetStateVariable(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(stateVariableName)), true);
  }

}
