/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTurtleSearchResultItem extends RsTurtleItem {
  private long swigCPtr;

  protected RsTurtleSearchResultItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTurtleSearchResultItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTurtleSearchResultItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTurtleSearchResultItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setRequest_id(long value) {
    RetroshareJNI.RsTurtleSearchResultItem_request_id_set(swigCPtr, this, value);
  }

  public long getRequest_id() {
    return RetroshareJNI.RsTurtleSearchResultItem_request_id_get(swigCPtr, this);
  }

  public void setDepth(int value) {
    RetroshareJNI.RsTurtleSearchResultItem_depth_set(swigCPtr, this, value);
  }

  public int getDepth() {
    return RetroshareJNI.RsTurtleSearchResultItem_depth_get(swigCPtr, this);
  }

  public void setResult(SWIGTYPE_p_std__listT_TurtleFileInfo_t value) {
    RetroshareJNI.RsTurtleSearchResultItem_result_set(swigCPtr, this, SWIGTYPE_p_std__listT_TurtleFileInfo_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__listT_TurtleFileInfo_t getResult() {
    long cPtr = RetroshareJNI.RsTurtleSearchResultItem_result_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_TurtleFileInfo_t(cPtr, false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream o, int arg1) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTurtleSearchResultItem_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(o), arg1), false);
  }

}
