/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNxsItem extends RsItem {
  private long swigCPtr;

  protected RsNxsItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsNxsItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNxsItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNxsItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void clear() {
    RetroshareJNI.RsNxsItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsNxsItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsNxsItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setTransactionNumber(long value) {
    RetroshareJNI.RsNxsItem_transactionNumber_set(swigCPtr, this, value);
  }

  public long getTransactionNumber() {
    return RetroshareJNI.RsNxsItem_transactionNumber_get(swigCPtr, this);
  }

}