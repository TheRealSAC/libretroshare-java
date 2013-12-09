/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class FileIndexMonitor extends CacheSource {
  private long swigCPtr;

  protected FileIndexMonitor(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.FileIndexMonitor_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileIndexMonitor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_FileIndexMonitor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FileIndexMonitor(CacheStrapper cs, NotifyBase cb_in, SWIGTYPE_p_std__string cachedir, SWIGTYPE_p_std__string pid, SWIGTYPE_p_std__string config_dir) {
    this(RetroshareJNI.new_FileIndexMonitor(CacheStrapper.getCPtr(cs), cs, NotifyBase.getCPtr(cb_in), cb_in, SWIGTYPE_p_std__string.getCPtr(cachedir), SWIGTYPE_p_std__string.getCPtr(pid), SWIGTYPE_p_std__string.getCPtr(config_dir)), true);
  }

  public boolean findLocalFile(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags, SWIGTYPE_p_std__string peer_id, SWIGTYPE_p_std__string fullpath, SWIGTYPE_p_unsigned_long_long size, SWIGTYPE_p_t_RsFlags32T_0x184738_t storage_flags, SWIGTYPE_p_std__listT_std__string_t parent_groups) {
    return RetroshareJNI.FileIndexMonitor_findLocalFile(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags), SWIGTYPE_p_std__string.getCPtr(peer_id), SWIGTYPE_p_std__string.getCPtr(fullpath), SWIGTYPE_p_unsigned_long_long.getCPtr(size), SWIGTYPE_p_t_RsFlags32T_0x184738_t.getCPtr(storage_flags), SWIGTYPE_p_std__listT_std__string_t.getCPtr(parent_groups));
  }

  public int SearchKeywords(SWIGTYPE_p_std__listT_std__string_t keywords, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags, SWIGTYPE_p_std__string peer_id) {
    return RetroshareJNI.FileIndexMonitor_SearchKeywords(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(keywords), SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags), SWIGTYPE_p_std__string.getCPtr(peer_id));
  }

  public int SearchBoolExp(Expression exp, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags, SWIGTYPE_p_std__string peer_id) {
    return RetroshareJNI.FileIndexMonitor_SearchBoolExp(swigCPtr, this, Expression.getCPtr(exp), exp, SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags), SWIGTYPE_p_std__string.getCPtr(peer_id));
  }

  public int filterResults(SWIGTYPE_p_std__listT_FileEntry_p_t firesults, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags, SWIGTYPE_p_std__string peer_id) {
    return RetroshareJNI.FileIndexMonitor_filterResults(swigCPtr, this, SWIGTYPE_p_std__listT_FileEntry_p_t.getCPtr(firesults), SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags), SWIGTYPE_p_std__string.getCPtr(peer_id));
  }

  public boolean convertSharedFilePath(SWIGTYPE_p_std__string path, SWIGTYPE_p_std__string fullpath) {
    return RetroshareJNI.FileIndexMonitor_convertSharedFilePath(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path), SWIGTYPE_p_std__string.getCPtr(fullpath));
  }

  public boolean loadLocalCache(RsCacheData data) {
    return RetroshareJNI.FileIndexMonitor_loadLocalCache(swigCPtr, this, RsCacheData.getCPtr(data), data);
  }

  public boolean updateCache(RsCacheData data, SWIGTYPE_p_std__setT_std__string_t dest_peers) {
    return RetroshareJNI.FileIndexMonitor_updateCache(swigCPtr, this, RsCacheData.getCPtr(data), data, SWIGTYPE_p_std__setT_std__string_t.getCPtr(dest_peers));
  }

  public void run() {
    RetroshareJNI.FileIndexMonitor_run(swigCPtr, this);
  }

  public void updateCycle() {
    RetroshareJNI.FileIndexMonitor_updateCycle(swigCPtr, this);
  }

  public int RequestDirDetails(SWIGTYPE_p_void arg0, DirDetails arg1, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t arg2) {
    return RetroshareJNI.FileIndexMonitor_RequestDirDetails__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg0), DirDetails.getCPtr(arg1), arg1, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(arg2));
  }

  public long getType(SWIGTYPE_p_void arg0) {
    return RetroshareJNI.FileIndexMonitor_getType(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg0));
  }

  public int RequestDirDetails(SWIGTYPE_p_std__string path, DirDetails details) {
    return RetroshareJNI.FileIndexMonitor_RequestDirDetails__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path), DirDetails.getCPtr(details), details);
  }

  public void setSharedDirectories(SWIGTYPE_p_std__listT_SharedDirInfo_t dirs) {
    RetroshareJNI.FileIndexMonitor_setSharedDirectories(swigCPtr, this, SWIGTYPE_p_std__listT_SharedDirInfo_t.getCPtr(dirs));
  }

  public void getSharedDirectories(SWIGTYPE_p_std__listT_SharedDirInfo_t dirs) {
    RetroshareJNI.FileIndexMonitor_getSharedDirectories(swigCPtr, this, SWIGTYPE_p_std__listT_SharedDirInfo_t.getCPtr(dirs));
  }

  public void updateShareFlags(SharedDirInfo info) {
    RetroshareJNI.FileIndexMonitor_updateShareFlags(swigCPtr, this, SharedDirInfo.getCPtr(info), info);
  }

  public void forceDirectoryCheck() {
    RetroshareJNI.FileIndexMonitor_forceDirectoryCheck(swigCPtr, this);
  }

  public void forceDirListsRebuildAndSend() {
    RetroshareJNI.FileIndexMonitor_forceDirListsRebuildAndSend(swigCPtr, this);
  }

  public boolean inDirectoryCheck() {
    return RetroshareJNI.FileIndexMonitor_inDirectoryCheck(swigCPtr, this);
  }

  public boolean cachesAvailable(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_std__mapT_CacheId_RsCacheData_t ids) {
    return RetroshareJNI.FileIndexMonitor_cachesAvailable(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_std__mapT_CacheId_RsCacheData_t.getCPtr(ids));
  }

}
