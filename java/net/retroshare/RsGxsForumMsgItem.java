/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsForumMsgItem extends RsGxsMsgItem {
  private long swigCPtr;

  protected RsGxsForumMsgItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsForumMsgItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsForumMsgItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsForumMsgItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsForumMsgItem() {
    this(RetroshareJNI.new_RsGxsForumMsgItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsGxsForumMsgItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsForumMsgItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsForumMsgItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setMMsg(RsGxsForumMsg value) {
    RetroshareJNI.RsGxsForumMsgItem_mMsg_set(swigCPtr, this, RsGxsForumMsg.getCPtr(value), value);
  }

  public RsGxsForumMsg getMMsg() {
    long cPtr = RetroshareJNI.RsGxsForumMsgItem_mMsg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsGxsForumMsg(cPtr, false);
  }

}