/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3Msgs extends RsMsgs {
  private long swigCPtr;

  protected p3Msgs(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3Msgs_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3Msgs obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3Msgs(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean getMessageSummaries(SWIGTYPE_p_std__listT_MsgInfoSummary_t msgList) {
    return RetroshareJNI.p3Msgs_getMessageSummaries(swigCPtr, this, SWIGTYPE_p_std__listT_MsgInfoSummary_t.getCPtr(msgList));
  }

  public boolean getMessage(SWIGTYPE_p_std__string mId, MessageInfo msg) {
    return RetroshareJNI.p3Msgs_getMessage(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mId), MessageInfo.getCPtr(msg), msg);
  }

  public void getMessageCount(SWIGTYPE_p_unsigned_int pnInbox, SWIGTYPE_p_unsigned_int pnInboxNew, SWIGTYPE_p_unsigned_int pnOutbox, SWIGTYPE_p_unsigned_int pnDraftbox, SWIGTYPE_p_unsigned_int pnSentbox, SWIGTYPE_p_unsigned_int pnTrashbox) {
    RetroshareJNI.p3Msgs_getMessageCount(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(pnInbox), SWIGTYPE_p_unsigned_int.getCPtr(pnInboxNew), SWIGTYPE_p_unsigned_int.getCPtr(pnOutbox), SWIGTYPE_p_unsigned_int.getCPtr(pnDraftbox), SWIGTYPE_p_unsigned_int.getCPtr(pnSentbox), SWIGTYPE_p_unsigned_int.getCPtr(pnTrashbox));
  }

  public boolean MessageSend(MessageInfo info) {
    return RetroshareJNI.p3Msgs_MessageSend(swigCPtr, this, MessageInfo.getCPtr(info), info);
  }

  public boolean decryptMessage(SWIGTYPE_p_std__string mid) {
    return RetroshareJNI.p3Msgs_decryptMessage(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid));
  }

  public boolean SystemMessage(SWIGTYPE_p_std__wstring title, SWIGTYPE_p_std__wstring message, long systemFlag) {
    return RetroshareJNI.p3Msgs_SystemMessage(swigCPtr, this, SWIGTYPE_p_std__wstring.getCPtr(title), SWIGTYPE_p_std__wstring.getCPtr(message), systemFlag);
  }

  public boolean MessageToDraft(MessageInfo info, SWIGTYPE_p_std__string msgParentId) {
    return RetroshareJNI.p3Msgs_MessageToDraft(swigCPtr, this, MessageInfo.getCPtr(info), info, SWIGTYPE_p_std__string.getCPtr(msgParentId));
  }

  public boolean MessageToTrash(SWIGTYPE_p_std__string mid, boolean bTrash) {
    return RetroshareJNI.p3Msgs_MessageToTrash(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid), bTrash);
  }

  public boolean MessageDelete(SWIGTYPE_p_std__string mid) {
    return RetroshareJNI.p3Msgs_MessageDelete(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid));
  }

  public boolean MessageRead(SWIGTYPE_p_std__string mid, boolean unreadByUser) {
    return RetroshareJNI.p3Msgs_MessageRead(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid), unreadByUser);
  }

  public boolean MessageReplied(SWIGTYPE_p_std__string mid, boolean replied) {
    return RetroshareJNI.p3Msgs_MessageReplied(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid), replied);
  }

  public boolean MessageForwarded(SWIGTYPE_p_std__string mid, boolean forwarded) {
    return RetroshareJNI.p3Msgs_MessageForwarded(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid), forwarded);
  }

  public boolean MessageStar(SWIGTYPE_p_std__string mid, boolean star) {
    return RetroshareJNI.p3Msgs_MessageStar(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid), star);
  }

  public boolean MessageLoadEmbeddedImages(SWIGTYPE_p_std__string mid, boolean load) {
    return RetroshareJNI.p3Msgs_MessageLoadEmbeddedImages(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(mid), load);
  }

  public boolean getMsgParentId(SWIGTYPE_p_std__string msgId, SWIGTYPE_p_std__string msgParentId) {
    return RetroshareJNI.p3Msgs_getMsgParentId(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(msgId), SWIGTYPE_p_std__string.getCPtr(msgParentId));
  }

  public boolean getMessageTagTypes(MsgTagType tags) {
    return RetroshareJNI.p3Msgs_getMessageTagTypes(swigCPtr, this, MsgTagType.getCPtr(tags), tags);
  }

  public boolean setMessageTagType(long tagId, SWIGTYPE_p_std__string text, long rgb_color) {
    return RetroshareJNI.p3Msgs_setMessageTagType(swigCPtr, this, tagId, SWIGTYPE_p_std__string.getCPtr(text), rgb_color);
  }

  public boolean removeMessageTagType(long tagId) {
    return RetroshareJNI.p3Msgs_removeMessageTagType(swigCPtr, this, tagId);
  }

  public boolean getMessageTag(SWIGTYPE_p_std__string msgId, MsgTagInfo info) {
    return RetroshareJNI.p3Msgs_getMessageTag(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(msgId), MsgTagInfo.getCPtr(info), info);
  }

  public boolean setMessageTag(SWIGTYPE_p_std__string msgId, long tagId, boolean set) {
    return RetroshareJNI.p3Msgs_setMessageTag(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(msgId), tagId, set);
  }

  public boolean resetMessageStandardTagTypes(MsgTagType tags) {
    return RetroshareJNI.p3Msgs_resetMessageStandardTagTypes(swigCPtr, this, MsgTagType.getCPtr(tags), tags);
  }

  public boolean createDistantOfflineMessengingInvite(SWIGTYPE_p_time_t arg0, SWIGTYPE_p_std__string arg1) {
    return RetroshareJNI.p3Msgs_createDistantOfflineMessengingInvite(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1));
  }

  public boolean getDistantOfflineMessengingInvites(SWIGTYPE_p_std__vectorT_DistantOfflineMessengingInvite_t arg0) {
    return RetroshareJNI.p3Msgs_getDistantOfflineMessengingInvites(swigCPtr, this, SWIGTYPE_p_std__vectorT_DistantOfflineMessengingInvite_t.getCPtr(arg0));
  }

  public void enableDistantMessaging(boolean b) {
    RetroshareJNI.p3Msgs_enableDistantMessaging(swigCPtr, this, b);
  }

  public boolean distantMessagingEnabled() {
    return RetroshareJNI.p3Msgs_distantMessagingEnabled(swigCPtr, this);
  }

  public boolean getDistantMessageHash(SWIGTYPE_p_std__string pgp_id, SWIGTYPE_p_std__string hash) {
    return RetroshareJNI.p3Msgs_getDistantMessageHash(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(pgp_id), SWIGTYPE_p_std__string.getCPtr(hash));
  }

  public void getAvatarData(SWIGTYPE_p_std__string pid, SWIGTYPE_p_p_unsigned_char data, SWIGTYPE_p_int size) {
    RetroshareJNI.p3Msgs_getAvatarData(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(pid), SWIGTYPE_p_p_unsigned_char.getCPtr(data), SWIGTYPE_p_int.getCPtr(size));
  }

  public void setOwnAvatarData(SWIGTYPE_p_unsigned_char data, int size) {
    RetroshareJNI.p3Msgs_setOwnAvatarData(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), size);
  }

  public void getOwnAvatarData(SWIGTYPE_p_p_unsigned_char data, SWIGTYPE_p_int size) {
    RetroshareJNI.p3Msgs_getOwnAvatarData(swigCPtr, this, SWIGTYPE_p_p_unsigned_char.getCPtr(data), SWIGTYPE_p_int.getCPtr(size));
  }

  public void setCustomStateString(SWIGTYPE_p_std__string status_string) {
    RetroshareJNI.p3Msgs_setCustomStateString(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(status_string));
  }

  public SWIGTYPE_p_std__string getCustomStateString() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3Msgs_getCustomStateString__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__string getCustomStateString(SWIGTYPE_p_std__string peer_id) {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3Msgs_getCustomStateString__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peer_id)), true);
  }

  public boolean sendPublicChat(SWIGTYPE_p_std__wstring msg) {
    return RetroshareJNI.p3Msgs_sendPublicChat(swigCPtr, this, SWIGTYPE_p_std__wstring.getCPtr(msg));
  }

  public boolean sendPrivateChat(SWIGTYPE_p_std__string id, SWIGTYPE_p_std__wstring msg) {
    return RetroshareJNI.p3Msgs_sendPrivateChat(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_std__wstring.getCPtr(msg));
  }

  public int getPublicChatQueueCount() {
    return RetroshareJNI.p3Msgs_getPublicChatQueueCount(swigCPtr, this);
  }

  public boolean getPublicChatQueue(SWIGTYPE_p_std__listT_ChatInfo_t chats) {
    return RetroshareJNI.p3Msgs_getPublicChatQueue(swigCPtr, this, SWIGTYPE_p_std__listT_ChatInfo_t.getCPtr(chats));
  }

  public int getPrivateChatQueueCount(boolean incoming) {
    return RetroshareJNI.p3Msgs_getPrivateChatQueueCount(swigCPtr, this, incoming);
  }

  public boolean getPrivateChatQueueIds(boolean incoming, SWIGTYPE_p_std__listT_std__string_t ids) {
    return RetroshareJNI.p3Msgs_getPrivateChatQueueIds(swigCPtr, this, incoming, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public boolean getPrivateChatQueue(boolean incoming, SWIGTYPE_p_std__string id, SWIGTYPE_p_std__listT_ChatInfo_t chats) {
    return RetroshareJNI.p3Msgs_getPrivateChatQueue(swigCPtr, this, incoming, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_std__listT_ChatInfo_t.getCPtr(chats));
  }

  public boolean clearPrivateChatQueue(boolean incoming, SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3Msgs_clearPrivateChatQueue(swigCPtr, this, incoming, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public void sendStatusString(SWIGTYPE_p_std__string peer_id, SWIGTYPE_p_std__string status_string) {
    RetroshareJNI.p3Msgs_sendStatusString(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peer_id), SWIGTYPE_p_std__string.getCPtr(status_string));
  }

  public void sendGroupChatStatusString(SWIGTYPE_p_std__string status_string) {
    RetroshareJNI.p3Msgs_sendGroupChatStatusString(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(status_string));
  }

  public boolean joinVisibleChatLobby(java.math.BigInteger id) {
    return RetroshareJNI.p3Msgs_joinVisibleChatLobby(swigCPtr, this, id);
  }

  public void getListOfNearbyChatLobbies(SWIGTYPE_p_std__vectorT_VisibleChatLobbyRecord_t public_lobbies) {
    RetroshareJNI.p3Msgs_getListOfNearbyChatLobbies(swigCPtr, this, SWIGTYPE_p_std__vectorT_VisibleChatLobbyRecord_t.getCPtr(public_lobbies));
  }

  public boolean getVirtualPeerId(java.math.BigInteger id, SWIGTYPE_p_std__string vpid) {
    return RetroshareJNI.p3Msgs_getVirtualPeerId(swigCPtr, this, id, SWIGTYPE_p_std__string.getCPtr(vpid));
  }

  public boolean isLobbyId(SWIGTYPE_p_std__string virtual_peer_id, SWIGTYPE_p_unsigned_long_long lobby_id) {
    return RetroshareJNI.p3Msgs_isLobbyId(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(virtual_peer_id), SWIGTYPE_p_unsigned_long_long.getCPtr(lobby_id));
  }

  public void getChatLobbyList(SWIGTYPE_p_std__listT_ChatLobbyInfo_std__allocatorT_ChatLobbyInfo_t_t arg0) {
    RetroshareJNI.p3Msgs_getChatLobbyList(swigCPtr, this, SWIGTYPE_p_std__listT_ChatLobbyInfo_std__allocatorT_ChatLobbyInfo_t_t.getCPtr(arg0));
  }

  public void invitePeerToLobby(java.math.BigInteger arg0, SWIGTYPE_p_std__string arg1) {
    RetroshareJNI.p3Msgs_invitePeerToLobby(swigCPtr, this, arg0, SWIGTYPE_p_std__string.getCPtr(arg1));
  }

  public boolean acceptLobbyInvite(java.math.BigInteger id) {
    return RetroshareJNI.p3Msgs_acceptLobbyInvite(swigCPtr, this, id);
  }

  public void denyLobbyInvite(java.math.BigInteger id) {
    RetroshareJNI.p3Msgs_denyLobbyInvite(swigCPtr, this, id);
  }

  public void getPendingChatLobbyInvites(SWIGTYPE_p_std__listT_ChatLobbyInvite_t invites) {
    RetroshareJNI.p3Msgs_getPendingChatLobbyInvites(swigCPtr, this, SWIGTYPE_p_std__listT_ChatLobbyInvite_t.getCPtr(invites));
  }

  public void unsubscribeChatLobby(java.math.BigInteger lobby_id) {
    RetroshareJNI.p3Msgs_unsubscribeChatLobby(swigCPtr, this, lobby_id);
  }

  public boolean setNickNameForChatLobby(java.math.BigInteger lobby_id, SWIGTYPE_p_std__string arg1) {
    return RetroshareJNI.p3Msgs_setNickNameForChatLobby(swigCPtr, this, lobby_id, SWIGTYPE_p_std__string.getCPtr(arg1));
  }

  public boolean getNickNameForChatLobby(java.math.BigInteger arg0, SWIGTYPE_p_std__string nick) {
    return RetroshareJNI.p3Msgs_getNickNameForChatLobby(swigCPtr, this, arg0, SWIGTYPE_p_std__string.getCPtr(nick));
  }

  public boolean setDefaultNickNameForChatLobby(SWIGTYPE_p_std__string arg0) {
    return RetroshareJNI.p3Msgs_setDefaultNickNameForChatLobby(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0));
  }

  public boolean getDefaultNickNameForChatLobby(SWIGTYPE_p_std__string nick) {
    return RetroshareJNI.p3Msgs_getDefaultNickNameForChatLobby(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(nick));
  }

  public void setLobbyAutoSubscribe(java.math.BigInteger lobby_id, boolean autoSubscribe) {
    RetroshareJNI.p3Msgs_setLobbyAutoSubscribe(swigCPtr, this, lobby_id, autoSubscribe);
  }

  public boolean getLobbyAutoSubscribe(java.math.BigInteger lobby_id) {
    return RetroshareJNI.p3Msgs_getLobbyAutoSubscribe(swigCPtr, this, lobby_id);
  }

  public java.math.BigInteger createChatLobby(SWIGTYPE_p_std__string lobby_name, SWIGTYPE_p_std__string lobby_topic, SWIGTYPE_p_std__listT_std__string_t invited_friends, long privacy_type) {
    return RetroshareJNI.p3Msgs_createChatLobby(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(lobby_name), SWIGTYPE_p_std__string.getCPtr(lobby_topic), SWIGTYPE_p_std__listT_std__string_t.getCPtr(invited_friends), privacy_type);
  }

  public boolean createDistantChatInvite(SWIGTYPE_p_std__string pgp_id, SWIGTYPE_p_time_t time_of_validity, SWIGTYPE_p_std__string encrypted_string) {
    return RetroshareJNI.p3Msgs_createDistantChatInvite(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(pgp_id), SWIGTYPE_p_time_t.getCPtr(time_of_validity), SWIGTYPE_p_std__string.getCPtr(encrypted_string));
  }

  public boolean getDistantChatInviteList(SWIGTYPE_p_std__vectorT_DistantChatInviteInfo_t invites) {
    return RetroshareJNI.p3Msgs_getDistantChatInviteList(swigCPtr, this, SWIGTYPE_p_std__vectorT_DistantChatInviteInfo_t.getCPtr(invites));
  }

  public boolean initiateDistantChatConnexion(SWIGTYPE_p_std__string encrypted_string, SWIGTYPE_p_time_t validity_time, SWIGTYPE_p_std__string hash, SWIGTYPE_p_unsigned_int error_code) {
    return RetroshareJNI.p3Msgs_initiateDistantChatConnexion__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(encrypted_string), SWIGTYPE_p_time_t.getCPtr(validity_time), SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_unsigned_int.getCPtr(error_code));
  }

  public boolean initiateDistantChatConnexion(SWIGTYPE_p_std__string hash, SWIGTYPE_p_unsigned_int error_code) {
    return RetroshareJNI.p3Msgs_initiateDistantChatConnexion__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_unsigned_int.getCPtr(error_code));
  }

  public boolean getDistantChatStatus(SWIGTYPE_p_std__string hash, SWIGTYPE_p_unsigned_int status, SWIGTYPE_p_std__string pgp_id) {
    return RetroshareJNI.p3Msgs_getDistantChatStatus(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_unsigned_int.getCPtr(status), SWIGTYPE_p_std__string.getCPtr(pgp_id));
  }

  public boolean closeDistantChatConnexion(SWIGTYPE_p_std__string hash) {
    return RetroshareJNI.p3Msgs_closeDistantChatConnexion(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash));
  }

  public boolean removeDistantChatInvite(SWIGTYPE_p_std__string hash) {
    return RetroshareJNI.p3Msgs_removeDistantChatInvite(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash));
  }

}
