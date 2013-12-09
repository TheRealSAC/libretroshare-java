/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsStatusItem extends RsItem {
  private long swigCPtr;

  protected RsStatusItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsStatusItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsStatusItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsStatusItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsStatusItem() {
    this(RetroshareJNI.new_RsStatusItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsStatusItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsStatusItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsStatusItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setSendTime(long value) {
    RetroshareJNI.RsStatusItem_sendTime_set(swigCPtr, this, value);
  }

  public long getSendTime() {
    return RetroshareJNI.RsStatusItem_sendTime_get(swigCPtr, this);
  }

  public void setStatus(long value) {
    RetroshareJNI.RsStatusItem_status_set(swigCPtr, this, value);
  }

  public long getStatus() {
    return RetroshareJNI.RsStatusItem_status_get(swigCPtr, this);
  }

  public void setRecvTime(long value) {
    RetroshareJNI.RsStatusItem_recvTime_set(swigCPtr, this, value);
  }

  public long getRecvTime() {
    return RetroshareJNI.RsStatusItem_recvTime_get(swigCPtr, this);
  }

}
