/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTlvDsdvEndPoint extends RsTlvItem {
  private long swigCPtr;

  protected RsTlvDsdvEndPoint(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTlvDsdvEndPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTlvDsdvEndPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTlvDsdvEndPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsTlvDsdvEndPoint() {
    this(RetroshareJNI.new_RsTlvDsdvEndPoint(), true);
  }

  public long TlvSize() {
    return RetroshareJNI.RsTlvDsdvEndPoint_TlvSize(swigCPtr, this);
  }

  public void TlvClear() {
    RetroshareJNI.RsTlvDsdvEndPoint_TlvClear(swigCPtr, this);
  }

  public boolean SetTlv(SWIGTYPE_p_void data, long size, SWIGTYPE_p_unsigned_int offset) {
    return RetroshareJNI.RsTlvDsdvEndPoint_SetTlv(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_unsigned_int.getCPtr(offset));
  }

  public boolean GetTlv(SWIGTYPE_p_void data, long size, SWIGTYPE_p_unsigned_int offset) {
    return RetroshareJNI.RsTlvDsdvEndPoint_GetTlv(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_unsigned_int.getCPtr(offset));
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTlvDsdvEndPoint_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public void setIdType(long value) {
    RetroshareJNI.RsTlvDsdvEndPoint_idType_set(swigCPtr, this, value);
  }

  public long getIdType() {
    return RetroshareJNI.RsTlvDsdvEndPoint_idType_get(swigCPtr, this);
  }

  public void setAnonChunk(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsTlvDsdvEndPoint_anonChunk_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getAnonChunk() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsTlvDsdvEndPoint_anonChunk_get(swigCPtr, this), true);
  }

  public void setServiceId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsTlvDsdvEndPoint_serviceId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getServiceId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsTlvDsdvEndPoint_serviceId_get(swigCPtr, this), true);
  }

}
