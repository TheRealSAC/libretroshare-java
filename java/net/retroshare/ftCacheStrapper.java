/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ftCacheStrapper extends CacheStrapper {
  private long swigCPtr;

  protected ftCacheStrapper(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.ftCacheStrapper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ftCacheStrapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ftCacheStrapper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ftCacheStrapper(p3LinkMgr cm) {
    this(RetroshareJNI.new_ftCacheStrapper(p3LinkMgr.getCPtr(cm), cm), true);
  }

  public boolean search(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t hintflags, FileInfo info) {
    return RetroshareJNI.ftCacheStrapper_search(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(hintflags), FileInfo.getCPtr(info), info);
  }

}
