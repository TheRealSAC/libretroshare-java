/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class peerConnectAddress {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected peerConnectAddress(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peerConnectAddress obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_peerConnectAddress(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public peerConnectAddress() {
    this(RetroshareJNI.new_peerConnectAddress(), true);
  }

  public void setAddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.peerConnectAddress_addr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getAddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.peerConnectAddress_addr_get(swigCPtr, this), true);
  }

  public void setDelay(long value) {
    RetroshareJNI.peerConnectAddress_delay_set(swigCPtr, this, value);
  }

  public long getDelay() {
    return RetroshareJNI.peerConnectAddress_delay_get(swigCPtr, this);
  }

  public void setPeriod(long value) {
    RetroshareJNI.peerConnectAddress_period_set(swigCPtr, this, value);
  }

  public long getPeriod() {
    return RetroshareJNI.peerConnectAddress_period_get(swigCPtr, this);
  }

  public void setType(long value) {
    RetroshareJNI.peerConnectAddress_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return RetroshareJNI.peerConnectAddress_type_get(swigCPtr, this);
  }

  public void setFlags(long value) {
    RetroshareJNI.peerConnectAddress_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return RetroshareJNI.peerConnectAddress_flags_get(swigCPtr, this);
  }

  public void setTs(SWIGTYPE_p_time_t value) {
    RetroshareJNI.peerConnectAddress_ts_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getTs() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.peerConnectAddress_ts_get(swigCPtr, this), true);
  }

  public void setProxyaddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.peerConnectAddress_proxyaddr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getProxyaddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.peerConnectAddress_proxyaddr_get(swigCPtr, this), true);
  }

  public void setSrcaddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.peerConnectAddress_srcaddr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getSrcaddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.peerConnectAddress_srcaddr_get(swigCPtr, this), true);
  }

  public void setBandwidth(long value) {
    RetroshareJNI.peerConnectAddress_bandwidth_set(swigCPtr, this, value);
  }

  public long getBandwidth() {
    return RetroshareJNI.peerConnectAddress_bandwidth_get(swigCPtr, this);
  }

}
