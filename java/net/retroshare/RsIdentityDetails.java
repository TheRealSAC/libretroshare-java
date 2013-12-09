/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsIdentityDetails {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsIdentityDetails(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsIdentityDetails obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsIdentityDetails(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsIdentityDetails() {
    this(RetroshareJNI.new_RsIdentityDetails(), true);
  }

  public void setMId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsIdentityDetails_mId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsIdentityDetails_mId_get(swigCPtr, this), true);
  }

  public void setMNickname(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsIdentityDetails_mNickname_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMNickname() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsIdentityDetails_mNickname_get(swigCPtr, this), true);
  }

  public void setMIsOwnId(boolean value) {
    RetroshareJNI.RsIdentityDetails_mIsOwnId_set(swigCPtr, this, value);
  }

  public boolean getMIsOwnId() {
    return RetroshareJNI.RsIdentityDetails_mIsOwnId_get(swigCPtr, this);
  }

  public void setMPgpLinked(boolean value) {
    RetroshareJNI.RsIdentityDetails_mPgpLinked_set(swigCPtr, this, value);
  }

  public boolean getMPgpLinked() {
    return RetroshareJNI.RsIdentityDetails_mPgpLinked_get(swigCPtr, this);
  }

  public void setMPgpKnown(boolean value) {
    RetroshareJNI.RsIdentityDetails_mPgpKnown_set(swigCPtr, this, value);
  }

  public boolean getMPgpKnown() {
    return RetroshareJNI.RsIdentityDetails_mPgpKnown_get(swigCPtr, this);
  }

  public void setMPgpId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsIdentityDetails_mPgpId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMPgpId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsIdentityDetails_mPgpId_get(swigCPtr, this), true);
  }

  public void setMOpinion(double value) {
    RetroshareJNI.RsIdentityDetails_mOpinion_set(swigCPtr, this, value);
  }

  public double getMOpinion() {
    return RetroshareJNI.RsIdentityDetails_mOpinion_get(swigCPtr, this);
  }

  public void setMReputation(double value) {
    RetroshareJNI.RsIdentityDetails_mReputation_set(swigCPtr, this, value);
  }

  public double getMReputation() {
    return RetroshareJNI.RsIdentityDetails_mReputation_get(swigCPtr, this);
  }

}