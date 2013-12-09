/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsCacheData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsCacheData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsCacheData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsCacheData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPid(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsCacheData_pid_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getPid() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsCacheData_pid_get(swigCPtr, this), true);
  }

  public void setCid(CacheId value) {
    RetroshareJNI.RsCacheData_cid_set(swigCPtr, this, CacheId.getCPtr(value), value);
  }

  public CacheId getCid() {
    long cPtr = RetroshareJNI.RsCacheData_cid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CacheId(cPtr, false);
  }

  public void setPath(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsCacheData_path_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getPath() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsCacheData_path_get(swigCPtr, this), true);
  }

  public void setName(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsCacheData_name_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getName() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsCacheData_name_get(swigCPtr, this), true);
  }

  public void setHash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsCacheData_hash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsCacheData_hash_get(swigCPtr, this), true);
  }

  public void setSize(java.math.BigInteger value) {
    RetroshareJNI.RsCacheData_size_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getSize() {
    return RetroshareJNI.RsCacheData_size_get(swigCPtr, this);
  }

  public void setRecvd(SWIGTYPE_p_time_t value) {
    RetroshareJNI.RsCacheData_recvd_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getRecvd() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.RsCacheData_recvd_get(swigCPtr, this), true);
  }

  public RsCacheData() {
    this(RetroshareJNI.new_RsCacheData(), true);
  }

}
