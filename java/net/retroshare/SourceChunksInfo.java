/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class SourceChunksInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SourceChunksInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SourceChunksInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_SourceChunksInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCmap(CompressedChunkMap value) {
    RetroshareJNI.SourceChunksInfo_cmap_set(swigCPtr, this, CompressedChunkMap.getCPtr(value), value);
  }

  public CompressedChunkMap getCmap() {
    long cPtr = RetroshareJNI.SourceChunksInfo_cmap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CompressedChunkMap(cPtr, false);
  }

  public void setTS(SWIGTYPE_p_time_t value) {
    RetroshareJNI.SourceChunksInfo_TS_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getTS() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.SourceChunksInfo_TS_get(swigCPtr, this), true);
  }

  public void setIs_full(boolean value) {
    RetroshareJNI.SourceChunksInfo_is_full_set(swigCPtr, this, value);
  }

  public boolean getIs_full() {
    return RetroshareJNI.SourceChunksInfo_is_full_get(swigCPtr, this);
  }

  public boolean hasData(java.math.BigInteger offset, long fixed_chunk_size) {
    return RetroshareJNI.SourceChunksInfo_hasData(swigCPtr, this, offset, fixed_chunk_size);
  }

  public SourceChunksInfo() {
    this(RetroshareJNI.new_SourceChunksInfo(), true);
  }

}