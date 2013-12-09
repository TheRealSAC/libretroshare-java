/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class AcceptedSSL {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AcceptedSSL(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AcceptedSSL obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_AcceptedSSL(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMFd(int value) {
    RetroshareJNI.AcceptedSSL_mFd_set(swigCPtr, this, value);
  }

  public int getMFd() {
    return RetroshareJNI.AcceptedSSL_mFd_get(swigCPtr, this);
  }

  public void setMSSL(SWIGTYPE_p_SSL value) {
    RetroshareJNI.AcceptedSSL_mSSL_set(swigCPtr, this, SWIGTYPE_p_SSL.getCPtr(value));
  }

  public SWIGTYPE_p_SSL getMSSL() {
    long cPtr = RetroshareJNI.AcceptedSSL_mSSL_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SSL(cPtr, false);
  }

  public void setMPeerId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.AcceptedSSL_mPeerId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMPeerId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.AcceptedSSL_mPeerId_get(swigCPtr, this), true);
  }

  public void setMAddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.AcceptedSSL_mAddr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getMAddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.AcceptedSSL_mAddr_get(swigCPtr, this), true);
  }

  public void setMAcceptTS(SWIGTYPE_p_time_t value) {
    RetroshareJNI.AcceptedSSL_mAcceptTS_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMAcceptTS() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.AcceptedSSL_mAcceptTS_get(swigCPtr, this), true);
  }

  public AcceptedSSL() {
    this(RetroshareJNI.new_AcceptedSSL(), true);
  }

}