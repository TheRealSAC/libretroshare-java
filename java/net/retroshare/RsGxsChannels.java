/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsChannels extends RsGxsIfaceHelper {
  private long swigCPtr;

  protected RsGxsChannels(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsChannels_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsChannels obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsChannels(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean getGroupData(long token, SWIGTYPE_p_std__vectorT_RsGxsChannelGroup_t groups) {
    return RetroshareJNI.RsGxsChannels_getGroupData(swigCPtr, this, token, SWIGTYPE_p_std__vectorT_RsGxsChannelGroup_t.getCPtr(groups));
  }

  public boolean getPostData(long token, SWIGTYPE_p_std__vectorT_RsGxsChannelPost_t posts) {
    return RetroshareJNI.RsGxsChannels_getPostData(swigCPtr, this, token, SWIGTYPE_p_std__vectorT_RsGxsChannelPost_t.getCPtr(posts));
  }

  public boolean getRelatedPosts(long token, SWIGTYPE_p_std__vectorT_RsGxsChannelPost_t posts) {
    return RetroshareJNI.RsGxsChannels_getRelatedPosts(swigCPtr, this, token, SWIGTYPE_p_std__vectorT_RsGxsChannelPost_t.getCPtr(posts));
  }

  public void setMessageReadStatus(SWIGTYPE_p_unsigned_int token, SWIGTYPE_p_std__pairT_std__string_std__string_t msgId, boolean read) {
    RetroshareJNI.RsGxsChannels_setMessageReadStatus(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), SWIGTYPE_p_std__pairT_std__string_std__string_t.getCPtr(msgId), read);
  }

  public boolean setChannelAutoDownload(SWIGTYPE_p_std__string groupId, boolean enabled) {
    return RetroshareJNI.RsGxsChannels_setChannelAutoDownload(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(groupId), enabled);
  }

  public boolean getChannelAutoDownload(SWIGTYPE_p_std__string groupid) {
    return RetroshareJNI.RsGxsChannels_getChannelAutoDownload(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(groupid));
  }

  public boolean subscribeToGroup(SWIGTYPE_p_unsigned_int token, SWIGTYPE_p_std__string groupId, boolean subscribe) {
    return RetroshareJNI.RsGxsChannels_subscribeToGroup(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), SWIGTYPE_p_std__string.getCPtr(groupId), subscribe);
  }

  public boolean createGroup(SWIGTYPE_p_unsigned_int token, RsGxsChannelGroup group) {
    return RetroshareJNI.RsGxsChannels_createGroup(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), RsGxsChannelGroup.getCPtr(group), group);
  }

  public boolean createPost(SWIGTYPE_p_unsigned_int token, RsGxsChannelPost post) {
    return RetroshareJNI.RsGxsChannels_createPost(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), RsGxsChannelPost.getCPtr(post), post);
  }

  public boolean ExtraFileHash(SWIGTYPE_p_std__string path, SWIGTYPE_p_std__string filename) {
    return RetroshareJNI.RsGxsChannels_ExtraFileHash(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path), SWIGTYPE_p_std__string.getCPtr(filename));
  }

  public boolean ExtraFileRemove(SWIGTYPE_p_std__string hash) {
    return RetroshareJNI.RsGxsChannels_ExtraFileRemove(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash));
  }

}
