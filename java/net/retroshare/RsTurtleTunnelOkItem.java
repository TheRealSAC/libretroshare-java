/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTurtleTunnelOkItem extends RsTurtleItem {
  private long swigCPtr;

  protected RsTurtleTunnelOkItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTurtleTunnelOkItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTurtleTunnelOkItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTurtleTunnelOkItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setTunnel_id(long value) {
    RetroshareJNI.RsTurtleTunnelOkItem_tunnel_id_set(swigCPtr, this, value);
  }

  public long getTunnel_id() {
    return RetroshareJNI.RsTurtleTunnelOkItem_tunnel_id_get(swigCPtr, this);
  }

  public void setRequest_id(long value) {
    RetroshareJNI.RsTurtleTunnelOkItem_request_id_set(swigCPtr, this, value);
  }

  public long getRequest_id() {
    return RetroshareJNI.RsTurtleTunnelOkItem_request_id_get(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream o, int arg1) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTurtleTunnelOkItem_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(o), arg1), false);
  }

}
