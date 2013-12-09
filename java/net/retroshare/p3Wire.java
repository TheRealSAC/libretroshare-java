/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3Wire extends RsGenExchange {
  private long swigCPtr;

  protected p3Wire(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3Wire_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3Wire obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3Wire(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public p3Wire(RsGeneralDataService gds, RsNetworkExchangeService nes, RsGixs gixs) {
    this(RetroshareJNI.new_p3Wire(RsGeneralDataService.getCPtr(gds), gds, RsNetworkExchangeService.getCPtr(nes), nes, RsGixs.getCPtr(gixs), gixs), true);
  }

  public static long wireAuthenPolicy() {
    return RetroshareJNI.p3Wire_wireAuthenPolicy();
  }

  public void service_tick() {
    RetroshareJNI.p3Wire_service_tick(swigCPtr, this);
  }

  public boolean getGroupData(long token, SWIGTYPE_p_std__vectorT_RsWireGroup_t groups) {
    return RetroshareJNI.p3Wire_getGroupData(swigCPtr, this, token, SWIGTYPE_p_std__vectorT_RsWireGroup_t.getCPtr(groups));
  }

  public boolean getPulseData(long token, SWIGTYPE_p_std__vectorT_RsWirePulse_t pulses) {
    return RetroshareJNI.p3Wire_getPulseData(swigCPtr, this, token, SWIGTYPE_p_std__vectorT_RsWirePulse_t.getCPtr(pulses));
  }

  public boolean createGroup(SWIGTYPE_p_unsigned_int token, RsWireGroup group) {
    return RetroshareJNI.p3Wire_createGroup(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), RsWireGroup.getCPtr(group), group);
  }

  public boolean createPulse(SWIGTYPE_p_unsigned_int token, RsWirePulse pulse) {
    return RetroshareJNI.p3Wire_createPulse(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token), RsWirePulse.getCPtr(pulse), pulse);
  }

}