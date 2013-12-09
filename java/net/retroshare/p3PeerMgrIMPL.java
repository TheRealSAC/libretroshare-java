/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3PeerMgrIMPL extends p3PeerMgr {
  private long swigCPtr;

  protected p3PeerMgrIMPL(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3PeerMgrIMPL_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3PeerMgrIMPL obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3PeerMgrIMPL(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean addFriend(SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string gpg_id, long netMode, long visState, SWIGTYPE_p_time_t lastContact, SWIGTYPE_p_t_RsFlags32T_0x380912_t arg5) {
    return RetroshareJNI.p3PeerMgrIMPL_addFriend__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(gpg_id), netMode, visState, SWIGTYPE_p_time_t.getCPtr(lastContact), SWIGTYPE_p_t_RsFlags32T_0x380912_t.getCPtr(arg5));
  }

  public boolean addFriend(SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string gpg_id, long netMode, long visState, SWIGTYPE_p_time_t lastContact) {
    return RetroshareJNI.p3PeerMgrIMPL_addFriend__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(gpg_id), netMode, visState, SWIGTYPE_p_time_t.getCPtr(lastContact));
  }

  public boolean addFriend(SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string gpg_id, long netMode, long visState) {
    return RetroshareJNI.p3PeerMgrIMPL_addFriend__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(gpg_id), netMode, visState);
  }

  public boolean addFriend(SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string gpg_id, long netMode) {
    return RetroshareJNI.p3PeerMgrIMPL_addFriend__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(gpg_id), netMode);
  }

  public boolean addFriend(SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string gpg_id) {
    return RetroshareJNI.p3PeerMgrIMPL_addFriend__SWIG_4(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(gpg_id));
  }

  public boolean removeFriend(SWIGTYPE_p_std__string ssl_id, boolean removePgpId) {
    return RetroshareJNI.p3PeerMgrIMPL_removeFriend(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), removePgpId);
  }

  public boolean isFriend(SWIGTYPE_p_std__string ssl_id) {
    return RetroshareJNI.p3PeerMgrIMPL_isFriend(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id));
  }

  public boolean getAssociatedPeers(SWIGTYPE_p_std__string gpg_id, SWIGTYPE_p_std__listT_std__string_t ids) {
    return RetroshareJNI.p3PeerMgrIMPL_getAssociatedPeers(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gpg_id), SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public boolean removeAllFriendLocations(SWIGTYPE_p_std__string gpgid) {
    return RetroshareJNI.p3PeerMgrIMPL_removeAllFriendLocations(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gpgid));
  }

  public boolean addGroup(RsGroupInfo groupInfo) {
    return RetroshareJNI.p3PeerMgrIMPL_addGroup(swigCPtr, this, RsGroupInfo.getCPtr(groupInfo), groupInfo);
  }

  public boolean editGroup(SWIGTYPE_p_std__string groupId, RsGroupInfo groupInfo) {
    return RetroshareJNI.p3PeerMgrIMPL_editGroup(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(groupId), RsGroupInfo.getCPtr(groupInfo), groupInfo);
  }

  public boolean removeGroup(SWIGTYPE_p_std__string groupId) {
    return RetroshareJNI.p3PeerMgrIMPL_removeGroup(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(groupId));
  }

  public boolean getGroupInfo(SWIGTYPE_p_std__string groupId, RsGroupInfo groupInfo) {
    return RetroshareJNI.p3PeerMgrIMPL_getGroupInfo(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(groupId), RsGroupInfo.getCPtr(groupInfo), groupInfo);
  }

  public boolean getGroupInfoList(SWIGTYPE_p_std__listT_RsGroupInfo_t groupInfoList) {
    return RetroshareJNI.p3PeerMgrIMPL_getGroupInfoList(swigCPtr, this, SWIGTYPE_p_std__listT_RsGroupInfo_t.getCPtr(groupInfoList));
  }

  public boolean assignPeersToGroup(SWIGTYPE_p_std__string groupId, SWIGTYPE_p_std__listT_std__string_t peerIds, boolean assign) {
    return RetroshareJNI.p3PeerMgrIMPL_assignPeersToGroup(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(groupId), SWIGTYPE_p_std__listT_std__string_t.getCPtr(peerIds), assign);
  }

  public SWIGTYPE_p_t_RsFlags32T_0x380912_t servicePermissionFlags(SWIGTYPE_p_std__string gpg_id) {
    return new SWIGTYPE_p_t_RsFlags32T_0x380912_t(RetroshareJNI.p3PeerMgrIMPL_servicePermissionFlags(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gpg_id)), true);
  }

  public SWIGTYPE_p_t_RsFlags32T_0x380912_t servicePermissionFlags_sslid(SWIGTYPE_p_std__string ssl_id) {
    return new SWIGTYPE_p_t_RsFlags32T_0x380912_t(RetroshareJNI.p3PeerMgrIMPL_servicePermissionFlags_sslid(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id)), true);
  }

  public void setServicePermissionFlags(SWIGTYPE_p_std__string gpg_id, SWIGTYPE_p_t_RsFlags32T_0x380912_t flags) {
    RetroshareJNI.p3PeerMgrIMPL_setServicePermissionFlags(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gpg_id), SWIGTYPE_p_t_RsFlags32T_0x380912_t.getCPtr(flags));
  }

  public boolean setLocalAddress(SWIGTYPE_p_std__string id, SWIGTYPE_p_sockaddr_in addr) {
    return RetroshareJNI.p3PeerMgrIMPL_setLocalAddress(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_sockaddr_in.getCPtr(addr));
  }

  public boolean setExtAddress(SWIGTYPE_p_std__string id, SWIGTYPE_p_sockaddr_in addr) {
    return RetroshareJNI.p3PeerMgrIMPL_setExtAddress(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_sockaddr_in.getCPtr(addr));
  }

  public boolean setDynDNS(SWIGTYPE_p_std__string id, SWIGTYPE_p_std__string dyndns) {
    return RetroshareJNI.p3PeerMgrIMPL_setDynDNS(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_std__string.getCPtr(dyndns));
  }

  public boolean setNetworkMode(SWIGTYPE_p_std__string id, long netMode) {
    return RetroshareJNI.p3PeerMgrIMPL_setNetworkMode(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), netMode);
  }

  public boolean setVisState(SWIGTYPE_p_std__string id, long visState) {
    return RetroshareJNI.p3PeerMgrIMPL_setVisState(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), visState);
  }

  public boolean setLocation(SWIGTYPE_p_std__string pid, SWIGTYPE_p_std__string location) {
    return RetroshareJNI.p3PeerMgrIMPL_setLocation(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(pid), SWIGTYPE_p_std__string.getCPtr(location));
  }

  public boolean updateCurrentAddress(SWIGTYPE_p_std__string id, pqiIpAddress addr) {
    return RetroshareJNI.p3PeerMgrIMPL_updateCurrentAddress(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), pqiIpAddress.getCPtr(addr), addr);
  }

  public boolean updateLastContact(SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3PeerMgrIMPL_updateLastContact(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean updateAddressList(SWIGTYPE_p_std__string id, pqiIpAddrSet addrs) {
    return RetroshareJNI.p3PeerMgrIMPL_updateAddressList(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), pqiIpAddrSet.getCPtr(addrs), addrs);
  }

  public boolean UpdateOwnAddress(SWIGTYPE_p_sockaddr_in mLocalAddr, SWIGTYPE_p_sockaddr_in mExtAddr) {
    return RetroshareJNI.p3PeerMgrIMPL_UpdateOwnAddress(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(mLocalAddr), SWIGTYPE_p_sockaddr_in.getCPtr(mExtAddr));
  }

  public boolean getOwnNetStatus(peerState state) {
    return RetroshareJNI.p3PeerMgrIMPL_getOwnNetStatus(swigCPtr, this, peerState.getCPtr(state), state);
  }

  public boolean getFriendNetStatus(SWIGTYPE_p_std__string id, peerState state) {
    return RetroshareJNI.p3PeerMgrIMPL_getFriendNetStatus(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), peerState.getCPtr(state), state);
  }

  public boolean getOthersNetStatus(SWIGTYPE_p_std__string id, peerState state) {
    return RetroshareJNI.p3PeerMgrIMPL_getOthersNetStatus(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), peerState.getCPtr(state), state);
  }

  public boolean getPeerName(SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string name) {
    return RetroshareJNI.p3PeerMgrIMPL_getPeerName(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(name));
  }

  public boolean getGpgId(SWIGTYPE_p_std__string sslId, SWIGTYPE_p_std__string gpgId) {
    return RetroshareJNI.p3PeerMgrIMPL_getGpgId(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sslId), SWIGTYPE_p_std__string.getCPtr(gpgId));
  }

  public long getConnectionType(SWIGTYPE_p_std__string sslId) {
    return RetroshareJNI.p3PeerMgrIMPL_getConnectionType(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(sslId));
  }

  public int getFriendCount(boolean ssl, boolean online) {
    return RetroshareJNI.p3PeerMgrIMPL_getFriendCount(swigCPtr, this, ssl, online);
  }

  public boolean haveOnceConnected() {
    return RetroshareJNI.p3PeerMgrIMPL_haveOnceConnected(swigCPtr, this);
  }

  public p3PeerMgrIMPL(SWIGTYPE_p_std__string ssl_own_id, SWIGTYPE_p_std__string gpg_own_id, SWIGTYPE_p_std__string gpg_own_name, SWIGTYPE_p_std__string ssl_own_location) {
    this(RetroshareJNI.new_p3PeerMgrIMPL(SWIGTYPE_p_std__string.getCPtr(ssl_own_id), SWIGTYPE_p_std__string.getCPtr(gpg_own_id), SWIGTYPE_p_std__string.getCPtr(gpg_own_name), SWIGTYPE_p_std__string.getCPtr(ssl_own_location)), true);
  }

  public void setManagers(p3LinkMgrIMPL linkMgr, p3NetMgrIMPL netMgr) {
    RetroshareJNI.p3PeerMgrIMPL_setManagers(swigCPtr, this, p3LinkMgrIMPL.getCPtr(linkMgr), linkMgr, p3NetMgrIMPL.getCPtr(netMgr), netMgr);
  }

  public void tick() {
    RetroshareJNI.p3PeerMgrIMPL_tick(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string getOwnId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3PeerMgrIMPL_getOwnId(swigCPtr, this), true);
  }

  public boolean setOwnNetworkMode(long netMode) {
    return RetroshareJNI.p3PeerMgrIMPL_setOwnNetworkMode(swigCPtr, this, netMode);
  }

  public boolean setOwnVisState(long visState) {
    return RetroshareJNI.p3PeerMgrIMPL_setOwnVisState(swigCPtr, this, visState);
  }

  public int getConnectAddresses(SWIGTYPE_p_std__string id, SWIGTYPE_p_sockaddr_in lAddr, SWIGTYPE_p_sockaddr_in eAddr, pqiIpAddrSet histAddrs, SWIGTYPE_p_std__string dyndns) {
    return RetroshareJNI.p3PeerMgrIMPL_getConnectAddresses(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_sockaddr_in.getCPtr(lAddr), SWIGTYPE_p_sockaddr_in.getCPtr(eAddr), pqiIpAddrSet.getCPtr(histAddrs), histAddrs, SWIGTYPE_p_std__string.getCPtr(dyndns));
  }

}
