/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqiloopback extends PQInterface {
  private long swigCPtr;

  protected pqiloopback(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.pqiloopback_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqiloopback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqiloopback(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pqiloopback(SWIGTYPE_p_std__string id) {
    this(RetroshareJNI.new_pqiloopback(SWIGTYPE_p_std__string.getCPtr(id)), true);
  }

  public int SendItem(RsItem item) {
    return RetroshareJNI.pqiloopback_SendItem(swigCPtr, this, RsItem.getCPtr(item), item);
  }

  public RsItem GetItem() {
    long cPtr = RetroshareJNI.pqiloopback_GetItem(swigCPtr, this);
    return (cPtr == 0) ? null : new RsItem(cPtr, false);
  }

  public int tick() {
    return RetroshareJNI.pqiloopback_tick(swigCPtr, this);
  }

  public int status() {
    return RetroshareJNI.pqiloopback_status(swigCPtr, this);
  }

  public int notifyEvent(NetInterface arg0, int arg1) {
    return RetroshareJNI.pqiloopback_notifyEvent(swigCPtr, this, NetInterface.getCPtr(arg0), arg0, arg1);
  }

}