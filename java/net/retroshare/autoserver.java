/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class autoserver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected autoserver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(autoserver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_autoserver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public autoserver() {
    this(RetroshareJNI.new_autoserver(), true);
  }

  public void setId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.autoserver_id_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.autoserver_id_get(swigCPtr, this), true);
  }

  public void setLocalAddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.autoserver_localAddr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getLocalAddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.autoserver_localAddr_get(swigCPtr, this), true);
  }

  public void setRemoteAddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.autoserver_remoteAddr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getRemoteAddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.autoserver_remoteAddr_get(swigCPtr, this), true);
  }

  public void setTs(SWIGTYPE_p_time_t value) {
    RetroshareJNI.autoserver_ts_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getTs() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.autoserver_ts_get(swigCPtr, this), true);
  }

  public void setDiscFlags(long value) {
    RetroshareJNI.autoserver_discFlags_set(swigCPtr, this, value);
  }

  public long getDiscFlags() {
    return RetroshareJNI.autoserver_discFlags_get(swigCPtr, this);
  }

}