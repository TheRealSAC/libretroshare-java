/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsDsdvTableEntry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDsdvTableEntry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDsdvTableEntry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsDsdvTableEntry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMDest(RsDsdvId value) {
    RetroshareJNI.RsDsdvTableEntry_mDest_set(swigCPtr, this, RsDsdvId.getCPtr(value), value);
  }

  public RsDsdvId getMDest() {
    long cPtr = RetroshareJNI.RsDsdvTableEntry_mDest_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsDsdvId(cPtr, false);
  }

  public void setMIsStable(boolean value) {
    RetroshareJNI.RsDsdvTableEntry_mIsStable_set(swigCPtr, this, value);
  }

  public boolean getMIsStable() {
    return RetroshareJNI.RsDsdvTableEntry_mIsStable_get(swigCPtr, this);
  }

  public void setMStableRoute(RsDsdvRoute value) {
    RetroshareJNI.RsDsdvTableEntry_mStableRoute_set(swigCPtr, this, RsDsdvRoute.getCPtr(value), value);
  }

  public RsDsdvRoute getMStableRoute() {
    long cPtr = RetroshareJNI.RsDsdvTableEntry_mStableRoute_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsDsdvRoute(cPtr, false);
  }

  public void setMAllRoutes(SWIGTYPE_p_std__mapT_std__string_RsDsdvRoute_t value) {
    RetroshareJNI.RsDsdvTableEntry_mAllRoutes_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_RsDsdvRoute_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_RsDsdvRoute_t getMAllRoutes() {
    long cPtr = RetroshareJNI.RsDsdvTableEntry_mAllRoutes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_std__string_RsDsdvRoute_t(cPtr, false);
  }

  public void setMFlags(long value) {
    RetroshareJNI.RsDsdvTableEntry_mFlags_set(swigCPtr, this, value);
  }

  public long getMFlags() {
    return RetroshareJNI.RsDsdvTableEntry_mFlags_get(swigCPtr, this);
  }

  public void setMMatchedHash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsDsdvTableEntry_mMatchedHash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMMatchedHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsDsdvTableEntry_mMatchedHash_get(swigCPtr, this), true);
  }

  public void setMMatched(boolean value) {
    RetroshareJNI.RsDsdvTableEntry_mMatched_set(swigCPtr, this, value);
  }

  public boolean getMMatched() {
    return RetroshareJNI.RsDsdvTableEntry_mMatched_get(swigCPtr, this);
  }

  public void setMOwnSource(boolean value) {
    RetroshareJNI.RsDsdvTableEntry_mOwnSource_set(swigCPtr, this, value);
  }

  public boolean getMOwnSource() {
    return RetroshareJNI.RsDsdvTableEntry_mOwnSource_get(swigCPtr, this);
  }

  public RsDsdvTableEntry() {
    this(RetroshareJNI.new_RsDsdvTableEntry(), true);
  }

}
