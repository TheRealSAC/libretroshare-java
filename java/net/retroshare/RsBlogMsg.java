/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsBlogMsg extends RsDistribMsg {
  private long swigCPtr;

  protected RsBlogMsg(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsBlogMsg_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsBlogMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsBlogMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsBlogMsg() {
    this(RetroshareJNI.new_RsBlogMsg(), true);
  }

  public void clear() {
    RetroshareJNI.RsBlogMsg_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsBlogMsg_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsBlogMsg_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setSubject(SWIGTYPE_p_std__wstring value) {
    RetroshareJNI.RsBlogMsg_subject_set(swigCPtr, this, SWIGTYPE_p_std__wstring.getCPtr(value));
  }

  public SWIGTYPE_p_std__wstring getSubject() {
    return new SWIGTYPE_p_std__wstring(RetroshareJNI.RsBlogMsg_subject_get(swigCPtr, this), true);
  }

  public void setMessage(SWIGTYPE_p_std__wstring value) {
    RetroshareJNI.RsBlogMsg_message_set(swigCPtr, this, SWIGTYPE_p_std__wstring.getCPtr(value));
  }

  public SWIGTYPE_p_std__wstring getMessage() {
    return new SWIGTYPE_p_std__wstring(RetroshareJNI.RsBlogMsg_message_get(swigCPtr, this), true);
  }

  public void setGraphic_set(SWIGTYPE_p_std__listT_RsTlvImage_t value) {
    RetroshareJNI.RsBlogMsg_graphic_set_set(swigCPtr, this, SWIGTYPE_p_std__listT_RsTlvImage_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__listT_RsTlvImage_t getGraphic_set() {
    long cPtr = RetroshareJNI.RsBlogMsg_graphic_set_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_RsTlvImage_t(cPtr, false);
  }

}
