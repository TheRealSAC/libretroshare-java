/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class CUPnPControlPoint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CUPnPControlPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CUPnPControlPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_CUPnPControlPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_WanService(CUPnPService value) {
    RetroshareJNI.CUPnPControlPoint_m_WanService_set(swigCPtr, this, CUPnPService.getCPtr(value), value);
  }

  public CUPnPService getM_WanService() {
    long cPtr = RetroshareJNI.CUPnPControlPoint_m_WanService_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CUPnPService(cPtr, false);
  }

  public void setM_getStateVariableLastResult(SWIGTYPE_p_std__string value) {
    RetroshareJNI.CUPnPControlPoint_m_getStateVariableLastResult_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getM_getStateVariableLastResult() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPControlPoint_m_getStateVariableLastResult_get(swigCPtr, this), true);
  }

  public static void setS_CtrlPoint(CUPnPControlPoint value) {
    RetroshareJNI.CUPnPControlPoint_s_CtrlPoint_set(CUPnPControlPoint.getCPtr(value), value);
  }

  public static CUPnPControlPoint getS_CtrlPoint() {
    long cPtr = RetroshareJNI.CUPnPControlPoint_s_CtrlPoint_get();
    return (cPtr == 0) ? null : new CUPnPControlPoint(cPtr, false);
  }

  public CUPnPControlPoint(int udpPort) {
    this(RetroshareJNI.new_CUPnPControlPoint(udpPort), true);
  }

  public String getInternalIpAddress() {
    return RetroshareJNI.CUPnPControlPoint_getInternalIpAddress(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string getExternalAddress() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPControlPoint_getExternalAddress(swigCPtr, this), true);
  }

  public void Subscribe(CUPnPService service) {
    RetroshareJNI.CUPnPControlPoint_Subscribe(swigCPtr, this, CUPnPService.getCPtr(service), service);
  }

  public void Unsubscribe(CUPnPService service) {
    RetroshareJNI.CUPnPControlPoint_Unsubscribe(swigCPtr, this, CUPnPService.getCPtr(service), service);
  }

  public boolean AddPortMappings(SWIGTYPE_p_std__vectorT_CUPnPPortMapping_t upnpPortMapping) {
    return RetroshareJNI.CUPnPControlPoint_AddPortMappings(swigCPtr, this, SWIGTYPE_p_std__vectorT_CUPnPPortMapping_t.getCPtr(upnpPortMapping));
  }

  public boolean DeletePortMappings(SWIGTYPE_p_std__vectorT_CUPnPPortMapping_t upnpPortMapping) {
    return RetroshareJNI.CUPnPControlPoint_DeletePortMappings(swigCPtr, this, SWIGTYPE_p_std__vectorT_CUPnPPortMapping_t.getCPtr(upnpPortMapping));
  }

  public SWIGTYPE_p_UpnpClient_Handle GetUPnPClientHandle() {
    return new SWIGTYPE_p_UpnpClient_Handle(RetroshareJNI.CUPnPControlPoint_GetUPnPClientHandle(swigCPtr, this), true);
  }

  public boolean GetIGWDeviceDetected() {
    return RetroshareJNI.CUPnPControlPoint_GetIGWDeviceDetected(swigCPtr, this);
  }

  public void SetIGWDeviceDetected(boolean b) {
    RetroshareJNI.CUPnPControlPoint_SetIGWDeviceDetected(swigCPtr, this, b);
  }

  public boolean WanServiceDetected() {
    return RetroshareJNI.CUPnPControlPoint_WanServiceDetected(swigCPtr, this);
  }

  public void SetWanService(CUPnPService service) {
    RetroshareJNI.CUPnPControlPoint_SetWanService(swigCPtr, this, CUPnPService.getCPtr(service), service);
  }

  public static int Callback(SWIGTYPE_p_Upnp_EventType EventType, SWIGTYPE_p_void Event, SWIGTYPE_p_void Cookie) {
    return RetroshareJNI.CUPnPControlPoint_Callback(SWIGTYPE_p_Upnp_EventType.getCPtr(EventType), SWIGTYPE_p_void.getCPtr(Event), SWIGTYPE_p_void.getCPtr(Cookie));
  }

  public void OnEventReceived(SWIGTYPE_p_std__string Sid, int EventKey, SWIGTYPE_p_IXML_Document ChangedVariables) {
    RetroshareJNI.CUPnPControlPoint_OnEventReceived(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(Sid), EventKey, SWIGTYPE_p_IXML_Document.getCPtr(ChangedVariables));
  }

}