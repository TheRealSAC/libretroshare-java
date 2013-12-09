/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsChannelPostItem extends RsGxsMsgItem {
  private long swigCPtr;

  protected RsGxsChannelPostItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsChannelPostItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsChannelPostItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsChannelPostItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGxsChannelPostItem() {
    this(RetroshareJNI.new_RsGxsChannelPostItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsGxsChannelPostItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsChannelPostItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGxsChannelPostItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public boolean fromChannelPost(RsGxsChannelPost post, boolean moveImage) {
    return RetroshareJNI.RsGxsChannelPostItem_fromChannelPost(swigCPtr, this, RsGxsChannelPost.getCPtr(post), post, moveImage);
  }

  public boolean toChannelPost(RsGxsChannelPost post, boolean moveImage) {
    return RetroshareJNI.RsGxsChannelPostItem_toChannelPost(swigCPtr, this, RsGxsChannelPost.getCPtr(post), post, moveImage);
  }

  public void setMMsg(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsChannelPostItem_mMsg_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMMsg() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsChannelPostItem_mMsg_get(swigCPtr, this), true);
  }

  public void setMAttachment(RsTlvFileSet value) {
    RetroshareJNI.RsGxsChannelPostItem_mAttachment_set(swigCPtr, this, RsTlvFileSet.getCPtr(value), value);
  }

  public RsTlvFileSet getMAttachment() {
    long cPtr = RetroshareJNI.RsGxsChannelPostItem_mAttachment_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvFileSet(cPtr, false);
  }

  public void setMThumbnail(RsTlvImage value) {
    RetroshareJNI.RsGxsChannelPostItem_mThumbnail_set(swigCPtr, this, RsTlvImage.getCPtr(value), value);
  }

  public RsTlvImage getMThumbnail() {
    long cPtr = RetroshareJNI.RsGxsChannelPostItem_mThumbnail_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvImage(cPtr, false);
  }

}