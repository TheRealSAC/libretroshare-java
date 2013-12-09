/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class CacheId {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CacheId(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CacheId obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_CacheId(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CacheId() {
    this(RetroshareJNI.new_CacheId__SWIG_0(), true);
  }

  public CacheId(int a, int b) {
    this(RetroshareJNI.new_CacheId__SWIG_1(a, b), true);
  }

  public void setType(int value) {
    RetroshareJNI.CacheId_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return RetroshareJNI.CacheId_type_get(swigCPtr, this);
  }

  public void setSubid(int value) {
    RetroshareJNI.CacheId_subid_set(swigCPtr, this, value);
  }

  public int getSubid() {
    return RetroshareJNI.CacheId_subid_get(swigCPtr, this);
  }

}
