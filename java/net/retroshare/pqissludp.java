/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqissludp extends pqissl {
  private long swigCPtr;

  protected pqissludp(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.pqissludp_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqissludp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqissludp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pqissludp(PQInterface parent, p3LinkMgr lm) {
    this(RetroshareJNI.new_pqissludp(PQInterface.getCPtr(parent), parent, p3LinkMgr.getCPtr(lm), lm), true);
  }

  public int listen() {
    return RetroshareJNI.pqissludp_listen(swigCPtr, this);
  }

  public int stoplistening() {
    return RetroshareJNI.pqissludp_stoplistening(swigCPtr, this);
  }

  public int tick() {
    return RetroshareJNI.pqissludp_tick(swigCPtr, this);
  }

  public int reset() {
    return RetroshareJNI.pqissludp_reset(swigCPtr, this);
  }

  public boolean connect_parameter(long type, long value) {
    return RetroshareJNI.pqissludp_connect_parameter(swigCPtr, this, type, value);
  }

  public boolean connect_additional_address(long type, SWIGTYPE_p_sockaddr_in addr) {
    return RetroshareJNI.pqissludp_connect_additional_address(swigCPtr, this, type, SWIGTYPE_p_sockaddr_in.getCPtr(addr));
  }

  public boolean moretoread() {
    return RetroshareJNI.pqissludp_moretoread(swigCPtr, this);
  }

  public boolean cansend() {
    return RetroshareJNI.pqissludp_cansend(swigCPtr, this);
  }

  public boolean bandwidthLimited() {
    return RetroshareJNI.pqissludp_bandwidthLimited(swigCPtr, this);
  }

  public int attach() {
    return RetroshareJNI.pqissludp_attach(swigCPtr, this);
  }

}
