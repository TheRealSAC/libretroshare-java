/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsMutex {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsMutex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsMutex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsMutex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsMutex(SWIGTYPE_p_std__string name) {
    this(RetroshareJNI.new_RsMutex(SWIGTYPE_p_std__string.getCPtr(name)), true);
  }

  public void lock() {
    RetroshareJNI.RsMutex_lock(swigCPtr, this);
  }

  public void unlock() {
    RetroshareJNI.RsMutex_unlock(swigCPtr, this);
  }

  public boolean trylock() {
    return RetroshareJNI.RsMutex_trylock(swigCPtr, this);
  }

}