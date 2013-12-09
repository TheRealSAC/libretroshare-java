/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTurtleFileCrcRequestItem extends RsTurtleGenericTunnelItem {
  private long swigCPtr;

  protected RsTurtleFileCrcRequestItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTurtleFileCrcRequestItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTurtleFileCrcRequestItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTurtleFileCrcRequestItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean shouldStampTunnel() {
    return RetroshareJNI.RsTurtleFileCrcRequestItem_shouldStampTunnel(swigCPtr, this);
  }

  public long travelingDirection() {
    return RetroshareJNI.RsTurtleFileCrcRequestItem_travelingDirection(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream o, int arg1) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTurtleFileCrcRequestItem_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(o), arg1), false);
  }

  public boolean serialize(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsTurtleFileCrcRequestItem_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public long serial_size() {
    return RetroshareJNI.RsTurtleFileCrcRequestItem_serial_size(swigCPtr, this);
  }

}