/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsNetService extends RsNetworkExchangeService {
  private long swigCPtr;

  protected RsGxsNetService(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsGxsNetService_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsNetService obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsNetService(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static long getFRAGMENT_SIZE() {
    return RetroshareJNI.RsGxsNetService_FRAGMENT_SIZE_get();
  }

  public RsGxsNetService(int servType, RsGeneralDataService gds, RsNxsNetMgr netMgr, RsNxsObserver nxsObs, RsGixsReputation repuations, RsGcxs circles) {
    this(RetroshareJNI.new_RsGxsNetService__SWIG_0(servType, RsGeneralDataService.getCPtr(gds), gds, RsNxsNetMgr.getCPtr(netMgr), netMgr, RsNxsObserver.getCPtr(nxsObs), nxsObs, RsGixsReputation.getCPtr(repuations), repuations, RsGcxs.getCPtr(circles), circles), true);
  }

  public RsGxsNetService(int servType, RsGeneralDataService gds, RsNxsNetMgr netMgr, RsNxsObserver nxsObs, RsGixsReputation repuations) {
    this(RetroshareJNI.new_RsGxsNetService__SWIG_1(servType, RsGeneralDataService.getCPtr(gds), gds, RsNxsNetMgr.getCPtr(netMgr), netMgr, RsNxsObserver.getCPtr(nxsObs), nxsObs, RsGixsReputation.getCPtr(repuations), repuations), true);
  }

  public RsGxsNetService(int servType, RsGeneralDataService gds, RsNxsNetMgr netMgr, RsNxsObserver nxsObs) {
    this(RetroshareJNI.new_RsGxsNetService__SWIG_2(servType, RsGeneralDataService.getCPtr(gds), gds, RsNxsNetMgr.getCPtr(netMgr), netMgr, RsNxsObserver.getCPtr(nxsObs), nxsObs), true);
  }

  public RsGxsNetService(int servType, RsGeneralDataService gds, RsNxsNetMgr netMgr) {
    this(RetroshareJNI.new_RsGxsNetService__SWIG_3(servType, RsGeneralDataService.getCPtr(gds), gds, RsNxsNetMgr.getCPtr(netMgr), netMgr), true);
  }

  public void setSyncAge(long age) {
    RetroshareJNI.RsGxsNetService_setSyncAge(swigCPtr, this, age);
  }

  public void requestGroupsOfPeer(SWIGTYPE_p_std__string peerId) {
    RetroshareJNI.RsGxsNetService_requestGroupsOfPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public void requestMessagesOfPeer(SWIGTYPE_p_std__string peerId, SWIGTYPE_p_std__string grpId) {
    RetroshareJNI.RsGxsNetService_requestMessagesOfPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peerId), SWIGTYPE_p_std__string.getCPtr(grpId));
  }

  public void pauseSynchronisation(boolean enabled) {
    RetroshareJNI.RsGxsNetService_pauseSynchronisation(swigCPtr, this, enabled);
  }

  public int requestMsg(SWIGTYPE_p_std__string msgId, short hops) {
    return RetroshareJNI.RsGxsNetService_requestMsg(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(msgId), hops);
  }

  public int requestGrp(SWIGTYPE_p_std__listT_std__string_t grpId, short hops) {
    return RetroshareJNI.RsGxsNetService_requestGrp(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(grpId), hops);
  }

  public boolean loadList(SWIGTYPE_p_std__listT_RsItem_p_t load) {
    return RetroshareJNI.RsGxsNetService_loadList(swigCPtr, this, SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(load));
  }

  public boolean saveList(SWIGTYPE_p_bool cleanup, SWIGTYPE_p_std__listT_RsItem_p_t arg1) {
    return RetroshareJNI.RsGxsNetService_saveList(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(cleanup), SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(arg1));
  }

  public RsSerialiser setupSerialiser() {
    long cPtr = RetroshareJNI.RsGxsNetService_setupSerialiser(swigCPtr, this);
    return (cPtr == 0) ? null : new RsSerialiser(cPtr, false);
  }

  public int tick() {
    return RetroshareJNI.RsGxsNetService_tick(swigCPtr, this);
  }

  public void run() {
    RetroshareJNI.RsGxsNetService_run(swigCPtr, this);
  }

}