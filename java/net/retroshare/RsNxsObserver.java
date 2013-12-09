/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNxsObserver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsNxsObserver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNxsObserver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNxsObserver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void notifyNewMessages(SWIGTYPE_p_std__vectorT_RsNxsMsg_p_t messages) {
    RetroshareJNI.RsNxsObserver_notifyNewMessages(swigCPtr, this, SWIGTYPE_p_std__vectorT_RsNxsMsg_p_t.getCPtr(messages));
  }

  public void notifyNewGroups(SWIGTYPE_p_std__vectorT_RsNxsGrp_p_t groups) {
    RetroshareJNI.RsNxsObserver_notifyNewGroups(swigCPtr, this, SWIGTYPE_p_std__vectorT_RsNxsGrp_p_t.getCPtr(groups));
  }

}