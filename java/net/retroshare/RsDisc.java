/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsDisc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDisc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDisc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsDisc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean getDiscFriends(SWIGTYPE_p_std__string id, SWIGTYPE_p_std__listT_std__string_t friends) {
    return RetroshareJNI.RsDisc_getDiscFriends(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_std__listT_std__string_t.getCPtr(friends));
  }

  public boolean getDiscGPGFriends(SWIGTYPE_p_std__string id, SWIGTYPE_p_std__listT_std__string_t gpg_friends) {
    return RetroshareJNI.RsDisc_getDiscGPGFriends(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(id), SWIGTYPE_p_std__listT_std__string_t.getCPtr(gpg_friends));
  }

  public boolean getDiscVersions(SWIGTYPE_p_std__mapT_std__string_std__string_t versions) {
    return RetroshareJNI.RsDisc_getDiscVersions(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_std__string_t.getCPtr(versions));
  }

  public boolean getWaitingDiscCount(SWIGTYPE_p_unsigned_int sendCount, SWIGTYPE_p_unsigned_int recvCount) {
    return RetroshareJNI.RsDisc_getWaitingDiscCount(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(sendCount), SWIGTYPE_p_unsigned_int.getCPtr(recvCount));
  }

}
