/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ftSearch {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ftSearch(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ftSearch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ftSearch(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean search(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t arg1, SWIGTYPE_p_std__string arg2, FileInfo arg3) {
    return RetroshareJNI.ftSearch_search__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(arg1), SWIGTYPE_p_std__string.getCPtr(arg2), FileInfo.getCPtr(arg3), arg3);
  }

  public boolean search(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t hintflags, FileInfo info) {
    return RetroshareJNI.ftSearch_search__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(hintflags), FileInfo.getCPtr(info), info);
  }

}