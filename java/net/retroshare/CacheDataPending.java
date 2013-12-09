/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class CacheDataPending {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CacheDataPending(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CacheDataPending obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_CacheDataPending(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CacheDataPending(RsCacheData data, boolean local, boolean historical) {
    this(RetroshareJNI.new_CacheDataPending(RsCacheData.getCPtr(data), data, local, historical), true);
  }

  public void setMData(RsCacheData value) {
    RetroshareJNI.CacheDataPending_mData_set(swigCPtr, this, RsCacheData.getCPtr(value), value);
  }

  public RsCacheData getMData() {
    long cPtr = RetroshareJNI.CacheDataPending_mData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsCacheData(cPtr, false);
  }

  public void setMLocal(boolean value) {
    RetroshareJNI.CacheDataPending_mLocal_set(swigCPtr, this, value);
  }

  public boolean getMLocal() {
    return RetroshareJNI.CacheDataPending_mLocal_get(swigCPtr, this);
  }

  public void setMHistorical(boolean value) {
    RetroshareJNI.CacheDataPending_mHistorical_set(swigCPtr, this, value);
  }

  public boolean getMHistorical() {
    return RetroshareJNI.CacheDataPending_mHistorical_get(swigCPtr, this);
  }

}