/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsMsgItem extends RsItem {
  private long swigCPtr;

  protected RsGxsMsgItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsMsgItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsMsgItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsMsgItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setMeta(RsMsgMetaData value) {
    RetroshareJNI.RsGxsMsgItem_meta_set(swigCPtr, this, RsMsgMetaData.getCPtr(value), value);
  }

  public RsMsgMetaData getMeta() {
    long cPtr = RetroshareJNI.RsGxsMsgItem_meta_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsMsgMetaData(cPtr, false);
  }

}