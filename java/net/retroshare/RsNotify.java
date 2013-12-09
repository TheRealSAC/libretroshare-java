/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNotify {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsNotify(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNotify obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNotify(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean NotifySysMessage(SWIGTYPE_p_unsigned_int sysid, SWIGTYPE_p_unsigned_int type, SWIGTYPE_p_std__string title, SWIGTYPE_p_std__string msg) {
    return RetroshareJNI.RsNotify_NotifySysMessage(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(sysid), SWIGTYPE_p_unsigned_int.getCPtr(type), SWIGTYPE_p_std__string.getCPtr(title), SWIGTYPE_p_std__string.getCPtr(msg));
  }

  public boolean NotifyPopupMessage(SWIGTYPE_p_unsigned_int ptype, SWIGTYPE_p_std__string name, SWIGTYPE_p_std__string title, SWIGTYPE_p_std__string msg) {
    return RetroshareJNI.RsNotify_NotifyPopupMessage(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(ptype), SWIGTYPE_p_std__string.getCPtr(name), SWIGTYPE_p_std__string.getCPtr(title), SWIGTYPE_p_std__string.getCPtr(msg));
  }

  public boolean NotifyLogMessage(SWIGTYPE_p_unsigned_int sysid, SWIGTYPE_p_unsigned_int type, SWIGTYPE_p_std__string title, SWIGTYPE_p_std__string msg) {
    return RetroshareJNI.RsNotify_NotifyLogMessage(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(sysid), SWIGTYPE_p_unsigned_int.getCPtr(type), SWIGTYPE_p_std__string.getCPtr(title), SWIGTYPE_p_std__string.getCPtr(msg));
  }

  public boolean GetSysMessageList(SWIGTYPE_p_std__mapT_unsigned_int_std__string_t list) {
    return RetroshareJNI.RsNotify_GetSysMessageList(swigCPtr, this, SWIGTYPE_p_std__mapT_unsigned_int_std__string_t.getCPtr(list));
  }

  public boolean GetPopupMessageList(SWIGTYPE_p_std__mapT_unsigned_int_std__string_t list) {
    return RetroshareJNI.RsNotify_GetPopupMessageList(swigCPtr, this, SWIGTYPE_p_std__mapT_unsigned_int_std__string_t.getCPtr(list));
  }

  public boolean SetSysMessageMode(long sysid, long mode) {
    return RetroshareJNI.RsNotify_SetSysMessageMode(swigCPtr, this, sysid, mode);
  }

  public boolean SetPopupMessageMode(long ptype, long mode) {
    return RetroshareJNI.RsNotify_SetPopupMessageMode(swigCPtr, this, ptype, mode);
  }

  public boolean GetFeedItem(RsFeedItem item) {
    return RetroshareJNI.RsNotify_GetFeedItem(swigCPtr, this, RsFeedItem.getCPtr(item), item);
  }

}
