/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class TurtleRequestDisplayInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TurtleRequestDisplayInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TurtleRequestDisplayInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_TurtleRequestDisplayInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRequest_id(long value) {
    RetroshareJNI.TurtleRequestDisplayInfo_request_id_set(swigCPtr, this, value);
  }

  public long getRequest_id() {
    return RetroshareJNI.TurtleRequestDisplayInfo_request_id_get(swigCPtr, this);
  }

  public void setSource_peer_id(SWIGTYPE_p_std__string value) {
    RetroshareJNI.TurtleRequestDisplayInfo_source_peer_id_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getSource_peer_id() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.TurtleRequestDisplayInfo_source_peer_id_get(swigCPtr, this), true);
  }

  public void setAge(long value) {
    RetroshareJNI.TurtleRequestDisplayInfo_age_set(swigCPtr, this, value);
  }

  public long getAge() {
    return RetroshareJNI.TurtleRequestDisplayInfo_age_get(swigCPtr, this);
  }

  public void setDepth(long value) {
    RetroshareJNI.TurtleRequestDisplayInfo_depth_set(swigCPtr, this, value);
  }

  public long getDepth() {
    return RetroshareJNI.TurtleRequestDisplayInfo_depth_get(swigCPtr, this);
  }

  public TurtleRequestDisplayInfo() {
    this(RetroshareJNI.new_TurtleRequestDisplayInfo(), true);
  }

}
