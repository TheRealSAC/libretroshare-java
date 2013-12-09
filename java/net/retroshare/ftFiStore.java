/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ftFiStore extends FileIndexStore {
  private long swigCPtr;

  protected ftFiStore(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.ftFiStore_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ftFiStore obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ftFiStore(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ftFiStore(CacheStrapper cs, CacheTransfer cft, NotifyBase cb_in, p3PeerMgr pm, SWIGTYPE_p_std__string ownid, SWIGTYPE_p_std__string cachedir) {
    this(RetroshareJNI.new_ftFiStore(CacheStrapper.getCPtr(cs), cs, CacheTransfer.getCPtr(cft), cft, NotifyBase.getCPtr(cb_in), cb_in, p3PeerMgr.getCPtr(pm), pm, SWIGTYPE_p_std__string.getCPtr(ownid), SWIGTYPE_p_std__string.getCPtr(cachedir)), true);
  }

  public boolean search(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t hintflags, FileInfo info) {
    return RetroshareJNI.ftFiStore_search(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(hintflags), FileInfo.getCPtr(info), info);
  }

}