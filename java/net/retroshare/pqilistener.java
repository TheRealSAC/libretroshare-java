/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqilistener {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pqilistener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqilistener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqilistener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public pqilistener() {
    this(RetroshareJNI.new_pqilistener(), true);
  }

  public int tick() {
    return RetroshareJNI.pqilistener_tick(swigCPtr, this);
  }

  public int status() {
    return RetroshareJNI.pqilistener_status(swigCPtr, this);
  }

  public int setListenAddr(SWIGTYPE_p_sockaddr_in addr) {
    return RetroshareJNI.pqilistener_setListenAddr(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(addr));
  }

  public int setuplisten() {
    return RetroshareJNI.pqilistener_setuplisten(swigCPtr, this);
  }

  public int resetlisten() {
    return RetroshareJNI.pqilistener_resetlisten(swigCPtr, this);
  }

}
