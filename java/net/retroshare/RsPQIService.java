/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsPQIService extends p3Service {
  private long swigCPtr;

  protected RsPQIService(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsPQIService_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsPQIService obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsPQIService(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public long tickDelay() {
    return RetroshareJNI.RsPQIService_tickDelay(swigCPtr, this);
  }

  public int tick() {
    return RetroshareJNI.RsPQIService_tick(swigCPtr, this);
  }

  public RsSerialiser setupSerialiser() {
    long cPtr = RetroshareJNI.RsPQIService_setupSerialiser(swigCPtr, this);
    return (cPtr == 0) ? null : new RsSerialiser(cPtr, false);
  }

  public boolean saveList(SWIGTYPE_p_bool arg0, SWIGTYPE_p_std__listT_RsItem_p_t arg1) {
    return RetroshareJNI.RsPQIService_saveList(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(arg0), SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(arg1));
  }

  public boolean loadList(SWIGTYPE_p_std__listT_RsItem_p_t arg0) {
    return RetroshareJNI.RsPQIService_loadList(swigCPtr, this, SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(arg0));
  }

}