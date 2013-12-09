/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsCircleGroupItem extends RsGxsGrpItem {
  private long swigCPtr;

  protected RsGxsCircleGroupItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsCircleGroupItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsCircleGroupItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsCircleGroupItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsCircleGroupItem() {
    this(RetroshareJNI.new_RsGxsCircleGroupItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsGxsCircleGroupItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsCircleGroupItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsCircleGroupItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public boolean convertFrom(RsGxsCircleGroup group) {
    return RetroshareJNI.RsGxsCircleGroupItem_convertFrom(swigCPtr, this, RsGxsCircleGroup.getCPtr(group), group);
  }

  public boolean convertTo(RsGxsCircleGroup group) {
    return RetroshareJNI.RsGxsCircleGroupItem_convertTo(swigCPtr, this, RsGxsCircleGroup.getCPtr(group), group);
  }

  public void setPgpIdSet(RsTlvStringSet value) {
    RetroshareJNI.RsGxsCircleGroupItem_pgpIdSet_set(swigCPtr, this, RsTlvStringSet.getCPtr(value), value);
  }

  public RsTlvStringSet getPgpIdSet() {
    long cPtr = RetroshareJNI.RsGxsCircleGroupItem_pgpIdSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvStringSet(cPtr, false);
  }

  public void setGxsIdSet(RsTlvStringSet value) {
    RetroshareJNI.RsGxsCircleGroupItem_gxsIdSet_set(swigCPtr, this, RsTlvStringSet.getCPtr(value), value);
  }

  public RsTlvStringSet getGxsIdSet() {
    long cPtr = RetroshareJNI.RsGxsCircleGroupItem_gxsIdSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvStringSet(cPtr, false);
  }

  public void setSubCircleSet(RsTlvStringSet value) {
    RetroshareJNI.RsGxsCircleGroupItem_subCircleSet_set(swigCPtr, this, RsTlvStringSet.getCPtr(value), value);
  }

  public RsTlvStringSet getSubCircleSet() {
    long cPtr = RetroshareJNI.RsGxsCircleGroupItem_subCircleSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvStringSet(cPtr, false);
  }

}
