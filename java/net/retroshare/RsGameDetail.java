/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGameDetail {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsGameDetail(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGameDetail obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGameDetail(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setGameId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGameDetail_gameId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGameId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameDetail_gameId_get(swigCPtr, this), true);
  }

  public void setGameType(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGameDetail_gameType_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGameType() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameDetail_gameType_get(swigCPtr, this), true);
  }

  public void setGameName(SWIGTYPE_p_std__wstring value) {
    RetroshareJNI.RsGameDetail_gameName_set(swigCPtr, this, SWIGTYPE_p_std__wstring.getCPtr(value));
  }

  public SWIGTYPE_p_std__wstring getGameName() {
    return new SWIGTYPE_p_std__wstring(RetroshareJNI.RsGameDetail_gameName_get(swigCPtr, this), true);
  }

  public void setAreServer(boolean value) {
    RetroshareJNI.RsGameDetail_areServer_set(swigCPtr, this, value);
  }

  public boolean getAreServer() {
    return RetroshareJNI.RsGameDetail_areServer_get(swigCPtr, this);
  }

  public void setServerId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGameDetail_serverId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getServerId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameDetail_serverId_get(swigCPtr, this), true);
  }

  public void setServerName(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGameDetail_serverName_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getServerName() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameDetail_serverName_get(swigCPtr, this), true);
  }

  public void setStatus(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsGameDetail_status_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getStatus() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameDetail_status_get(swigCPtr, this), true);
  }

  public void setNumPlayers(int value) {
    RetroshareJNI.RsGameDetail_numPlayers_set(swigCPtr, this, value);
  }

  public int getNumPlayers() {
    return RetroshareJNI.RsGameDetail_numPlayers_get(swigCPtr, this);
  }

  public void setGamers(SWIGTYPE_p_std__mapT_std__string_RsGamePeer_t value) {
    RetroshareJNI.RsGameDetail_gamers_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_RsGamePeer_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_RsGamePeer_t getGamers() {
    long cPtr = RetroshareJNI.RsGameDetail_gamers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_std__string_RsGamePeer_t(cPtr, false);
  }

  public RsGameDetail() {
    this(RetroshareJNI.new_RsGameDetail(), true);
  }

}