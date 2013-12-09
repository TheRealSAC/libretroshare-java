/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqistreamer extends PQInterface {
  private long swigCPtr;

  protected pqistreamer(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.pqistreamer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqistreamer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqistreamer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pqistreamer(RsSerialiser rss, SWIGTYPE_p_std__string peerid, BinInterface bio_in, int bio_flagsin) {
    this(RetroshareJNI.new_pqistreamer(RsSerialiser.getCPtr(rss), rss, SWIGTYPE_p_std__string.getCPtr(peerid), BinInterface.getCPtr(bio_in), bio_in, bio_flagsin), true);
  }

  public int SendItem(RsItem item) {
    return RetroshareJNI.pqistreamer_SendItem__SWIG_0(swigCPtr, this, RsItem.getCPtr(item), item);
  }

  public int SendItem(RsItem arg0, SWIGTYPE_p_unsigned_int serialized_size) {
    return RetroshareJNI.pqistreamer_SendItem__SWIG_1(swigCPtr, this, RsItem.getCPtr(arg0), arg0, SWIGTYPE_p_unsigned_int.getCPtr(serialized_size));
  }

  public RsItem GetItem() {
    long cPtr = RetroshareJNI.pqistreamer_GetItem(swigCPtr, this);
    return (cPtr == 0) ? null : new RsItem(cPtr, false);
  }

  public int tick() {
    return RetroshareJNI.pqistreamer_tick(swigCPtr, this);
  }

  public int status() {
    return RetroshareJNI.pqistreamer_status(swigCPtr, this);
  }

  public SWIGTYPE_p_time_t getLastIncomingTS() {
    return new SWIGTYPE_p_time_t(RetroshareJNI.pqistreamer_getLastIncomingTS(swigCPtr, this), true);
  }

  public void getRates(RsBwRates rates) {
    RetroshareJNI.pqistreamer_getRates(swigCPtr, this, RsBwRates.getCPtr(rates), rates);
  }

  public int getQueueSize(boolean in) {
    return RetroshareJNI.pqistreamer_getQueueSize(swigCPtr, this, in);
  }

}
