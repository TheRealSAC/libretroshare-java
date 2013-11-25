/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class RsDhtNetPeer {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDhtNetPeer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDhtNetPeer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        retroshareJNI.delete_RsDhtNetPeer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsDhtNetPeer() {
    this(retroshareJNI.new_RsDhtNetPeer(), true);
  }

  public void setMDhtId(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtNetPeer_mDhtId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMDhtId() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtNetPeer_mDhtId_get(swigCPtr, this), true);
  }

  public void setMRsId(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtNetPeer_mRsId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMRsId() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtNetPeer_mRsId_get(swigCPtr, this), true);
  }

  public void setMPeerType(SWIGTYPE_p_uint32_t value) {
    retroshareJNI.RsDhtNetPeer_mPeerType_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMPeerType() {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDhtNetPeer_mPeerType_get(swigCPtr, this), true);
  }

  public void setMDhtState(SWIGTYPE_p_uint32_t value) {
    retroshareJNI.RsDhtNetPeer_mDhtState_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMDhtState() {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDhtNetPeer_mDhtState_get(swigCPtr, this), true);
  }

  public void setMConnectState(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtNetPeer_mConnectState_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMConnectState() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtNetPeer_mConnectState_get(swigCPtr, this), true);
  }

  public void setMPeerConnectState(SWIGTYPE_p_uint32_t value) {
    retroshareJNI.RsDhtNetPeer_mPeerConnectState_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMPeerConnectState() {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDhtNetPeer_mPeerConnectState_get(swigCPtr, this), true);
  }

  public void setMPeerConnectMode(SWIGTYPE_p_uint32_t value) {
    retroshareJNI.RsDhtNetPeer_mPeerConnectMode_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMPeerConnectMode() {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDhtNetPeer_mPeerConnectMode_get(swigCPtr, this), true);
  }

  public void setMExclusiveProxyLock(boolean value) {
    retroshareJNI.RsDhtNetPeer_mExclusiveProxyLock_set(swigCPtr, this, value);
  }

  public boolean getMExclusiveProxyLock() {
    return retroshareJNI.RsDhtNetPeer_mExclusiveProxyLock_get(swigCPtr, this);
  }

  public void setMPeerConnectProxyId(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtNetPeer_mPeerConnectProxyId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMPeerConnectProxyId() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtNetPeer_mPeerConnectProxyId_get(swigCPtr, this), true);
  }

  public void setMPeerReqState(SWIGTYPE_p_uint32_t value) {
    retroshareJNI.RsDhtNetPeer_mPeerReqState_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMPeerReqState() {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDhtNetPeer_mPeerReqState_get(swigCPtr, this), true);
  }

  public void setMCbPeerMsg(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtNetPeer_mCbPeerMsg_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMCbPeerMsg() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtNetPeer_mCbPeerMsg_get(swigCPtr, this), true);
  }

}
