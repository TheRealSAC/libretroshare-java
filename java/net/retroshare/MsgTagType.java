/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class MsgTagType {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MsgTagType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MsgTagType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_MsgTagType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MsgTagType() {
    this(RetroshareJNI.new_MsgTagType(), true);
  }

  public void setTypes(SWIGTYPE_p_std__mapT_unsigned_int_std__pairT_std__string_unsigned_int_t_t value) {
    RetroshareJNI.MsgTagType_types_set(swigCPtr, this, SWIGTYPE_p_std__mapT_unsigned_int_std__pairT_std__string_unsigned_int_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_unsigned_int_std__pairT_std__string_unsigned_int_t_t getTypes() {
    return new SWIGTYPE_p_std__mapT_unsigned_int_std__pairT_std__string_unsigned_int_t_t(RetroshareJNI.MsgTagType_types_get(swigCPtr, this), true);
  }

}