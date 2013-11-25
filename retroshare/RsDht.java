/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class RsDht {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDht(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDht obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        retroshareJNI.delete_RsDht(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_uint32_t getNetState(SWIGTYPE_p_uint32_t type) {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDht_getNetState(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(type)), true);
  }

  public int getDhtPeers(int lvl, SWIGTYPE_p_std__listT_RsDhtPeer_t peers) {
    return retroshareJNI.RsDht_getDhtPeers(swigCPtr, this, lvl, SWIGTYPE_p_std__listT_RsDhtPeer_t.getCPtr(peers));
  }

  public int getNetPeerList(SWIGTYPE_p_std__listT_std__string_t peerIds) {
    return retroshareJNI.RsDht_getNetPeerList(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(peerIds));
  }

  public int getNetPeerStatus(SWIGTYPE_p_std__string peerId, RsDhtNetPeer status) {
    return retroshareJNI.RsDht_getNetPeerStatus(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peerId), RsDhtNetPeer.getCPtr(status), status);
  }

  public int getRelayEnds(SWIGTYPE_p_std__listT_RsDhtRelayEnd_t relayEnds) {
    return retroshareJNI.RsDht_getRelayEnds(swigCPtr, this, SWIGTYPE_p_std__listT_RsDhtRelayEnd_t.getCPtr(relayEnds));
  }

  public int getRelayProxies(SWIGTYPE_p_std__listT_RsDhtRelayProxy_t relayProxies) {
    return retroshareJNI.RsDht_getRelayProxies(swigCPtr, this, SWIGTYPE_p_std__listT_RsDhtRelayProxy_t.getCPtr(relayProxies));
  }

  public SWIGTYPE_p_std__string getUdpAddressString() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDht_getUdpAddressString(swigCPtr, this), true);
  }

  public void getDhtRates(SWIGTYPE_p_float read, SWIGTYPE_p_float write) {
    retroshareJNI.RsDht_getDhtRates(swigCPtr, this, SWIGTYPE_p_float.getCPtr(read), SWIGTYPE_p_float.getCPtr(write));
  }

  public void getRelayRates(SWIGTYPE_p_float read, SWIGTYPE_p_float write, SWIGTYPE_p_float relay) {
    retroshareJNI.RsDht_getRelayRates(swigCPtr, this, SWIGTYPE_p_float.getCPtr(read), SWIGTYPE_p_float.getCPtr(write), SWIGTYPE_p_float.getCPtr(relay));
  }

  public int getRelayServerList(SWIGTYPE_p_std__listT_std__string_t ids) {
    return retroshareJNI.RsDht_getRelayServerList(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public int addRelayServer(SWIGTYPE_p_std__string ids) {
    return retroshareJNI.RsDht_addRelayServer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ids));
  }

  public int removeRelayServer(SWIGTYPE_p_std__string ids) {
    return retroshareJNI.RsDht_removeRelayServer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ids));
  }

  public SWIGTYPE_p_uint32_t getRelayMode() {
    return new SWIGTYPE_p_uint32_t(retroshareJNI.RsDht_getRelayMode(swigCPtr, this), true);
  }

  public int setRelayMode(SWIGTYPE_p_uint32_t mode) {
    return retroshareJNI.RsDht_setRelayMode(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(mode));
  }

  public int getRelayAllowance(int classIdx, SWIGTYPE_p_uint32_t count, SWIGTYPE_p_uint32_t bandwidth) {
    return retroshareJNI.RsDht_getRelayAllowance(swigCPtr, this, classIdx, SWIGTYPE_p_uint32_t.getCPtr(count), SWIGTYPE_p_uint32_t.getCPtr(bandwidth));
  }

  public int setRelayAllowance(int classIdx, SWIGTYPE_p_uint32_t count, SWIGTYPE_p_uint32_t bandwidth) {
    return retroshareJNI.RsDht_setRelayAllowance(swigCPtr, this, classIdx, SWIGTYPE_p_uint32_t.getCPtr(count), SWIGTYPE_p_uint32_t.getCPtr(bandwidth));
  }

  public boolean getOwnDhtId(SWIGTYPE_p_std__string ownDhtId) {
    return retroshareJNI.RsDht_getOwnDhtId(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ownDhtId));
  }

}
