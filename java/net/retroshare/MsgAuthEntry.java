/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class MsgAuthEntry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MsgAuthEntry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MsgAuthEntry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_MsgAuthEntry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MsgAuthEntry() {
    this(RetroshareJNI.new_MsgAuthEntry(), true);
  }

  public void setMMsgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.MsgAuthEntry_mMsgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMMsgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.MsgAuthEntry_mMsgId_get(swigCPtr, this), true);
  }

  public void setMGrpId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.MsgAuthEntry_mGrpId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMGrpId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.MsgAuthEntry_mGrpId_get(swigCPtr, this), true);
  }

  public void setMAuthorId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.MsgAuthEntry_mAuthorId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMAuthorId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.MsgAuthEntry_mAuthorId_get(swigCPtr, this), true);
  }

  public void setMPassedVetting(boolean value) {
    RetroshareJNI.MsgAuthEntry_mPassedVetting_set(swigCPtr, this, value);
  }

  public boolean getMPassedVetting() {
    return RetroshareJNI.MsgAuthEntry_mPassedVetting_get(swigCPtr, this);
  }

}