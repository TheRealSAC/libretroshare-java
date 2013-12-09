/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3DhtMgr extends pqiNetAssistConnect {
  private long swigCPtr;

  protected p3DhtMgr(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3DhtMgr_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3DhtMgr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3DhtMgr(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void enable(boolean on) {
    RetroshareJNI.p3DhtMgr_enable(swigCPtr, this, on);
  }

  public void shutdown() {
    RetroshareJNI.p3DhtMgr_shutdown(swigCPtr, this);
  }

  public void restart() {
    RetroshareJNI.p3DhtMgr_restart(swigCPtr, this);
  }

  public boolean getEnabled() {
    return RetroshareJNI.p3DhtMgr_getEnabled(swigCPtr, this);
  }

  public boolean getActive() {
    return RetroshareJNI.p3DhtMgr_getActive(swigCPtr, this);
  }

  public void setBootstrapAllowed(boolean on) {
    RetroshareJNI.p3DhtMgr_setBootstrapAllowed(swigCPtr, this, on);
  }

  public boolean getBootstrapAllowed() {
    return RetroshareJNI.p3DhtMgr_getBootstrapAllowed(swigCPtr, this);
  }

  public boolean setExternalInterface(SWIGTYPE_p_sockaddr_in laddr, SWIGTYPE_p_sockaddr_in raddr, long type) {
    return RetroshareJNI.p3DhtMgr_setExternalInterface(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(laddr), SWIGTYPE_p_sockaddr_in.getCPtr(raddr), type);
  }

  public boolean findPeer(SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3DhtMgr_findPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean dropPeer(SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3DhtMgr_dropPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean notifyPeer(SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3DhtMgr_notifyPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean getPeerStatus(SWIGTYPE_p_std__string id, SWIGTYPE_p_sockaddr_in laddr, SWIGTYPE_p_sockaddr_in raddr, SWIGTYPE_p_unsigned_int type, SWIGTYPE_p_unsigned_int mode) {
    return RetroshareJNI.p3DhtMgr_getPeerStatus(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_sockaddr_in.getCPtr(laddr), SWIGTYPE_p_sockaddr_in.getCPtr(raddr), SWIGTYPE_p_unsigned_int.getCPtr(type), SWIGTYPE_p_unsigned_int.getCPtr(mode));
  }

  public boolean enableStun(boolean on) {
    return RetroshareJNI.p3DhtMgr_enableStun(swigCPtr, this, on);
  }

  public boolean addStun(SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3DhtMgr_addStun(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean dhtResultNotify(SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3DhtMgr_dhtResultNotify(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean dhtResultSearch(SWIGTYPE_p_std__string id, SWIGTYPE_p_sockaddr_in laddr, SWIGTYPE_p_sockaddr_in raddr, long type, SWIGTYPE_p_std__string sign) {
    return RetroshareJNI.p3DhtMgr_dhtResultSearch(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_sockaddr_in.getCPtr(laddr), SWIGTYPE_p_sockaddr_in.getCPtr(raddr), type, SWIGTYPE_p_std__string.getCPtr(sign));
  }

  public boolean dhtResultBootstrap(SWIGTYPE_p_std__string idhash) {
    return RetroshareJNI.p3DhtMgr_dhtResultBootstrap(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(idhash));
  }

  public boolean resultDHT(SWIGTYPE_p_std__string key, SWIGTYPE_p_std__string value) {
    return RetroshareJNI.p3DhtMgr_resultDHT(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(key), SWIGTYPE_p_std__string.getCPtr(value));
  }

  public void run() {
    RetroshareJNI.p3DhtMgr_run(swigCPtr, this);
  }

}
