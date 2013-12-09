/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNxsMsg extends RsNxsItem {
  private long swigCPtr;

  protected RsNxsMsg(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsNxsMsg_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNxsMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNxsMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void clear() {
    RetroshareJNI.RsNxsMsg_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsNxsMsg_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public void setPos(short value) {
    RetroshareJNI.RsNxsMsg_pos_set(swigCPtr, this, value);
  }

  public short getPos() {
    return RetroshareJNI.RsNxsMsg_pos_get(swigCPtr, this);
  }

  public void setCount(short value) {
    RetroshareJNI.RsNxsMsg_count_set(swigCPtr, this, value);
  }

  public short getCount() {
    return RetroshareJNI.RsNxsMsg_count_get(swigCPtr, this);
  }

  public void setGrpId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsNxsMsg_grpId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGrpId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsNxsMsg_grpId_get(swigCPtr, this), true);
  }

  public void setMsgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsNxsMsg_msgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMsgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsNxsMsg_msgId_get(swigCPtr, this), true);
  }

  public static void setRefcount(int value) {
    RetroshareJNI.RsNxsMsg_refcount_set(value);
  }

  public static int getRefcount() {
    return RetroshareJNI.RsNxsMsg_refcount_get();
  }

  public void setMeta(RsTlvBinaryData value) {
    RetroshareJNI.RsNxsMsg_meta_set(swigCPtr, this, RsTlvBinaryData.getCPtr(value), value);
  }

  public RsTlvBinaryData getMeta() {
    long cPtr = RetroshareJNI.RsNxsMsg_meta_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvBinaryData(cPtr, false);
  }

  public void setMsg(RsTlvBinaryData value) {
    RetroshareJNI.RsNxsMsg_msg_set(swigCPtr, this, RsTlvBinaryData.getCPtr(value), value);
  }

  public RsTlvBinaryData getMsg() {
    long cPtr = RetroshareJNI.RsNxsMsg_msg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvBinaryData(cPtr, false);
  }

  public void setMetaData(RsGxsMsgMetaData value) {
    RetroshareJNI.RsNxsMsg_metaData_set(swigCPtr, this, RsGxsMsgMetaData.getCPtr(value), value);
  }

  public RsGxsMsgMetaData getMetaData() {
    long cPtr = RetroshareJNI.RsNxsMsg_metaData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsGxsMsgMetaData(cPtr, false);
  }

}
