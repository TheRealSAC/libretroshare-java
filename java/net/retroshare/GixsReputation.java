/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class GixsReputation {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GixsReputation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GixsReputation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_GixsReputation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GixsReputation() {
    this(RetroshareJNI.new_GixsReputation(), true);
  }

  public void setId(SWIGTYPE_p_std__string value) {
    RetroshareJNI.GixsReputation_id_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.GixsReputation_id_get(swigCPtr, this), true);
  }

  public void setScore(int value) {
    RetroshareJNI.GixsReputation_score_set(swigCPtr, this, value);
  }

  public int getScore() {
    return RetroshareJNI.GixsReputation_score_get(swigCPtr, this);
  }

}