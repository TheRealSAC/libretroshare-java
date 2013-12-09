/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsDiscAskInfo extends RsDiscItem {
  private long swigCPtr;

  protected RsDiscAskInfo(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsDiscAskInfo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDiscAskInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsDiscAskInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsDiscAskInfo() {
    this(RetroshareJNI.new_RsDiscAskInfo(), true);
  }

  public void clear() {
    RetroshareJNI.RsDiscAskInfo_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsDiscAskInfo_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsDiscAskInfo_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setGpg_id(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsDiscAskInfo_gpg_id_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGpg_id() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsDiscAskInfo_gpg_id_get(swigCPtr, this), true);
  }

}
