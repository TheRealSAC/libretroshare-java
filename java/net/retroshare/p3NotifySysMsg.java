/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3NotifySysMsg {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected p3NotifySysMsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3NotifySysMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3NotifySysMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSysid(long value) {
    RetroshareJNI.p3NotifySysMsg_sysid_set(swigCPtr, this, value);
  }

  public long getSysid() {
    return RetroshareJNI.p3NotifySysMsg_sysid_get(swigCPtr, this);
  }

  public void setType(long value) {
    RetroshareJNI.p3NotifySysMsg_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return RetroshareJNI.p3NotifySysMsg_type_get(swigCPtr, this);
  }

  public void setTitle(SWIGTYPE_p_std__string value) {
    RetroshareJNI.p3NotifySysMsg_title_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getTitle() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3NotifySysMsg_title_get(swigCPtr, this), true);
  }

  public void setMsg(SWIGTYPE_p_std__string value) {
    RetroshareJNI.p3NotifySysMsg_msg_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMsg() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3NotifySysMsg_msg_get(swigCPtr, this), true);
  }

  public p3NotifySysMsg() {
    this(RetroshareJNI.new_p3NotifySysMsg(), true);
  }

}
