/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class TurtleTrafficStatisticsInfoOp extends TurtleTrafficStatisticsInfo {
  private long swigCPtr;

  protected TurtleTrafficStatisticsInfoOp(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.TurtleTrafficStatisticsInfoOp_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TurtleTrafficStatisticsInfoOp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_TurtleTrafficStatisticsInfoOp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TurtleTrafficStatisticsInfoOp() {
    this(RetroshareJNI.new_TurtleTrafficStatisticsInfoOp(), true);
  }

  public void reset() {
    RetroshareJNI.TurtleTrafficStatisticsInfoOp_reset(swigCPtr, this);
  }

}