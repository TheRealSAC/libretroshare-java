/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class zcPeerDetails {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected zcPeerDetails(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(zcPeerDetails obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_zcPeerDetails(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setGpgId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.zcPeerDetails_gpgId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getGpgId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.zcPeerDetails_gpgId_get(swigCPtr, this), true);
  }

  public void setMLocations(SWIGTYPE_p_std__mapT_std__string_zcLocationDetails_t value) {
    RetroshareJNI.zcPeerDetails_mLocations_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_zcLocationDetails_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_zcLocationDetails_t getMLocations() {
    long cPtr = RetroshareJNI.zcPeerDetails_mLocations_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_std__string_zcLocationDetails_t(cPtr, false);
  }

  public zcPeerDetails() {
    this(RetroshareJNI.new_zcPeerDetails(), true);
  }

}