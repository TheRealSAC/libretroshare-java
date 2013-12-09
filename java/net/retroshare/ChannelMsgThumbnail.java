/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ChannelMsgThumbnail {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ChannelMsgThumbnail(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChannelMsgThumbnail obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ChannelMsgThumbnail(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ChannelMsgThumbnail() {
    this(RetroshareJNI.new_ChannelMsgThumbnail(), true);
  }

  public void setImage_thumbnail(SWIGTYPE_p_unsigned_char value) {
    RetroshareJNI.ChannelMsgThumbnail_image_thumbnail_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getImage_thumbnail() {
    long cPtr = RetroshareJNI.ChannelMsgThumbnail_image_thumbnail_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setIm_thumbnail_size(int value) {
    RetroshareJNI.ChannelMsgThumbnail_im_thumbnail_size_set(swigCPtr, this, value);
  }

  public int getIm_thumbnail_size() {
    return RetroshareJNI.ChannelMsgThumbnail_im_thumbnail_size_get(swigCPtr, this);
  }

}