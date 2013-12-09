/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTurtleChunkCrcRequestItem extends RsTurtleGenericTunnelItem {
  private long swigCPtr;

  protected RsTurtleChunkCrcRequestItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTurtleChunkCrcRequestItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTurtleChunkCrcRequestItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTurtleChunkCrcRequestItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean shouldStampTunnel() {
    return RetroshareJNI.RsTurtleChunkCrcRequestItem_shouldStampTunnel(swigCPtr, this);
  }

  public long travelingDirection() {
    return RetroshareJNI.RsTurtleChunkCrcRequestItem_travelingDirection(swigCPtr, this);
  }

  public void setChunk_number(long value) {
    RetroshareJNI.RsTurtleChunkCrcRequestItem_chunk_number_set(swigCPtr, this, value);
  }

  public long getChunk_number() {
    return RetroshareJNI.RsTurtleChunkCrcRequestItem_chunk_number_get(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream o, int arg1) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTurtleChunkCrcRequestItem_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(o), arg1), false);
  }

  public boolean serialize(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsTurtleChunkCrcRequestItem_serialize(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public long serial_size() {
    return RetroshareJNI.RsTurtleChunkCrcRequestItem_serial_size(swigCPtr, this);
  }

}