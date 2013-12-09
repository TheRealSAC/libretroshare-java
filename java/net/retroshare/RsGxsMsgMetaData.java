/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsMsgMetaData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsGxsMsgMetaData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsMsgMetaData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsMsgMetaData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsGxsMsgMetaData() {
    this(RetroshareJNI.new_RsGxsMsgMetaData(), true);
  }

  public boolean deserialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsGxsMsgMetaData_deserialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public boolean serialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsGxsMsgMetaData_serialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public long serial_size() {
    return RetroshareJNI.RsGxsMsgMetaData_serial_size(swigCPtr, this);
  }

  public void clear() {
    RetroshareJNI.RsGxsMsgMetaData_clear(swigCPtr, this);
  }

  public void setMGroupId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mGroupId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMGroupId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mGroupId_get(swigCPtr, this), true);
  }

  public void setMMsgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mMsgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMMsgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mMsgId_get(swigCPtr, this), true);
  }

  public static void setRefcount(int value) {
    RetroshareJNI.RsGxsMsgMetaData_refcount_set(value);
  }

  public static int getRefcount() {
    return RetroshareJNI.RsGxsMsgMetaData_refcount_get();
  }

  public void setMThreadId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mThreadId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMThreadId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mThreadId_get(swigCPtr, this), true);
  }

  public void setMParentId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mParentId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMParentId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mParentId_get(swigCPtr, this), true);
  }

  public void setMOrigMsgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mOrigMsgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMOrigMsgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mOrigMsgId_get(swigCPtr, this), true);
  }

  public void setMAuthorId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mAuthorId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMAuthorId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mAuthorId_get(swigCPtr, this), true);
  }

  public void setSignSet(RsTlvKeySignatureSet value) {
    RetroshareJNI.RsGxsMsgMetaData_signSet_set(swigCPtr, this, RsTlvKeySignatureSet.getCPtr(value), value);
  }

  public RsTlvKeySignatureSet getSignSet() {
    long cPtr = RetroshareJNI.RsGxsMsgMetaData_signSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvKeySignatureSet(cPtr, false);
  }

  public void setMServiceString(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mServiceString_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMServiceString() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mServiceString_get(swigCPtr, this), true);
  }

  public void setMMsgName(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mMsgName_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMMsgName() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mMsgName_get(swigCPtr, this), true);
  }

  public void setMPublishTs(SWIGTYPE_p_time_t value) {
    RetroshareJNI.RsGxsMsgMetaData_mPublishTs_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMPublishTs() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.RsGxsMsgMetaData_mPublishTs_get(swigCPtr, this), true);
  }

  public void setMMsgFlags(long value) {
    RetroshareJNI.RsGxsMsgMetaData_mMsgFlags_set(swigCPtr, this, value);
  }

  public long getMMsgFlags() {
    return RetroshareJNI.RsGxsMsgMetaData_mMsgFlags_get(swigCPtr, this);
  }

  public void setMMsgStatus(long value) {
    RetroshareJNI.RsGxsMsgMetaData_mMsgStatus_set(swigCPtr, this, value);
  }

  public long getMMsgStatus() {
    return RetroshareJNI.RsGxsMsgMetaData_mMsgStatus_get(swigCPtr, this);
  }

  public void setMChildTs(SWIGTYPE_p_time_t value) {
    RetroshareJNI.RsGxsMsgMetaData_mChildTs_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMChildTs() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.RsGxsMsgMetaData_mChildTs_get(swigCPtr, this), true);
  }

  public void setMHash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGxsMsgMetaData_mHash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGxsMsgMetaData_mHash_get(swigCPtr, this), true);
  }

  public void setValidated(boolean value) {
    RetroshareJNI.RsGxsMsgMetaData_validated_set(swigCPtr, this, value);
  }

  public boolean getValidated() {
    return RetroshareJNI.RsGxsMsgMetaData_validated_get(swigCPtr, this);
  }

}