/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsTlvIpAddrSet extends RsTlvItem {
  private long swigCPtr;

  protected RsTlvIpAddrSet(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsTlvIpAddrSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsTlvIpAddrSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsTlvIpAddrSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsTlvIpAddrSet() {
    this(RetroshareJNI.new_RsTlvIpAddrSet(), true);
  }

  public long TlvSize() {
    return RetroshareJNI.RsTlvIpAddrSet_TlvSize(swigCPtr, this);
  }

  public void TlvClear() {
    RetroshareJNI.RsTlvIpAddrSet_TlvClear(swigCPtr, this);
  }

  public boolean SetTlv(SWIGTYPE_p_void data, long size, SWIGTYPE_p_unsigned_int offset) {
    return RetroshareJNI.RsTlvIpAddrSet_SetTlv(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_unsigned_int.getCPtr(offset));
  }

  public boolean GetTlv(SWIGTYPE_p_void data, long size, SWIGTYPE_p_unsigned_int offset) {
    return RetroshareJNI.RsTlvIpAddrSet_GetTlv(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size, SWIGTYPE_p_unsigned_int.getCPtr(offset));
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsTlvIpAddrSet_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public void setAddrs(SWIGTYPE_p_std__listT_RsTlvIpAddressInfo_t value) {
    RetroshareJNI.RsTlvIpAddrSet_addrs_set(swigCPtr, this, SWIGTYPE_p_std__listT_RsTlvIpAddressInfo_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__listT_RsTlvIpAddressInfo_t getAddrs() {
    long cPtr = RetroshareJNI.RsTlvIpAddrSet_addrs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_RsTlvIpAddressInfo_t(cPtr, false);
  }

}