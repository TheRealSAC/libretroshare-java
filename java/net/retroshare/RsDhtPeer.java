/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsDhtPeer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDhtPeer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDhtPeer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsDhtPeer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsDhtPeer() {
    this(RetroshareJNI.new_RsDhtPeer(), true);
  }

  public void setMBucket(int value) {
    RetroshareJNI.RsDhtPeer_mBucket_set(swigCPtr, this, value);
  }

  public int getMBucket() {
    return RetroshareJNI.RsDhtPeer_mBucket_get(swigCPtr, this);
  }

  public void setMDhtId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsDhtPeer_mDhtId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMDhtId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsDhtPeer_mDhtId_get(swigCPtr, this), true);
  }

  public void setMAddr(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsDhtPeer_mAddr_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMAddr() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsDhtPeer_mAddr_get(swigCPtr, this), true);
  }

  public void setMLastSendTime(SWIGTYPE_p_time_t value) {
    RetroshareJNI.RsDhtPeer_mLastSendTime_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMLastSendTime() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.RsDhtPeer_mLastSendTime_get(swigCPtr, this), true);
  }

  public void setMLastRecvTime(SWIGTYPE_p_time_t value) {
    RetroshareJNI.RsDhtPeer_mLastRecvTime_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMLastRecvTime() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.RsDhtPeer_mLastRecvTime_get(swigCPtr, this), true);
  }

  public void setMFoundTime(SWIGTYPE_p_time_t value) {
    RetroshareJNI.RsDhtPeer_mFoundTime_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMFoundTime() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.RsDhtPeer_mFoundTime_get(swigCPtr, this), true);
  }

  public void setMPeerFlags(SWIGTYPE_p_uint32_t value) {
    RetroshareJNI.RsDhtPeer_mPeerFlags_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMPeerFlags() {
    return new SWIGTYPE_p_uint32_t(RetroshareJNI.RsDhtPeer_mPeerFlags_get(swigCPtr, this), true);
  }

  public void setMExtraFlags(SWIGTYPE_p_uint32_t value) {
    RetroshareJNI.RsDhtPeer_mExtraFlags_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMExtraFlags() {
    return new SWIGTYPE_p_uint32_t(RetroshareJNI.RsDhtPeer_mExtraFlags_get(swigCPtr, this), true);
  }

}
