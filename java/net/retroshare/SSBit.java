/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class SSBit {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SSBit(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SSBit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_SSBit(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean load(SWIGTYPE_p_std__string input) {
    return RetroshareJNI.SSBit_load(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(input));
  }

  public SWIGTYPE_p_std__string save() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.SSBit_save(swigCPtr, this), true);
  }

}