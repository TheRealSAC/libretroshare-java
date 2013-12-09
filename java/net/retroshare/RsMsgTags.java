/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsMsgTags extends RsMessageItem {
  private long swigCPtr;

  protected RsMsgTags(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsMsgTags_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsMsgTags obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsMsgTags(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsMsgTags() {
    this(RetroshareJNI.new_RsMsgTags(), true);
  }

  public boolean serialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size, boolean config) {
    return RetroshareJNI.RsMsgTags_serialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size), config);
  }

  public long serial_size(boolean config) {
    return RetroshareJNI.RsMsgTags_serial_size(swigCPtr, this, config);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsMsgTags_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsMsgTags_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void clear() {
    RetroshareJNI.RsMsgTags_clear(swigCPtr, this);
  }

  public void setMsgId(long value) {
    RetroshareJNI.RsMsgTags_msgId_set(swigCPtr, this, value);
  }

  public long getMsgId() {
    return RetroshareJNI.RsMsgTags_msgId_get(swigCPtr, this);
  }

  public void setTagIds(SWIGTYPE_p_std__listT_unsigned_int_t value) {
    RetroshareJNI.RsMsgTags_tagIds_set(swigCPtr, this, SWIGTYPE_p_std__listT_unsigned_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__listT_unsigned_int_t getTagIds() {
    return new SWIGTYPE_p_std__listT_unsigned_int_t(RetroshareJNI.RsMsgTags_tagIds_get(swigCPtr, this), true);
  }

}
