/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class GroupSetFlagReq extends GxsRequest {
  private long swigCPtr;

  protected GroupSetFlagReq(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.GroupSetFlagReq_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GroupSetFlagReq obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_GroupSetFlagReq(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static void setFLAG_SUBSCRIBE(long value) {
    RetroshareJNI.GroupSetFlagReq_FLAG_SUBSCRIBE_set(value);
  }

  public static long getFLAG_SUBSCRIBE() {
    return RetroshareJNI.GroupSetFlagReq_FLAG_SUBSCRIBE_get();
  }

  public static void setFLAG_STATUS(long value) {
    RetroshareJNI.GroupSetFlagReq_FLAG_STATUS_set(value);
  }

  public static long getFLAG_STATUS() {
    return RetroshareJNI.GroupSetFlagReq_FLAG_STATUS_get();
  }

  public void setType(short value) {
    RetroshareJNI.GroupSetFlagReq_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return RetroshareJNI.GroupSetFlagReq_type_get(swigCPtr, this);
  }

  public void setFlag(long value) {
    RetroshareJNI.GroupSetFlagReq_flag_set(swigCPtr, this, value);
  }

  public long getFlag() {
    return RetroshareJNI.GroupSetFlagReq_flag_get(swigCPtr, this);
  }

  public void setFlagMask(long value) {
    RetroshareJNI.GroupSetFlagReq_flagMask_set(swigCPtr, this, value);
  }

  public long getFlagMask() {
    return RetroshareJNI.GroupSetFlagReq_flagMask_get(swigCPtr, this);
  }

  public void setGrpId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.GroupSetFlagReq_grpId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGrpId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.GroupSetFlagReq_grpId_get(swigCPtr, this), true);
  }

  public GroupSetFlagReq() {
    this(RetroshareJNI.new_GroupSetFlagReq(), true);
  }

}