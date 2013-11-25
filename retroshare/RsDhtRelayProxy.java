/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class RsDhtRelayProxy {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDhtRelayProxy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDhtRelayProxy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        retroshareJNI.delete_RsDhtRelayProxy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsDhtRelayProxy() {
    this(retroshareJNI.new_RsDhtRelayProxy(), true);
  }

  public void setMSrcAddr(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtRelayProxy_mSrcAddr_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMSrcAddr() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtRelayProxy_mSrcAddr_get(swigCPtr, this), true);
  }

  public void setMDestAddr(SWIGTYPE_p_std__string value) {
    retroshareJNI.RsDhtRelayProxy_mDestAddr_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getMDestAddr() {
    return new SWIGTYPE_p_std__string(retroshareJNI.RsDhtRelayProxy_mDestAddr_get(swigCPtr, this), true);
  }

  public void setMBandwidth(double value) {
    retroshareJNI.RsDhtRelayProxy_mBandwidth_set(swigCPtr, this, value);
  }

  public double getMBandwidth() {
    return retroshareJNI.RsDhtRelayProxy_mBandwidth_get(swigCPtr, this);
  }

  public void setMRelayClass(int value) {
    retroshareJNI.RsDhtRelayProxy_mRelayClass_set(swigCPtr, this, value);
  }

  public int getMRelayClass() {
    return retroshareJNI.RsDhtRelayProxy_mRelayClass_get(swigCPtr, this);
  }

  public void setMLastTS(SWIGTYPE_p_time_t value) {
    retroshareJNI.RsDhtRelayProxy_mLastTS_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMLastTS() {
    return new SWIGTYPE_p_time_t(retroshareJNI.RsDhtRelayProxy_mLastTS_get(swigCPtr, this), true);
  }

  public void setMCreateTS(SWIGTYPE_p_time_t value) {
    retroshareJNI.RsDhtRelayProxy_mCreateTS_set(swigCPtr, this, SWIGTYPE_p_time_t.getCPtr(value));
  }

  public SWIGTYPE_p_time_t getMCreateTS() {
    return new SWIGTYPE_p_time_t(retroshareJNI.RsDhtRelayProxy_mCreateTS_get(swigCPtr, this), true);
  }

}
