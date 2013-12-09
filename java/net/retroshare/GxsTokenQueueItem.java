/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class GxsTokenQueueItem {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GxsTokenQueueItem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GxsTokenQueueItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_GxsTokenQueueItem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GxsTokenQueueItem(long token, long req_type) {
    this(RetroshareJNI.new_GxsTokenQueueItem__SWIG_0(token, req_type), true);
  }

  public GxsTokenQueueItem() {
    this(RetroshareJNI.new_GxsTokenQueueItem__SWIG_1(), true);
  }

  public void setMToken(long value) {
    RetroshareJNI.GxsTokenQueueItem_mToken_set(swigCPtr, this, value);
  }

  public long getMToken() {
    return RetroshareJNI.GxsTokenQueueItem_mToken_get(swigCPtr, this);
  }

  public void setMReqType(long value) {
    RetroshareJNI.GxsTokenQueueItem_mReqType_set(swigCPtr, this, value);
  }

  public long getMReqType() {
    return RetroshareJNI.GxsTokenQueueItem_mReqType_get(swigCPtr, this);
  }

}
