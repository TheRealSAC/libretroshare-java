/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class SSGxsIdScore extends SSBit {
  private long swigCPtr;

  protected SSGxsIdScore(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.SSGxsIdScore_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SSGxsIdScore obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_SSGxsIdScore(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SSGxsIdScore() {
    this(RetroshareJNI.new_SSGxsIdScore(), true);
  }

  public boolean load(SWIGTYPE_p_std__string input) {
    return RetroshareJNI.SSGxsIdScore_load(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(input));
  }

  public SWIGTYPE_p_std__string save() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.SSGxsIdScore_save(swigCPtr, this), true);
  }

  public void setScore(int value) {
    RetroshareJNI.SSGxsIdScore_score_set(swigCPtr, this, value);
  }

  public int getScore() {
    return RetroshareJNI.SSGxsIdScore_score_get(swigCPtr, this);
  }

}
