/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqiQoSstreamer extends pqistreamer {
  private long swigCPtr;

  protected pqiQoSstreamer(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.pqiQoSstreamer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqiQoSstreamer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqiQoSstreamer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pqiQoSstreamer(RsSerialiser rss, SWIGTYPE_p_std__string peerid, BinInterface bio_in, int bio_flagsin) {
    this(RetroshareJNI.new_pqiQoSstreamer(RsSerialiser.getCPtr(rss), rss, SWIGTYPE_p_std__string.getCPtr(peerid), BinInterface.getCPtr(bio_in), bio_in, bio_flagsin), true);
  }

  public void locked_storeInOutputQueue(SWIGTYPE_p_void ptr, int priority) {
    RetroshareJNI.pqiQoSstreamer_locked_storeInOutputQueue(swigCPtr, this, SWIGTYPE_p_void.getCPtr(ptr), priority);
  }

  public int out_queue_size() {
    return RetroshareJNI.pqiQoSstreamer_out_queue_size(swigCPtr, this);
  }

  public void locked_clear_out_queue() {
    RetroshareJNI.pqiQoSstreamer_locked_clear_out_queue(swigCPtr, this);
  }

  public int locked_compute_out_pkt_size() {
    return RetroshareJNI.pqiQoSstreamer_locked_compute_out_pkt_size(swigCPtr, this);
  }

  public SWIGTYPE_p_void locked_pop_out_data() {
    long cPtr = RetroshareJNI.pqiQoSstreamer_locked_pop_out_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public int getQueueSize(boolean in) {
    return RetroshareJNI.pqiQoSstreamer_getQueueSize(swigCPtr, this, in);
  }

  public final static long PQI_QOS_STREAMER_MAX_LEVELS = RetroshareJNI.pqiQoSstreamer_PQI_QOS_STREAMER_MAX_LEVELS_get();
  public final static float PQI_QOS_STREAMER_ALPHA = RetroshareJNI.pqiQoSstreamer_PQI_QOS_STREAMER_ALPHA_get();
}