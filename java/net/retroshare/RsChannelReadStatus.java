/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsChannelReadStatus extends RsDistribChildConfig {
  private long swigCPtr;

  protected RsChannelReadStatus(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsChannelReadStatus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsChannelReadStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsChannelReadStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsChannelReadStatus() {
    this(RetroshareJNI.new_RsChannelReadStatus(), true);
  }

  public void clear() {
    RetroshareJNI.RsChannelReadStatus_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsChannelReadStatus_print(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public void setChannelId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsChannelReadStatus_channelId_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getChannelId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsChannelReadStatus_channelId_get(swigCPtr, this), true);
  }

  public void setMsgReadStatus(SWIGTYPE_p_std__mapT_std__string_unsigned_int_t value) {
    RetroshareJNI.RsChannelReadStatus_msgReadStatus_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_unsigned_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_unsigned_int_t getMsgReadStatus() {
    return new SWIGTYPE_p_std__mapT_std__string_unsigned_int_t(RetroshareJNI.RsChannelReadStatus_msgReadStatus_get(swigCPtr, this), true);
  }

  public void setDestination_directory(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsChannelReadStatus_destination_directory_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getDestination_directory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsChannelReadStatus_destination_directory_get(swigCPtr, this), true);
  }

}
