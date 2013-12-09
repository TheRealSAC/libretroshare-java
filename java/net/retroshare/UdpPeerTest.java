/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class UdpPeerTest extends UdpPeer {
  private long swigCPtr;

  protected UdpPeerTest(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.UdpPeerTest_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UdpPeerTest obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_UdpPeerTest(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UdpPeerTest(SWIGTYPE_p_sockaddr_in addr) {
    this(RetroshareJNI.new_UdpPeerTest(SWIGTYPE_p_sockaddr_in.getCPtr(addr)), true);
  }

  public void recvPkt(SWIGTYPE_p_void data, int size) {
    RetroshareJNI.UdpPeerTest_recvPkt(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size);
  }

  public void setRaddr(SWIGTYPE_p_sockaddr_in value) {
    RetroshareJNI.UdpPeerTest_raddr_set(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(value));
  }

  public SWIGTYPE_p_sockaddr_in getRaddr() {
    return new SWIGTYPE_p_sockaddr_in(RetroshareJNI.UdpPeerTest_raddr_get(swigCPtr, this), true);
  }

}
