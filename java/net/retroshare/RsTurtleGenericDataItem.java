/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTurtleGenericDataItem extends RsTurtleGenericTunnelItem {
  private long swigCPtr;

  protected RsTurtleGenericDataItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTurtleGenericDataItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTurtleGenericDataItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTurtleGenericDataItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean shouldStampTunnel() {
    return RetroshareJNI.RsTurtleGenericDataItem_shouldStampTunnel(swigCPtr, this);
  }

  public void setData_size(long value) {
    RetroshareJNI.RsTurtleGenericDataItem_data_size_set(swigCPtr, this, value);
  }

  public long getData_size() {
    return RetroshareJNI.RsTurtleGenericDataItem_data_size_get(swigCPtr, this);
  }

  public void setData_bytes(SWIGTYPE_p_void value) {
    RetroshareJNI.RsTurtleGenericDataItem_data_bytes_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getData_bytes() {
    long cPtr = RetroshareJNI.RsTurtleGenericDataItem_data_bytes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream o, int arg1) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTurtleGenericDataItem_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(o), arg1), false);
  }

}