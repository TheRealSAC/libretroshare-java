/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ExtAddrFinder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ExtAddrFinder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtAddrFinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ExtAddrFinder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ExtAddrFinder() {
    this(RetroshareJNI.new_ExtAddrFinder(), true);
  }

  public boolean hasValidIP(SWIGTYPE_p_in_addr addr) {
    return RetroshareJNI.ExtAddrFinder_hasValidIP(swigCPtr, this, SWIGTYPE_p_in_addr.getCPtr(addr));
  }

  public void getIPServersList(SWIGTYPE_p_std__listT_std__string_t ip_servers) {
    RetroshareJNI.ExtAddrFinder_getIPServersList(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ip_servers));
  }

  public void start_request() {
    RetroshareJNI.ExtAddrFinder_start_request(swigCPtr, this);
  }

  public void reset() {
    RetroshareJNI.ExtAddrFinder_reset(swigCPtr, this);
  }

}