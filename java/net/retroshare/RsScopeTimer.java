/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsScopeTimer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsScopeTimer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsScopeTimer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsScopeTimer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsScopeTimer(SWIGTYPE_p_std__string name) {
    this(RetroshareJNI.new_RsScopeTimer(SWIGTYPE_p_std__string.getCPtr(name)), true);
  }

}
