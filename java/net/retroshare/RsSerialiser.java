/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsSerialiser {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsSerialiser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsSerialiser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsSerialiser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsSerialiser() {
    this(RetroshareJNI.new_RsSerialiser(), true);
  }

  public boolean addSerialType(RsSerialType type) {
    return RetroshareJNI.RsSerialiser_addSerialType(swigCPtr, this, RsSerialType.getCPtr(type), type);
  }

  public long size(RsItem arg0) {
    return RetroshareJNI.RsSerialiser_size(swigCPtr, this, RsItem.getCPtr(arg0), arg0);
  }

  public boolean serialise(RsItem item, SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsSerialiser_serialise(swigCPtr, this, RsItem.getCPtr(item), item, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public RsItem deserialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    long cPtr = RetroshareJNI.RsSerialiser_deserialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
    return (cPtr == 0) ? null : new RsItem(cPtr, false);
  }

}
