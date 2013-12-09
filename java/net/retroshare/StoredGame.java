/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class StoredGame {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected StoredGame(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StoredGame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_StoredGame(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setGameId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.StoredGame_gameId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGameId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.StoredGame_gameId_get(swigCPtr, this), true);
  }

  public void setStartTime(SWIGTYPE_p_time_t value) {
    RetroshareJNI.StoredGame_startTime_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getStartTime() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.StoredGame_startTime_get(swigCPtr, this), true);
  }

  public void setPeerIds(SWIGTYPE_p_std__listT_std__string_t value) {
    RetroshareJNI.StoredGame_peerIds_set(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__listT_std__string_t getPeerIds() {
    return new SWIGTYPE_p_std__listT_std__string_t(RetroshareJNI.StoredGame_peerIds_get(swigCPtr, this), true);
  }

  public StoredGame() {
    this(RetroshareJNI.new_StoredGame(), true);
  }

}
