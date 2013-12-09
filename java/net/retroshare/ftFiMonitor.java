/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ftFiMonitor extends FileIndexMonitor {
  private long swigCPtr;

  protected ftFiMonitor(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.ftFiMonitor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ftFiMonitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ftFiMonitor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ftFiMonitor(CacheStrapper cs, NotifyBase cb_in, SWIGTYPE_p_std__string cachedir, SWIGTYPE_p_std__string pid, SWIGTYPE_p_std__string config_dir) {
    this(RetroshareJNI.new_ftFiMonitor(CacheStrapper.getCPtr(cs), cs, NotifyBase.getCPtr(cb_in), cb_in, SWIGTYPE_p_std__string.getCPtr(cachedir), SWIGTYPE_p_std__string.getCPtr(pid), SWIGTYPE_p_std__string.getCPtr(config_dir)), true);
  }

  public boolean search(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t hintflags, FileInfo info) {
    return RetroshareJNI.ftFiMonitor_search__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(hintflags), FileInfo.getCPtr(info), info);
  }

  public boolean search(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t hintflags, SWIGTYPE_p_std__string peer_id, FileInfo info) {
    return RetroshareJNI.ftFiMonitor_search__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(hintflags), SWIGTYPE_p_std__string.getCPtr(peer_id), FileInfo.getCPtr(info), info);
  }

  public void setSharedDirectories(SWIGTYPE_p_std__listT_SharedDirInfo_t dirList) {
    RetroshareJNI.ftFiMonitor_setSharedDirectories(swigCPtr, this, SWIGTYPE_p_std__listT_SharedDirInfo_t.getCPtr(dirList));
  }

  public void updateShareFlags(SharedDirInfo info) {
    RetroshareJNI.ftFiMonitor_updateShareFlags(swigCPtr, this, SharedDirInfo.getCPtr(info), info);
  }

  public void setRememberHashCacheDuration(long days) {
    RetroshareJNI.ftFiMonitor_setRememberHashCacheDuration(swigCPtr, this, days);
  }

  public long rememberHashCacheDuration() {
    return RetroshareJNI.ftFiMonitor_rememberHashCacheDuration(swigCPtr, this);
  }

  public void setRememberHashCache(boolean arg0) {
    RetroshareJNI.ftFiMonitor_setRememberHashCache(swigCPtr, this, arg0);
  }

  public boolean rememberHashCache() {
    return RetroshareJNI.ftFiMonitor_rememberHashCache(swigCPtr, this);
  }

  public void clearHashCache() {
    RetroshareJNI.ftFiMonitor_clearHashCache(swigCPtr, this);
  }

  public void setWatchPeriod(int seconds) {
    RetroshareJNI.ftFiMonitor_setWatchPeriod(swigCPtr, this, seconds);
  }

  public int watchPeriod() {
    return RetroshareJNI.ftFiMonitor_watchPeriod(swigCPtr, this);
  }

}
