/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class nullService extends pqiService {
  private long swigCPtr;

  protected nullService(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.nullService_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(nullService obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_nullService(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int receive(RsRawItem item) {
    return RetroshareJNI.nullService_receive(swigCPtr, this, RsRawItem.getCPtr(item), item);
  }

  public RsRawItem send() {
    long cPtr = RetroshareJNI.nullService_send(swigCPtr, this);
    return (cPtr == 0) ? null : new RsRawItem(cPtr, false);
  }

}
