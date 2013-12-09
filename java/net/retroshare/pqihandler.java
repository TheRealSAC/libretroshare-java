/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqihandler extends P3Interface {
  private long swigCPtr;

  protected pqihandler(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.pqihandler_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqihandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqihandler(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pqihandler(SecurityPolicy Global) {
    this(RetroshareJNI.new_pqihandler(SecurityPolicy.getCPtr(Global), Global), true);
  }

  public boolean AddSearchModule(SearchModule mod) {
    return RetroshareJNI.pqihandler_AddSearchModule(swigCPtr, this, SearchModule.getCPtr(mod), mod);
  }

  public boolean RemoveSearchModule(SearchModule mod) {
    return RetroshareJNI.pqihandler_RemoveSearchModule(swigCPtr, this, SearchModule.getCPtr(mod), mod);
  }

  public int SearchSpecific(RsCacheRequest ns) {
    return RetroshareJNI.pqihandler_SearchSpecific(swigCPtr, this, RsCacheRequest.getCPtr(ns), ns);
  }

  public int SendSearchResult(RsCacheItem arg0) {
    return RetroshareJNI.pqihandler_SendSearchResult(swigCPtr, this, RsCacheItem.getCPtr(arg0), arg0);
  }

  public RsCacheRequest RequestedSearch() {
    long cPtr = RetroshareJNI.pqihandler_RequestedSearch(swigCPtr, this);
    return (cPtr == 0) ? null : new RsCacheRequest(cPtr, false);
  }

  public RsCacheItem GetSearchResult() {
    long cPtr = RetroshareJNI.pqihandler_GetSearchResult(swigCPtr, this);
    return (cPtr == 0) ? null : new RsCacheItem(cPtr, false);
  }

  public int SendFileRequest(RsFileRequest ns) {
    return RetroshareJNI.pqihandler_SendFileRequest(swigCPtr, this, RsFileRequest.getCPtr(ns), ns);
  }

  public int SendFileData(RsFileData ns) {
    return RetroshareJNI.pqihandler_SendFileData(swigCPtr, this, RsFileData.getCPtr(ns), ns);
  }

  public int SendFileChunkMapRequest(RsFileChunkMapRequest ns) {
    return RetroshareJNI.pqihandler_SendFileChunkMapRequest(swigCPtr, this, RsFileChunkMapRequest.getCPtr(ns), ns);
  }

  public int SendFileChunkMap(RsFileChunkMap ns) {
    return RetroshareJNI.pqihandler_SendFileChunkMap(swigCPtr, this, RsFileChunkMap.getCPtr(ns), ns);
  }

  public int SendFileCRC32MapRequest(RsFileCRC32MapRequest ns) {
    return RetroshareJNI.pqihandler_SendFileCRC32MapRequest(swigCPtr, this, RsFileCRC32MapRequest.getCPtr(ns), ns);
  }

  public int SendFileCRC32Map(RsFileCRC32Map ns) {
    return RetroshareJNI.pqihandler_SendFileCRC32Map(swigCPtr, this, RsFileCRC32Map.getCPtr(ns), ns);
  }

  public int SendFileSingleChunkCrcRequest(RsFileSingleChunkCrcRequest ns) {
    return RetroshareJNI.pqihandler_SendFileSingleChunkCrcRequest(swigCPtr, this, RsFileSingleChunkCrcRequest.getCPtr(ns), ns);
  }

  public int SendFileSingleChunkCrc(RsFileSingleChunkCrc ns) {
    return RetroshareJNI.pqihandler_SendFileSingleChunkCrc(swigCPtr, this, RsFileSingleChunkCrc.getCPtr(ns), ns);
  }

  public RsFileRequest GetFileRequest() {
    long cPtr = RetroshareJNI.pqihandler_GetFileRequest(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileRequest(cPtr, false);
  }

  public RsFileData GetFileData() {
    long cPtr = RetroshareJNI.pqihandler_GetFileData(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileData(cPtr, false);
  }

  public RsFileChunkMapRequest GetFileChunkMapRequest() {
    long cPtr = RetroshareJNI.pqihandler_GetFileChunkMapRequest(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileChunkMapRequest(cPtr, false);
  }

  public RsFileChunkMap GetFileChunkMap() {
    long cPtr = RetroshareJNI.pqihandler_GetFileChunkMap(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileChunkMap(cPtr, false);
  }

  public RsFileCRC32MapRequest GetFileCRC32MapRequest() {
    long cPtr = RetroshareJNI.pqihandler_GetFileCRC32MapRequest(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileCRC32MapRequest(cPtr, false);
  }

  public RsFileCRC32Map GetFileCRC32Map() {
    long cPtr = RetroshareJNI.pqihandler_GetFileCRC32Map(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileCRC32Map(cPtr, false);
  }

  public RsFileSingleChunkCrcRequest GetFileSingleChunkCrcRequest() {
    long cPtr = RetroshareJNI.pqihandler_GetFileSingleChunkCrcRequest(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileSingleChunkCrcRequest(cPtr, false);
  }

  public RsFileSingleChunkCrc GetFileSingleChunkCrc() {
    long cPtr = RetroshareJNI.pqihandler_GetFileSingleChunkCrc(swigCPtr, this);
    return (cPtr == 0) ? null : new RsFileSingleChunkCrc(cPtr, false);
  }

  public int tick() {
    return RetroshareJNI.pqihandler_tick(swigCPtr, this);
  }

  public int status() {
    return RetroshareJNI.pqihandler_status(swigCPtr, this);
  }

  public int SendRsRawItem(RsRawItem arg0) {
    return RetroshareJNI.pqihandler_SendRsRawItem(swigCPtr, this, RsRawItem.getCPtr(arg0), arg0);
  }

  public RsRawItem GetRsRawItem() {
    long cPtr = RetroshareJNI.pqihandler_GetRsRawItem(swigCPtr, this);
    return (cPtr == 0) ? null : new RsRawItem(cPtr, false);
  }

  public void setMaxRate(boolean in, float val) {
    RetroshareJNI.pqihandler_setMaxRate(swigCPtr, this, in, val);
  }

  public float getMaxRate(boolean in) {
    return RetroshareJNI.pqihandler_getMaxRate(swigCPtr, this, in);
  }

  public void getCurrentRates(SWIGTYPE_p_float in, SWIGTYPE_p_float out) {
    RetroshareJNI.pqihandler_getCurrentRates(swigCPtr, this, SWIGTYPE_p_float.getCPtr(in), SWIGTYPE_p_float.getCPtr(out));
  }

  public int ExtractRates(SWIGTYPE_p_std__mapT_std__string_RsBwRates_t ratemap, RsBwRates totals) {
    return RetroshareJNI.pqihandler_ExtractRates(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_RsBwRates_t.getCPtr(ratemap), RsBwRates.getCPtr(totals), totals);
  }

}
