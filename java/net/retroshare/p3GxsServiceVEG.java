/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3GxsServiceVEG extends p3Service {
  private long swigCPtr;

  protected p3GxsServiceVEG(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3GxsServiceVEG_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3GxsServiceVEG obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3GxsServiceVEG(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean generateToken(SWIGTYPE_p_unsigned_int token) {
    return RetroshareJNI.p3GxsServiceVEG_generateToken(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(token));
  }

  public boolean storeRequest(long token, long ansType, SWIGTYPE_p_RsTokReqOptionsVEG opts, long type, SWIGTYPE_p_std__listT_std__string_t ids) {
    return RetroshareJNI.p3GxsServiceVEG_storeRequest(swigCPtr, this, token, ansType, SWIGTYPE_p_RsTokReqOptionsVEG.getCPtr(opts), type, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public boolean clearRequest(long token) {
    return RetroshareJNI.p3GxsServiceVEG_clearRequest(swigCPtr, this, token);
  }

  public boolean updateRequestStatus(long token, long status) {
    return RetroshareJNI.p3GxsServiceVEG_updateRequestStatus(swigCPtr, this, token, status);
  }

  public boolean updateRequestInList(long token, SWIGTYPE_p_std__listT_std__string_t ids) {
    return RetroshareJNI.p3GxsServiceVEG_updateRequestInList(swigCPtr, this, token, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public boolean updateRequestOutList(long token, SWIGTYPE_p_std__listT_std__string_t ids) {
    return RetroshareJNI.p3GxsServiceVEG_updateRequestOutList(swigCPtr, this, token, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public boolean checkRequestStatus(long token, SWIGTYPE_p_unsigned_int status, SWIGTYPE_p_unsigned_int reqtype, SWIGTYPE_p_unsigned_int anstype, SWIGTYPE_p_time_t ts) {
    return RetroshareJNI.p3GxsServiceVEG_checkRequestStatus(swigCPtr, this, token, SWIGTYPE_p_unsigned_int.getCPtr(status), SWIGTYPE_p_unsigned_int.getCPtr(reqtype), SWIGTYPE_p_unsigned_int.getCPtr(anstype), SWIGTYPE_p_time_t.getCPtr(ts));
  }

  public boolean tokenList(SWIGTYPE_p_std__listT_unsigned_int_t tokens) {
    return RetroshareJNI.p3GxsServiceVEG_tokenList(swigCPtr, this, SWIGTYPE_p_std__listT_unsigned_int_t.getCPtr(tokens));
  }

  public boolean popRequestInList(long token, SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3GxsServiceVEG_popRequestInList(swigCPtr, this, token, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean popRequestOutList(long token, SWIGTYPE_p_std__string id) {
    return RetroshareJNI.p3GxsServiceVEG_popRequestOutList(swigCPtr, this, token, SWIGTYPE_p_std__string.getCPtr(id));
  }

  public boolean loadRequestOutList(long token, SWIGTYPE_p_std__listT_std__string_t ids) {
    return RetroshareJNI.p3GxsServiceVEG_loadRequestOutList(swigCPtr, this, token, SWIGTYPE_p_std__listT_std__string_t.getCPtr(ids));
  }

  public boolean fakeprocessrequests() {
    return RetroshareJNI.p3GxsServiceVEG_fakeprocessrequests(swigCPtr, this);
  }

}