/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class GroupKey {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GroupKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GroupKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_GroupKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GroupKey() {
    this(RetroshareJNI.new_GroupKey(), true);
  }

  public void setType(long value) {
    RetroshareJNI.GroupKey_type_set(swigCPtr, this, value);
  }

  public long getType() {
    return RetroshareJNI.GroupKey_type_get(swigCPtr, this);
  }

  public void setKeyId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.GroupKey_keyId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getKeyId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.GroupKey_keyId_get(swigCPtr, this), true);
  }

  public void setStartTS(SWIGTYPE_p_time_t value) {
    RetroshareJNI.GroupKey_startTS_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getStartTS() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.GroupKey_startTS_get(swigCPtr, this), true);
  }

  public void setEndTS(SWIGTYPE_p_time_t value) {
    RetroshareJNI.GroupKey_endTS_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getEndTS() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.GroupKey_endTS_get(swigCPtr, this), true);
  }

  public void setKey(SWIGTYPE_p_EVP_PKEY value) {
    RetroshareJNI.GroupKey_key_set(swigCPtr, this, SWIGTYPE_p_EVP_PKEY.getCPtr(value));
  }

  public SWIGTYPE_p_EVP_PKEY getKey() {
    long cPtr = RetroshareJNI.GroupKey_key_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_EVP_PKEY(cPtr, false);
  }

}
