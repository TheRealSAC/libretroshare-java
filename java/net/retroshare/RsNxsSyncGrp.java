/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsNxsSyncGrp extends RsNxsItem {
  private long swigCPtr;

  protected RsNxsSyncGrp(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsNxsSyncGrp_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsNxsSyncGrp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsNxsSyncGrp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static short getFLAG_USE_SYNC_HASH() {
    return RetroshareJNI.RsNxsSyncGrp_FLAG_USE_SYNC_HASH_get();
  }

  public static short getFLAG_ONLY_CURRENT() {
    return RetroshareJNI.RsNxsSyncGrp_FLAG_ONLY_CURRENT_get();
  }

  public void clear() {
    RetroshareJNI.RsNxsSyncGrp_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsNxsSyncGrp_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public void setFlag(short value) {
    RetroshareJNI.RsNxsSyncGrp_flag_set(swigCPtr, this, value);
  }

  public short getFlag() {
    return RetroshareJNI.RsNxsSyncGrp_flag_get(swigCPtr, this);
  }

  public void setSyncAge(long value) {
    RetroshareJNI.RsNxsSyncGrp_syncAge_set(swigCPtr, this, value);
  }

  public long getSyncAge() {
    return RetroshareJNI.RsNxsSyncGrp_syncAge_get(swigCPtr, this);
  }

  public void setSyncHash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsNxsSyncGrp_syncHash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getSyncHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsNxsSyncGrp_syncHash_get(swigCPtr, this), true);
  }

}