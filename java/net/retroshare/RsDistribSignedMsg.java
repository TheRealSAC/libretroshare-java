/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsDistribSignedMsg extends RsItem {
  private long swigCPtr;

  protected RsDistribSignedMsg(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsDistribSignedMsg_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDistribSignedMsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsDistribSignedMsg(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsDistribSignedMsg() {
    this(RetroshareJNI.new_RsDistribSignedMsg(), true);
  }

  public void clear() {
    RetroshareJNI.RsDistribSignedMsg_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsDistribSignedMsg_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsDistribSignedMsg_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setGrpId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsDistribSignedMsg_grpId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGrpId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsDistribSignedMsg_grpId_get(swigCPtr, this), true);
  }

  public void setMsgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsDistribSignedMsg_msgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMsgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsDistribSignedMsg_msgId_get(swigCPtr, this), true);
  }

  public void setFlags(long value) {
    RetroshareJNI.RsDistribSignedMsg_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return RetroshareJNI.RsDistribSignedMsg_flags_get(swigCPtr, this);
  }

  public void setTimestamp(long value) {
    RetroshareJNI.RsDistribSignedMsg_timestamp_set(swigCPtr, this, value);
  }

  public long getTimestamp() {
    return RetroshareJNI.RsDistribSignedMsg_timestamp_get(swigCPtr, this);
  }

  public void setPacket(RsTlvBinaryData value) {
    RetroshareJNI.RsDistribSignedMsg_packet_set(swigCPtr, this, RsTlvBinaryData.getCPtr(value), value);
  }

  public RsTlvBinaryData getPacket() {
    long cPtr = RetroshareJNI.RsDistribSignedMsg_packet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvBinaryData(cPtr, false);
  }

  public void setPublishSignature(RsTlvKeySignature value) {
    RetroshareJNI.RsDistribSignedMsg_publishSignature_set(swigCPtr, this, RsTlvKeySignature.getCPtr(value), value);
  }

  public RsTlvKeySignature getPublishSignature() {
    long cPtr = RetroshareJNI.RsDistribSignedMsg_publishSignature_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvKeySignature(cPtr, false);
  }

  public void setPersonalSignature(RsTlvKeySignature value) {
    RetroshareJNI.RsDistribSignedMsg_personalSignature_set(swigCPtr, this, RsTlvKeySignature.getCPtr(value), value);
  }

  public RsTlvKeySignature getPersonalSignature() {
    long cPtr = RetroshareJNI.RsDistribSignedMsg_personalSignature_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvKeySignature(cPtr, false);
  }

}