/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsPhotoAlbumShare {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsPhotoAlbumShare(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsPhotoAlbumShare obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsPhotoAlbumShare(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMShareType(long value) {
    RetroshareJNI.RsPhotoAlbumShare_mShareType_set(swigCPtr, this, value);
  }

  public long getMShareType() {
    return RetroshareJNI.RsPhotoAlbumShare_mShareType_get(swigCPtr, this);
  }

  public void setMShareGroupId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPhotoAlbumShare_mShareGroupId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMShareGroupId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPhotoAlbumShare_mShareGroupId_get(swigCPtr, this), true);
  }

  public void setMPublishKey(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPhotoAlbumShare_mPublishKey_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMPublishKey() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPhotoAlbumShare_mPublishKey_get(swigCPtr, this), true);
  }

  public void setMCommentMode(long value) {
    RetroshareJNI.RsPhotoAlbumShare_mCommentMode_set(swigCPtr, this, value);
  }

  public long getMCommentMode() {
    return RetroshareJNI.RsPhotoAlbumShare_mCommentMode_get(swigCPtr, this);
  }

  public void setMResizeMode(long value) {
    RetroshareJNI.RsPhotoAlbumShare_mResizeMode_set(swigCPtr, this, value);
  }

  public long getMResizeMode() {
    return RetroshareJNI.RsPhotoAlbumShare_mResizeMode_get(swigCPtr, this);
  }

  public RsPhotoAlbumShare() {
    this(RetroshareJNI.new_RsPhotoAlbumShare(), true);
  }

}
