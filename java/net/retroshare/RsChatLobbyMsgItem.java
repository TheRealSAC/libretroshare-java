/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsChatLobbyMsgItem extends RsChatMsgItem {
  private long swigCPtr;

  protected RsChatLobbyMsgItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsChatLobbyMsgItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsChatLobbyMsgItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsChatLobbyMsgItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsChatLobbyMsgItem() {
    this(RetroshareJNI.new_RsChatLobbyMsgItem__SWIG_0(), true);
  }

  public RsChatLobbyMsgItem(SWIGTYPE_p_void data, long size) {
    this(RetroshareJNI.new_RsChatLobbyMsgItem__SWIG_1(SWIGTYPE_p_void.getCPtr(data), size), true);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsChatLobbyMsgItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsChatLobbyMsgItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public RsChatLobbyBouncingObject duplicate() {
    long cPtr = RetroshareJNI.RsChatLobbyMsgItem_duplicate(swigCPtr, this);
    return (cPtr == 0) ? null : new RsChatLobbyBouncingObject(cPtr, false);
  }

  public boolean serialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsChatLobbyMsgItem_serialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public long serial_size() {
    return RetroshareJNI.RsChatLobbyMsgItem_serial_size(swigCPtr, this);
  }

  public void setSubpacket_id(short value) {
    RetroshareJNI.RsChatLobbyMsgItem_subpacket_id_set(swigCPtr, this, value);
  }

  public short getSubpacket_id() {
    return RetroshareJNI.RsChatLobbyMsgItem_subpacket_id_get(swigCPtr, this);
  }

  public void setParent_msg_id(java.math.BigInteger value) {
    RetroshareJNI.RsChatLobbyMsgItem_parent_msg_id_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getParent_msg_id() {
    return RetroshareJNI.RsChatLobbyMsgItem_parent_msg_id_get(swigCPtr, this);
  }

}
