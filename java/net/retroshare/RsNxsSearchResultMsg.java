/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNxsSearchResultMsg {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsNxsSearchResultMsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNxsSearchResultMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNxsSearchResultMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsNxsSearchResultMsg() {
    this(RetroshareJNI.new_RsNxsSearchResultMsg(), true);
  }

  public void clear() {
    RetroshareJNI.RsNxsSearchResultMsg_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int arg1) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsNxsSearchResultMsg_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), arg1), false);
  }

  public void setToken(long value) {
    RetroshareJNI.RsNxsSearchResultMsg_token_set(swigCPtr, this, value);
  }

  public long getToken() {
    return RetroshareJNI.RsNxsSearchResultMsg_token_get(swigCPtr, this);
  }

  public void setContext(RsTlvBinaryData value) {
    RetroshareJNI.RsNxsSearchResultMsg_context_set(swigCPtr, this, RsTlvBinaryData.getCPtr(value), value);
  }

  public RsTlvBinaryData getContext() {
    long cPtr = RetroshareJNI.RsNxsSearchResultMsg_context_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvBinaryData(cPtr, false);
  }

  public void setMsgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsNxsSearchResultMsg_msgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMsgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsNxsSearchResultMsg_msgId_get(swigCPtr, this), true);
  }

  public void setGrpId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsNxsSearchResultMsg_grpId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGrpId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsNxsSearchResultMsg_grpId_get(swigCPtr, this), true);
  }

  public void setIdSign(RsTlvKeySignature value) {
    RetroshareJNI.RsNxsSearchResultMsg_idSign_set(swigCPtr, this, RsTlvKeySignature.getCPtr(value), value);
  }

  public RsTlvKeySignature getIdSign() {
    long cPtr = RetroshareJNI.RsNxsSearchResultMsg_idSign_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvKeySignature(cPtr, false);
  }

  public void setExpiration(long value) {
    RetroshareJNI.RsNxsSearchResultMsg_expiration_set(swigCPtr, this, value);
  }

  public long getExpiration() {
    return RetroshareJNI.RsNxsSearchResultMsg_expiration_get(swigCPtr, this);
  }

}