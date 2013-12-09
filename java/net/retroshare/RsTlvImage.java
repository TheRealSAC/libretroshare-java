/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTlvImage extends RsTlvItem {
  private long swigCPtr;

  protected RsTlvImage(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTlvImage_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTlvImage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTlvImage(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsTlvImage() {
    this(RetroshareJNI.new_RsTlvImage__SWIG_0(), true);
  }

  public RsTlvImage(RsTlvImage arg0) {
    this(RetroshareJNI.new_RsTlvImage__SWIG_1(RsTlvImage.getCPtr(arg0), arg0), true);
  }

  public long TlvSize() {
    return RetroshareJNI.RsTlvImage_TlvSize(swigCPtr, this);
  }

  public void TlvClear() {
    RetroshareJNI.RsTlvImage_TlvClear(swigCPtr, this);
  }

  public boolean SetTlv(SWIGTYPE_p_void data, long size, SWIGTYPE_p_unsigned_int offset) {
    return RetroshareJNI.RsTlvImage_SetTlv(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_unsigned_int.getCPtr(offset));
  }

  public boolean GetTlv(SWIGTYPE_p_void data, long size, SWIGTYPE_p_unsigned_int offset) {
    return RetroshareJNI.RsTlvImage_GetTlv(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_unsigned_int.getCPtr(offset));
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTlvImage_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public void setImage_type(long value) {
    RetroshareJNI.RsTlvImage_image_type_set(swigCPtr, this, value);
  }

  public long getImage_type() {
    return RetroshareJNI.RsTlvImage_image_type_get(swigCPtr, this);
  }

  public void setBinData(RsTlvBinaryData value) {
    RetroshareJNI.RsTlvImage_binData_set(swigCPtr, this, RsTlvBinaryData.getCPtr(value), value);
  }

  public RsTlvBinaryData getBinData() {
    long cPtr = RetroshareJNI.RsTlvImage_binData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvBinaryData(cPtr, false);
  }

}