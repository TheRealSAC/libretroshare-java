/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsWikiCommentItem extends RsGxsMsgItem {
  private long swigCPtr;

  protected RsGxsWikiCommentItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsWikiCommentItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsWikiCommentItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsWikiCommentItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsWikiCommentItem() {
    this(RetroshareJNI.new_RsGxsWikiCommentItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsGxsWikiCommentItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsWikiCommentItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsWikiCommentItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setComment(RsWikiComment value) {
    RetroshareJNI.RsGxsWikiCommentItem_comment_set(swigCPtr, this, RsWikiComment.getCPtr(value), value);
  }

  public RsWikiComment getComment() {
    long cPtr = RetroshareJNI.RsGxsWikiCommentItem_comment_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsWikiComment(cPtr, false);
  }

}
