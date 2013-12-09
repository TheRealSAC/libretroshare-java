/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNxsNetMgrImpl extends RsNxsNetMgr {
  private long swigCPtr;

  protected RsNxsNetMgrImpl(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsNxsNetMgrImpl_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNxsNetMgrImpl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNxsNetMgrImpl(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsNxsNetMgrImpl(p3LinkMgr lMgr) {
    this(RetroshareJNI.new_RsNxsNetMgrImpl(p3LinkMgr.getCPtr(lMgr), lMgr), true);
  }

  public SWIGTYPE_p_std__string getOwnId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsNxsNetMgrImpl_getOwnId(swigCPtr, this), true);
  }

  public void getOnlineList(SWIGTYPE_p_std__setT_std__string_t ssl_peers) {
    RetroshareJNI.RsNxsNetMgrImpl_getOnlineList(swigCPtr, this, SWIGTYPE_p_std__setT_std__string_t.getCPtr(ssl_peers));
  }

}