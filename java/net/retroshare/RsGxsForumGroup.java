/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsForumGroup {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsGxsForumGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsForumGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsForumGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMMeta(RsGroupMetaData value) {
    RetroshareJNI.RsGxsForumGroup_mMeta_set(swigCPtr, this, RsGroupMetaData.getCPtr(value), value);
  }

  public RsGroupMetaData getMMeta() {
    long cPtr = RetroshareJNI.RsGxsForumGroup_mMeta_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsGroupMetaData(cPtr, false);
  }

  public void setMDescription(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsForumGroup_mDescription_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMDescription() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsForumGroup_mDescription_get(swigCPtr, this), true);
  }

  public RsGxsForumGroup() {
    this(RetroshareJNI.new_RsGxsForumGroup(), true);
  }

}