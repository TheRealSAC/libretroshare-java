/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class ftServer extends RsFiles {
  private long swigCPtr;

  protected ftServer(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.ftServer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ftServer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_ftServer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ftServer(p3PeerMgr peerMgr, p3LinkMgr linkMgr) {
    this(RetroshareJNI.new_ftServer(p3PeerMgr.getCPtr(peerMgr), peerMgr, p3LinkMgr.getCPtr(linkMgr), linkMgr), true);
  }

  public void setConfigDirectory(SWIGTYPE_p_std__string path) {
    RetroshareJNI.ftServer_setConfigDirectory(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path));
  }

  public void setP3Interface(P3Interface pqi) {
    RetroshareJNI.ftServer_setP3Interface(swigCPtr, this, P3Interface.getCPtr(pqi), pqi);
  }

  public void addConfigComponents(p3ConfigMgr mgr) {
    RetroshareJNI.ftServer_addConfigComponents(swigCPtr, this, p3ConfigMgr.getCPtr(mgr), mgr);
  }

  public CacheStrapper getCacheStrapper() {
    long cPtr = RetroshareJNI.ftServer_getCacheStrapper(swigCPtr, this);
    return (cPtr == 0) ? null : new CacheStrapper(cPtr, false);
  }

  public CacheTransfer getCacheTransfer() {
    long cPtr = RetroshareJNI.ftServer_getCacheTransfer(swigCPtr, this);
    return (cPtr == 0) ? null : new CacheTransfer(cPtr, false);
  }

  public SWIGTYPE_p_std__string OwnId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.ftServer_OwnId(swigCPtr, this), true);
  }

  public void SetupFtServer(NotifyBase cb) {
    RetroshareJNI.ftServer_SetupFtServer(swigCPtr, this, NotifyBase.getCPtr(cb), cb);
  }

  public void connectToTurtleRouter(p3turtle p) {
    RetroshareJNI.ftServer_connectToTurtleRouter(swigCPtr, this, p3turtle.getCPtr(p), p);
  }

  public void StartupThreads() {
    RetroshareJNI.ftServer_StartupThreads(swigCPtr, this);
  }

  public void StopThreads() {
    RetroshareJNI.ftServer_StopThreads(swigCPtr, this);
  }

  public void run() {
    RetroshareJNI.ftServer_run(swigCPtr, this);
  }

  public static boolean checkHash(SWIGTYPE_p_std__string hash, SWIGTYPE_p_std__string error_string) {
    return RetroshareJNI.ftServer_checkHash(SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_std__string.getCPtr(error_string));
  }

  public boolean handleTunnelRequest(SWIGTYPE_p_std__string hash, SWIGTYPE_p_std__string peer_id) {
    return RetroshareJNI.ftServer_handleTunnelRequest(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_std__string.getCPtr(peer_id));
  }

  public void receiveTurtleData(RsTurtleGenericTunnelItem item, SWIGTYPE_p_std__string hash, SWIGTYPE_p_std__string virtual_peer_id, long direction) {
    RetroshareJNI.ftServer_receiveTurtleData(swigCPtr, this, RsTurtleGenericTunnelItem.getCPtr(item), item, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_std__string.getCPtr(virtual_peer_id), direction);
  }

  public RsTurtleGenericTunnelItem deserialiseItem(SWIGTYPE_p_void data, long size) {
    long cPtr = RetroshareJNI.ftServer_deserialiseItem(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), size);
    return (cPtr == 0) ? null : new RsTurtleGenericTunnelItem(cPtr, false);
  }

  public void addVirtualPeer(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_std__string arg1, long dir) {
    RetroshareJNI.ftServer_addVirtualPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1), dir);
  }

  public void removeVirtualPeer(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_std__string arg1) {
    RetroshareJNI.ftServer_removeVirtualPeer(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1));
  }

  public ftDataMultiplex getMultiplexer() {
    long cPtr = RetroshareJNI.ftServer_getMultiplexer(swigCPtr, this);
    return (cPtr == 0) ? null : new ftDataMultiplex(cPtr, false);
  }

  public ftController getController() {
    long cPtr = RetroshareJNI.ftServer_getController(swigCPtr, this);
    return (cPtr == 0) ? null : new ftController(cPtr, false);
  }

  public boolean alreadyHaveFile(SWIGTYPE_p_std__string hash, FileInfo info) {
    return RetroshareJNI.ftServer_alreadyHaveFile(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), FileInfo.getCPtr(info), info);
  }

  public boolean FileRequest(SWIGTYPE_p_std__string fname, SWIGTYPE_p_std__string hash, java.math.BigInteger size, SWIGTYPE_p_std__string dest, SWIGTYPE_p_t_RsFlags32T_0x4228af_t flags, SWIGTYPE_p_std__listT_std__string_t srcIds) {
    return RetroshareJNI.ftServer_FileRequest(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(fname), SWIGTYPE_p_std__string.getCPtr(hash), size, SWIGTYPE_p_std__string.getCPtr(dest), SWIGTYPE_p_t_RsFlags32T_0x4228af_t.getCPtr(flags), SWIGTYPE_p_std__listT_std__string_t.getCPtr(srcIds));
  }

  public boolean FileCancel(SWIGTYPE_p_std__string hash) {
    return RetroshareJNI.ftServer_FileCancel(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash));
  }

  public boolean FileControl(SWIGTYPE_p_std__string hash, long flags) {
    return RetroshareJNI.ftServer_FileControl(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), flags);
  }

  public boolean FileClearCompleted() {
    return RetroshareJNI.ftServer_FileClearCompleted(swigCPtr, this);
  }

  public boolean setDestinationDirectory(SWIGTYPE_p_std__string hash, SWIGTYPE_p_std__string new_path) {
    return RetroshareJNI.ftServer_setDestinationDirectory(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_std__string.getCPtr(new_path));
  }

  public boolean setDestinationName(SWIGTYPE_p_std__string hash, SWIGTYPE_p_std__string new_name) {
    return RetroshareJNI.ftServer_setDestinationName(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_std__string.getCPtr(new_name));
  }

  public boolean setChunkStrategy(SWIGTYPE_p_std__string hash, FileChunksInfo.ChunkStrategy s) {
    return RetroshareJNI.ftServer_setChunkStrategy(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), s.swigValue());
  }

  public void setDefaultChunkStrategy(FileChunksInfo.ChunkStrategy arg0) {
    RetroshareJNI.ftServer_setDefaultChunkStrategy(swigCPtr, this, arg0.swigValue());
  }

  public FileChunksInfo.ChunkStrategy defaultChunkStrategy() {
    return FileChunksInfo.ChunkStrategy.swigToEnum(RetroshareJNI.ftServer_defaultChunkStrategy(swigCPtr, this));
  }

  public long freeDiskSpaceLimit() {
    return RetroshareJNI.ftServer_freeDiskSpaceLimit(swigCPtr, this);
  }

  public void setFreeDiskSpaceLimit(long size_in_mb) {
    RetroshareJNI.ftServer_setFreeDiskSpaceLimit(swigCPtr, this, size_in_mb);
  }

  public long getMinPrioritizedTransfers() {
    return RetroshareJNI.ftServer_getMinPrioritizedTransfers(swigCPtr, this);
  }

  public void setMinPrioritizedTransfers(long s) {
    RetroshareJNI.ftServer_setMinPrioritizedTransfers(swigCPtr, this, s);
  }

  public long getQueueSize() {
    return RetroshareJNI.ftServer_getQueueSize(swigCPtr, this);
  }

  public void setQueueSize(long s) {
    RetroshareJNI.ftServer_setQueueSize(swigCPtr, this, s);
  }

  public boolean changeQueuePosition(SWIGTYPE_p_std__string hash, QueueMove queue_mv) {
    return RetroshareJNI.ftServer_changeQueuePosition(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), queue_mv.swigValue());
  }

  public boolean changeDownloadSpeed(SWIGTYPE_p_std__string hash, int speed) {
    return RetroshareJNI.ftServer_changeDownloadSpeed(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), speed);
  }

  public boolean getDownloadSpeed(SWIGTYPE_p_std__string hash, SWIGTYPE_p_int speed) {
    return RetroshareJNI.ftServer_getDownloadSpeed(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_int.getCPtr(speed));
  }

  public boolean clearDownload(SWIGTYPE_p_std__string hash) {
    return RetroshareJNI.ftServer_clearDownload(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash));
  }

  public boolean FileDownloads(SWIGTYPE_p_std__listT_std__string_t hashs) {
    return RetroshareJNI.ftServer_FileDownloads(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(hashs));
  }

  public boolean FileUploads(SWIGTYPE_p_std__listT_std__string_t hashs) {
    return RetroshareJNI.ftServer_FileUploads(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(hashs));
  }

  public boolean FileDetails(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t hintflags, FileInfo info) {
    return RetroshareJNI.ftServer_FileDetails(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(hintflags), FileInfo.getCPtr(info), info);
  }

  public boolean FileDownloadChunksDetails(SWIGTYPE_p_std__string hash, FileChunksInfo info) {
    return RetroshareJNI.ftServer_FileDownloadChunksDetails(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), FileChunksInfo.getCPtr(info), info);
  }

  public boolean FileUploadChunksDetails(SWIGTYPE_p_std__string hash, SWIGTYPE_p_std__string peer_id, CompressedChunkMap map) {
    return RetroshareJNI.ftServer_FileUploadChunksDetails(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_std__string.getCPtr(peer_id), CompressedChunkMap.getCPtr(map), map);
  }

  public boolean ExtraFileAdd(SWIGTYPE_p_std__string fname, SWIGTYPE_p_std__string hash, java.math.BigInteger size, long period, SWIGTYPE_p_t_RsFlags32T_0x4228af_t flags) {
    return RetroshareJNI.ftServer_ExtraFileAdd(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(fname), SWIGTYPE_p_std__string.getCPtr(hash), size, period, SWIGTYPE_p_t_RsFlags32T_0x4228af_t.getCPtr(flags));
  }

  public boolean ExtraFileRemove(SWIGTYPE_p_std__string hash, SWIGTYPE_p_t_RsFlags32T_0x4228af_t flags) {
    return RetroshareJNI.ftServer_ExtraFileRemove(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(hash), SWIGTYPE_p_t_RsFlags32T_0x4228af_t.getCPtr(flags));
  }

  public boolean ExtraFileHash(SWIGTYPE_p_std__string localpath, long period, SWIGTYPE_p_t_RsFlags32T_0x4228af_t flags) {
    return RetroshareJNI.ftServer_ExtraFileHash(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(localpath), period, SWIGTYPE_p_t_RsFlags32T_0x4228af_t.getCPtr(flags));
  }

  public boolean ExtraFileStatus(SWIGTYPE_p_std__string localpath, FileInfo info) {
    return RetroshareJNI.ftServer_ExtraFileStatus(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(localpath), FileInfo.getCPtr(info), info);
  }

  public boolean ExtraFileMove(SWIGTYPE_p_std__string fname, SWIGTYPE_p_std__string hash, java.math.BigInteger size, SWIGTYPE_p_std__string destpath) {
    return RetroshareJNI.ftServer_ExtraFileMove(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(fname), SWIGTYPE_p_std__string.getCPtr(hash), size, SWIGTYPE_p_std__string.getCPtr(destpath));
  }

  public int RequestDirDetails(SWIGTYPE_p_std__string uid, SWIGTYPE_p_std__string path, DirDetails details) {
    return RetroshareJNI.ftServer_RequestDirDetails__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(uid), SWIGTYPE_p_std__string.getCPtr(path), DirDetails.getCPtr(details), details);
  }

  public int RequestDirDetails(SWIGTYPE_p_void ref, DirDetails details, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags) {
    return RetroshareJNI.ftServer_RequestDirDetails__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ref), DirDetails.getCPtr(details), details, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags));
  }

  public long getType(SWIGTYPE_p_void ref, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags) {
    return RetroshareJNI.ftServer_getType(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ref), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags));
  }

  public int SearchKeywords(SWIGTYPE_p_std__listT_std__string_t keywords, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags) {
    return RetroshareJNI.ftServer_SearchKeywords__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(keywords), SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags));
  }

  public int SearchKeywords(SWIGTYPE_p_std__listT_std__string_t keywords, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags, SWIGTYPE_p_std__string peer_id) {
    return RetroshareJNI.ftServer_SearchKeywords__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__listT_std__string_t.getCPtr(keywords), SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags), SWIGTYPE_p_std__string.getCPtr(peer_id));
  }

  public int SearchBoolExp(Expression exp, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags) {
    return RetroshareJNI.ftServer_SearchBoolExp__SWIG_0(swigCPtr, this, Expression.getCPtr(exp), exp, SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags));
  }

  public int SearchBoolExp(Expression exp, SWIGTYPE_p_std__listT_DirDetails_t results, SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t flags, SWIGTYPE_p_std__string peer_id) {
    return RetroshareJNI.ftServer_SearchBoolExp__SWIG_1(swigCPtr, this, Expression.getCPtr(exp), exp, SWIGTYPE_p_std__listT_DirDetails_t.getCPtr(results), SWIGTYPE_p_t_RsFlags32T_0xf29ba5_t.getCPtr(flags), SWIGTYPE_p_std__string.getCPtr(peer_id));
  }

  public boolean ConvertSharedFilePath(SWIGTYPE_p_std__string path, SWIGTYPE_p_std__string fullpath) {
    return RetroshareJNI.ftServer_ConvertSharedFilePath(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path), SWIGTYPE_p_std__string.getCPtr(fullpath));
  }

  public void ForceDirectoryCheck() {
    RetroshareJNI.ftServer_ForceDirectoryCheck(swigCPtr, this);
  }

  public void updateSinceGroupPermissionsChanged() {
    RetroshareJNI.ftServer_updateSinceGroupPermissionsChanged(swigCPtr, this);
  }

  public boolean InDirectoryCheck() {
    return RetroshareJNI.ftServer_InDirectoryCheck(swigCPtr, this);
  }

  public boolean copyFile(SWIGTYPE_p_std__string source, SWIGTYPE_p_std__string dest) {
    return RetroshareJNI.ftServer_copyFile(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(source), SWIGTYPE_p_std__string.getCPtr(dest));
  }

  public void setDownloadDirectory(SWIGTYPE_p_std__string path) {
    RetroshareJNI.ftServer_setDownloadDirectory(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path));
  }

  public void setPartialsDirectory(SWIGTYPE_p_std__string path) {
    RetroshareJNI.ftServer_setPartialsDirectory(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(path));
  }

  public SWIGTYPE_p_std__string getDownloadDirectory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.ftServer_getDownloadDirectory(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__string getPartialsDirectory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.ftServer_getPartialsDirectory(swigCPtr, this), true);
  }

  public boolean getSharedDirectories(SWIGTYPE_p_std__listT_SharedDirInfo_t dirs) {
    return RetroshareJNI.ftServer_getSharedDirectories(swigCPtr, this, SWIGTYPE_p_std__listT_SharedDirInfo_t.getCPtr(dirs));
  }

  public boolean setSharedDirectories(SWIGTYPE_p_std__listT_SharedDirInfo_t dirs) {
    return RetroshareJNI.ftServer_setSharedDirectories(swigCPtr, this, SWIGTYPE_p_std__listT_SharedDirInfo_t.getCPtr(dirs));
  }

  public boolean addSharedDirectory(SharedDirInfo dir) {
    return RetroshareJNI.ftServer_addSharedDirectory(swigCPtr, this, SharedDirInfo.getCPtr(dir), dir);
  }

  public boolean updateShareFlags(SharedDirInfo dir) {
    return RetroshareJNI.ftServer_updateShareFlags(swigCPtr, this, SharedDirInfo.getCPtr(dir), dir);
  }

  public boolean removeSharedDirectory(SWIGTYPE_p_std__string dir) {
    return RetroshareJNI.ftServer_removeSharedDirectory(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(dir));
  }

  public boolean getShareDownloadDirectory() {
    return RetroshareJNI.ftServer_getShareDownloadDirectory(swigCPtr, this);
  }

  public boolean shareDownloadDirectory(boolean share) {
    return RetroshareJNI.ftServer_shareDownloadDirectory(swigCPtr, this, share);
  }

  public void setRememberHashFilesDuration(long days) {
    RetroshareJNI.ftServer_setRememberHashFilesDuration(swigCPtr, this, days);
  }

  public long rememberHashFilesDuration() {
    return RetroshareJNI.ftServer_rememberHashFilesDuration(swigCPtr, this);
  }

  public boolean rememberHashFiles() {
    return RetroshareJNI.ftServer_rememberHashFiles(swigCPtr, this);
  }

  public void setRememberHashFiles(boolean arg0) {
    RetroshareJNI.ftServer_setRememberHashFiles(swigCPtr, this, arg0);
  }

  public void clearHashCache() {
    RetroshareJNI.ftServer_clearHashCache(swigCPtr, this);
  }

  public void setWatchPeriod(int minutes) {
    RetroshareJNI.ftServer_setWatchPeriod(swigCPtr, this, minutes);
  }

  public int watchPeriod() {
    return RetroshareJNI.ftServer_watchPeriod(swigCPtr, this);
  }

  public boolean sendData(SWIGTYPE_p_std__string peerId, SWIGTYPE_p_std__string hash, java.math.BigInteger size, java.math.BigInteger offset, long chunksize, SWIGTYPE_p_void data) {
    return RetroshareJNI.ftServer_sendData(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peerId), SWIGTYPE_p_std__string.getCPtr(hash), size, offset, chunksize, SWIGTYPE_p_void.getCPtr(data));
  }

  public boolean sendDataRequest(SWIGTYPE_p_std__string peerId, SWIGTYPE_p_std__string hash, java.math.BigInteger size, java.math.BigInteger offset, long chunksize) {
    return RetroshareJNI.ftServer_sendDataRequest(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peerId), SWIGTYPE_p_std__string.getCPtr(hash), size, offset, chunksize);
  }

  public boolean sendChunkMapRequest(SWIGTYPE_p_std__string peer_id, SWIGTYPE_p_std__string hash, boolean is_client) {
    return RetroshareJNI.ftServer_sendChunkMapRequest(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peer_id), SWIGTYPE_p_std__string.getCPtr(hash), is_client);
  }

  public boolean sendChunkMap(SWIGTYPE_p_std__string peer_id, SWIGTYPE_p_std__string hash, CompressedChunkMap cmap, boolean is_client) {
    return RetroshareJNI.ftServer_sendChunkMap(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peer_id), SWIGTYPE_p_std__string.getCPtr(hash), CompressedChunkMap.getCPtr(cmap), cmap, is_client);
  }

  public boolean sendCRC32MapRequest(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_std__string arg1) {
    return RetroshareJNI.ftServer_sendCRC32MapRequest(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1));
  }

  public boolean sendCRC32Map(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_std__string arg1, SWIGTYPE_p_t_CRCMapT_unsigned_int_t arg2) {
    return RetroshareJNI.ftServer_sendCRC32Map(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_std__string.getCPtr(arg1), SWIGTYPE_p_t_CRCMapT_unsigned_int_t.getCPtr(arg2));
  }

  public boolean sendSingleChunkCRCRequest(SWIGTYPE_p_std__string peer_id, SWIGTYPE_p_std__string hash, long chunk_number) {
    return RetroshareJNI.ftServer_sendSingleChunkCRCRequest(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peer_id), SWIGTYPE_p_std__string.getCPtr(hash), chunk_number);
  }

  public boolean sendSingleChunkCRC(SWIGTYPE_p_std__string peer_id, SWIGTYPE_p_std__string hash, long chunk_number, Sha1CheckSum crc) {
    return RetroshareJNI.ftServer_sendSingleChunkCRC(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peer_id), SWIGTYPE_p_std__string.getCPtr(hash), chunk_number, Sha1CheckSum.getCPtr(crc), crc);
  }

  public int tick() {
    return RetroshareJNI.ftServer_tick(swigCPtr, this);
  }

  public boolean addConfiguration(p3ConfigMgr cfgmgr) {
    return RetroshareJNI.ftServer_addConfiguration(swigCPtr, this, p3ConfigMgr.getCPtr(cfgmgr), cfgmgr);
  }

  public boolean ResumeTransfers() {
    return RetroshareJNI.ftServer_ResumeTransfers(swigCPtr, this);
  }

}