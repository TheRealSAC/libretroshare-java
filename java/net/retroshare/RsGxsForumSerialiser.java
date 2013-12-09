/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsForumSerialiser extends RsSerialType {
  private long swigCPtr;

  protected RsGxsForumSerialiser(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsForumSerialiser_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsForumSerialiser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsForumSerialiser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsForumSerialiser() {
    this(RetroshareJNI.new_RsGxsForumSerialiser(), true);
  }

  public long size(RsItem item) {
    return RetroshareJNI.RsGxsForumSerialiser_size(swigCPtr, this, RsItem.getCPtr(item), item);
  }

  public boolean serialise(RsItem item, SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsGxsForumSerialiser_serialise(swigCPtr, this, RsItem.getCPtr(item), item, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public RsItem deserialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    long cPtr = RetroshareJNI.RsGxsForumSerialiser_deserialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
    return (cPtr == 0) ? null : new RsItem(cPtr, false);
  }

}
