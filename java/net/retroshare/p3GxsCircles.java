/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3GxsCircles extends RsGxsCircleExchange {
  private long swigCPtr;

  protected p3GxsCircles(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3GxsCircles_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3GxsCircles obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3GxsCircles(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public p3GxsCircles(RsGeneralDataService gds, RsNetworkExchangeService nes, p3IdService identities) {
    this(RetroshareJNI.new_p3GxsCircles(RsGeneralDataService.getCPtr(gds), gds, RsNetworkExchangeService.getCPtr(nes), nes, p3IdService.getCPtr(identities), identities), true);
  }

  public boolean getCircleDetails(SWIGTYPE_p_std__string id, RsGxsCircleDetails details) {
    return RetroshareJNI.p3GxsCircles_getCircleDetails(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), RsGxsCircleDetails.getCPtr(details), details);
  }

  public boolean getCircleExternalIdList(SWIGTYPE_p_std__listT_std__string_t circleIds) {
    return RetroshareJNI.p3GxsCircles_getCircleExternalIdList(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(circleIds));
  }

  public boolean getCirclePersonalIdList(SWIGTYPE_p_std__listT_std__string_t circleIds) {
    return RetroshareJNI.p3GxsCircles_getCirclePersonalIdList(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(circleIds));
  }

  public boolean isLoaded(SWIGTYPE_p_std__string circleId) {
    return RetroshareJNI.p3GxsCircles_isLoaded(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(circleId));
  }

  public boolean loadCircle(SWIGTYPE_p_std__string circleId) {
    return RetroshareJNI.p3GxsCircles_loadCircle(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(circleId));
  }

  public int canSend(SWIGTYPE_p_std__string circleId, SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3GxsCircles_canSend(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(circleId), SWIGTYPE_p_std__string.getCPtr(id));
  }

  public int canReceive(SWIGTYPE_p_std__string circleId, SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3GxsCircles_canReceive(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(circleId), SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean recipients(SWIGTYPE_p_std__string circleId, SWIGTYPE_p_std__listT_std__string_t friendlist) {
    return RetroshareJNI.p3GxsCircles_recipients(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(circleId), SWIGTYPE_p_std__listT_std__string_t.getCPtr(friendlist));
  }

  public boolean getGroupData(long token, SWIGTYPE_p_std__vectorT_RsGxsCircleGroup_t groups) {
    return RetroshareJNI.p3GxsCircles_getGroupData(swigCPtr, this, token, SWIGTYPE_p_std__vectorT_RsGxsCircleGroup_t.getCPtr(groups));
  }

  public boolean createGroup(SWIGTYPE_p_unsigned_int token, RsGxsCircleGroup group) {
    return RetroshareJNI.p3GxsCircles_createGroup(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), RsGxsCircleGroup.getCPtr(group), group);
  }

  public void service_tick() {
    RetroshareJNI.p3GxsCircles_service_tick(swigCPtr, this);
  }

}
