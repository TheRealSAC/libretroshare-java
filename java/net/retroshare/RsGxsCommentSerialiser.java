/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsCommentSerialiser extends RsSerialType {
  private long swigCPtr;

  protected RsGxsCommentSerialiser(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsCommentSerialiser_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsCommentSerialiser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsCommentSerialiser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsCommentSerialiser(int service_type) {
    this(RetroshareJNI.new_RsGxsCommentSerialiser(service_type), true);
  }

  public long size(RsItem item) {
    return RetroshareJNI.RsGxsCommentSerialiser_size(swigCPtr, this, RsItem.getCPtr(item), item);
  }

  public boolean serialise(RsItem item, SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsGxsCommentSerialiser_serialise(swigCPtr, this, RsItem.getCPtr(item), item, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public RsItem deserialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    long cPtr = RetroshareJNI.RsGxsCommentSerialiser_deserialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
    return (cPtr == 0) ? null : new RsItem(cPtr, false);
  }

}
