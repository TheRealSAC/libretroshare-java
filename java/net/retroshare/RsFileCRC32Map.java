/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsFileCRC32Map extends RsItem {
  private long swigCPtr;

  protected RsFileCRC32Map(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsFileCRC32Map_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsFileCRC32Map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsFileCRC32Map(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsFileCRC32Map() {
    this(RetroshareJNI.new_RsFileCRC32Map(), true);
  }

  public void clear() {
    RetroshareJNI.RsFileCRC32Map_clear(swigCPtr, this);
  }

  public void setHash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsFileCRC32Map_hash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsFileCRC32Map_hash_get(swigCPtr, this), true);
  }

  public void setCrc_map(SWIGTYPE_p_t_CRCMapT_unsigned_int_t value) {
    RetroshareJNI.RsFileCRC32Map_crc_map_set(swigCPtr, this, SWIGTYPE_p_t_CRCMapT_unsigned_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_t_CRCMapT_unsigned_int_t getCrc_map() {
    long cPtr = RetroshareJNI.RsFileCRC32Map_crc_map_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_t_CRCMapT_unsigned_int_t(cPtr, false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsFileCRC32Map_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsFileCRC32Map_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

}
