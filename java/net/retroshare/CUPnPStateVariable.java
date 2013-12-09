/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class CUPnPStateVariable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CUPnPStateVariable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CUPnPStateVariable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_CUPnPStateVariable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CUPnPStateVariable(CUPnPControlPoint upnpControlPoint, CUPnPLib upnpLib, SWIGTYPE_p_IXML_Element stateVariable, SWIGTYPE_p_std__string URLBase) {
    this(RetroshareJNI.new_CUPnPStateVariable(CUPnPControlPoint.getCPtr(upnpControlPoint), upnpControlPoint, CUPnPLib.getCPtr(upnpLib), upnpLib, SWIGTYPE_p_IXML_Element.getCPtr(stateVariable), SWIGTYPE_p_std__string.getCPtr(URLBase)), true);
  }

  public SWIGTYPE_p_std__string GetNname() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPStateVariable_GetNname(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetDataType() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPStateVariable_GetDataType(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetDefaultValue() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPStateVariable_GetDefaultValue(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__string GetKey() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.CUPnPStateVariable_GetKey(swigCPtr, this), false);
  }

  public SWIGTYPE_p_CXML_ListT_CUPnPAllowedValue_s_allowedValue_s_allowedValueList_t GetAllowedValueList() {
    return new SWIGTYPE_p_CXML_ListT_CUPnPAllowedValue_s_allowedValue_s_allowedValueList_t(RetroshareJNI.CUPnPStateVariable_GetAllowedValueList(swigCPtr, this), false);
  }

}
