/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class UdpRelayReceiver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UdpRelayReceiver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UdpRelayReceiver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_UdpRelayReceiver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UdpRelayReceiver(SWIGTYPE_p_UdpPublisher pub) {
    this(RetroshareJNI.new_UdpRelayReceiver(SWIGTYPE_p_UdpPublisher.getCPtr(pub)), true);
  }

  public int addUdpPeer(UdpPeer peer, UdpRelayAddrSet endPoints, SWIGTYPE_p_sockaddr_in proxyaddr) {
    return RetroshareJNI.UdpRelayReceiver_addUdpPeer(swigCPtr, this, UdpPeer.getCPtr(peer), peer, UdpRelayAddrSet.getCPtr(endPoints), endPoints, SWIGTYPE_p_sockaddr_in.getCPtr(proxyaddr));
  }

  public int removeUdpPeer(UdpPeer peer) {
    return RetroshareJNI.UdpRelayReceiver_removeUdpPeer(swigCPtr, this, UdpPeer.getCPtr(peer), peer);
  }

  public int addUdpRelay(UdpRelayAddrSet addrSet, SWIGTYPE_p_int relayClass, SWIGTYPE_p_unsigned_int bandwidth) {
    return RetroshareJNI.UdpRelayReceiver_addUdpRelay(swigCPtr, this, UdpRelayAddrSet.getCPtr(addrSet), addrSet, SWIGTYPE_p_int.getCPtr(relayClass), SWIGTYPE_p_unsigned_int.getCPtr(bandwidth));
  }

  public int removeUdpRelay(UdpRelayAddrSet addrs) {
    return RetroshareJNI.UdpRelayReceiver_removeUdpRelay(swigCPtr, this, UdpRelayAddrSet.getCPtr(addrs), addrs);
  }

  public int checkRelays() {
    return RetroshareJNI.UdpRelayReceiver_checkRelays(swigCPtr, this);
  }

  public int setRelayTotal(int count) {
    return RetroshareJNI.UdpRelayReceiver_setRelayTotal(swigCPtr, this, count);
  }

  public int setRelayClassMax(int classIdx, int count, int bandwidth) {
    return RetroshareJNI.UdpRelayReceiver_setRelayClassMax(swigCPtr, this, classIdx, count, bandwidth);
  }

  public int getRelayClassMax(int classIdx) {
    return RetroshareJNI.UdpRelayReceiver_getRelayClassMax(swigCPtr, this, classIdx);
  }

  public int getRelayClassBandwidth(int classIdx) {
    return RetroshareJNI.UdpRelayReceiver_getRelayClassBandwidth(swigCPtr, this, classIdx);
  }

  public int getRelayCount(int classIdx) {
    return RetroshareJNI.UdpRelayReceiver_getRelayCount(swigCPtr, this, classIdx);
  }

  public int RelayStatus(SWIGTYPE_p_std__ostream out) {
    return RetroshareJNI.UdpRelayReceiver_RelayStatus(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out));
  }

  public int getRelayEnds(SWIGTYPE_p_std__listT_UdpRelayEnd_t relayEnds) {
    return RetroshareJNI.UdpRelayReceiver_getRelayEnds(swigCPtr, this, SWIGTYPE_p_std__listT_UdpRelayEnd_t.getCPtr(relayEnds));
  }

  public int getRelayProxies(SWIGTYPE_p_std__listT_UdpRelayProxy_t relayProxies) {
    return RetroshareJNI.UdpRelayReceiver_getRelayProxies(swigCPtr, this, SWIGTYPE_p_std__listT_UdpRelayProxy_t.getCPtr(relayProxies));
  }

  public int recvPkt(SWIGTYPE_p_void data, int size, SWIGTYPE_p_sockaddr_in from) {
    return RetroshareJNI.UdpRelayReceiver_recvPkt(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_sockaddr_in.getCPtr(from));
  }

  public int sendPkt(SWIGTYPE_p_void data, int size, SWIGTYPE_p_sockaddr_in to, int ttl) {
    return RetroshareJNI.UdpRelayReceiver_sendPkt(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_sockaddr_in.getCPtr(to), ttl);
  }

  public int status(SWIGTYPE_p_std__ostream out) {
    return RetroshareJNI.UdpRelayReceiver_status(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out));
  }

  public int UdpPeersStatus(SWIGTYPE_p_std__ostream out) {
    return RetroshareJNI.UdpRelayReceiver_UdpPeersStatus(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out));
  }

  public void getDataTransferred(SWIGTYPE_p_unsigned_int read, SWIGTYPE_p_unsigned_int write, SWIGTYPE_p_unsigned_int relay) {
    RetroshareJNI.UdpRelayReceiver_getDataTransferred(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(read), SWIGTYPE_p_unsigned_int.getCPtr(write), SWIGTYPE_p_unsigned_int.getCPtr(relay));
  }

}