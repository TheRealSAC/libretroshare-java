/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGameLauncher {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsGameLauncher(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGameLauncher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGameLauncher(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_std__string createGame(long gameType, SWIGTYPE_p_std__wstring name) {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsGameLauncher_createGame(swigCPtr, this, gameType, SWIGTYPE_p_std__wstring.getCPtr(name)), true);
  }

  public boolean deleteGame(SWIGTYPE_p_std__string gameId) {
    return RetroshareJNI.RsGameLauncher_deleteGame(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId));
  }

  public boolean inviteGame(SWIGTYPE_p_std__string gameId) {
    return RetroshareJNI.RsGameLauncher_inviteGame(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId));
  }

  public boolean playGame(SWIGTYPE_p_std__string gameId) {
    return RetroshareJNI.RsGameLauncher_playGame(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId));
  }

  public boolean invitePeer(SWIGTYPE_p_std__string gameId, SWIGTYPE_p_std__string peerId) {
    return RetroshareJNI.RsGameLauncher_invitePeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId), SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public boolean uninvitePeer(SWIGTYPE_p_std__string gameId, SWIGTYPE_p_std__string peerId) {
    return RetroshareJNI.RsGameLauncher_uninvitePeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId), SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public boolean confirmPeer(SWIGTYPE_p_std__string gameId, SWIGTYPE_p_std__string peerId, short pos) {
    return RetroshareJNI.RsGameLauncher_confirmPeer__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId), SWIGTYPE_p_std__string.getCPtr(peerId), pos);
  }

  public boolean confirmPeer(SWIGTYPE_p_std__string gameId, SWIGTYPE_p_std__string peerId) {
    return RetroshareJNI.RsGameLauncher_confirmPeer__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId), SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public boolean unconfirmPeer(SWIGTYPE_p_std__string gameId, SWIGTYPE_p_std__string peerId) {
    return RetroshareJNI.RsGameLauncher_unconfirmPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId), SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public boolean interestedPeer(SWIGTYPE_p_std__string gameId) {
    return RetroshareJNI.RsGameLauncher_interestedPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId));
  }

  public boolean uninterestedPeer(SWIGTYPE_p_std__string gameId) {
    return RetroshareJNI.RsGameLauncher_uninterestedPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId));
  }

  public boolean getGameList(SWIGTYPE_p_std__listT_RsGameInfo_t gameList) {
    return RetroshareJNI.RsGameLauncher_getGameList(swigCPtr, this, SWIGTYPE_p_std__listT_RsGameInfo_t.getCPtr(gameList));
  }

  public boolean getGameDetail(SWIGTYPE_p_std__string gameId, RsGameDetail detail) {
    return RetroshareJNI.RsGameLauncher_getGameDetail(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gameId), RsGameDetail.getCPtr(detail), detail);
  }

}