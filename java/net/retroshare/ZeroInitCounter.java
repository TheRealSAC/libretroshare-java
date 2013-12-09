/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ZeroInitCounter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ZeroInitCounter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroInitCounter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ZeroInitCounter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ZeroInitCounter() {
    this(RetroshareJNI.new_ZeroInitCounter(), true);
  }

  public void setCnt(long value) {
    RetroshareJNI.ZeroInitCounter_cnt_set(swigCPtr, this, value);
  }

  public long getCnt() {
    return RetroshareJNI.ZeroInitCounter_cnt_get(swigCPtr, this);
  }

}
