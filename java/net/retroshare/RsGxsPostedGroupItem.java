/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsPostedGroupItem extends RsGxsGrpItem {
  private long swigCPtr;

  protected RsGxsPostedGroupItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsPostedGroupItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsPostedGroupItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsPostedGroupItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsPostedGroupItem() {
    this(RetroshareJNI.new_RsGxsPostedGroupItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsGxsPostedGroupItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsPostedGroupItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsPostedGroupItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setMGroup(RsPostedGroup value) {
    RetroshareJNI.RsGxsPostedGroupItem_mGroup_set(swigCPtr, this, RsPostedGroup.getCPtr(value), value);
  }

  public RsPostedGroup getMGroup() {
    long cPtr = RetroshareJNI.RsGxsPostedGroupItem_mGroup_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsPostedGroup(cPtr, false);
  }

}
