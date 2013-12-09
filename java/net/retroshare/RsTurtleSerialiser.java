/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTurtleSerialiser extends RsSerialType {
  private long swigCPtr;

  protected RsTurtleSerialiser(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTurtleSerialiser_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTurtleSerialiser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTurtleSerialiser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsTurtleSerialiser() {
    this(RetroshareJNI.new_RsTurtleSerialiser(), true);
  }

  public long size(RsItem item) {
    return RetroshareJNI.RsTurtleSerialiser_size(swigCPtr, this, RsItem.getCPtr(item), item);
  }

  public boolean serialise(RsItem item, SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsTurtleSerialiser_serialise(swigCPtr, this, RsItem.getCPtr(item), item, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public RsItem deserialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    long cPtr = RetroshareJNI.RsTurtleSerialiser_deserialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
    return (cPtr == 0) ? null : new RsItem(cPtr, false);
  }

  public void registerClientService(RsTurtleClientService service) {
    RetroshareJNI.RsTurtleSerialiser_registerClientService(swigCPtr, this, RsTurtleClientService.getCPtr(service), service);
  }

}
