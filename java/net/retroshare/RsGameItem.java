/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGameItem extends RsItem {
  private long swigCPtr;

  protected RsGameItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGameItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGameItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGameItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsGameItem() {
    this(RetroshareJNI.new_RsGameItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsGameItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGameItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsGameItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setServiceId(long value) {
    RetroshareJNI.RsGameItem_serviceId_set(swigCPtr, this, value);
  }

  public long getServiceId() {
    return RetroshareJNI.RsGameItem_serviceId_get(swigCPtr, this);
  }

  public void setNumPlayers(long value) {
    RetroshareJNI.RsGameItem_numPlayers_set(swigCPtr, this, value);
  }

  public long getNumPlayers() {
    return RetroshareJNI.RsGameItem_numPlayers_get(swigCPtr, this);
  }

  public void setMsg(long value) {
    RetroshareJNI.RsGameItem_msg_set(swigCPtr, this, value);
  }

  public long getMsg() {
    return RetroshareJNI.RsGameItem_msg_get(swigCPtr, this);
  }

  public void setGameId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGameItem_gameId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGameId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameItem_gameId_get(swigCPtr, this), true);
  }

  public void setGameComment(SWIGTYPE_p_std__wstring value) {
    RetroshareJNI.RsGameItem_gameComment_set(swigCPtr, this, SWIGTYPE_p_std__wstring.getCPtr(value));
  }

  public SWIGTYPE_p_std__wstring getGameComment() {
    return new SWIGTYPE_p_std__wstring(RetroshareJNI.RsGameItem_gameComment_get(swigCPtr, this), true);
  }

  public void setPlayers(RsTlvPeerIdSet value) {
    RetroshareJNI.RsGameItem_players_set(swigCPtr, this, RsTlvPeerIdSet.getCPtr(value), value);
  }

  public RsTlvPeerIdSet getPlayers() {
    long cPtr = RetroshareJNI.RsGameItem_players_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvPeerIdSet(cPtr, false);
  }

}
