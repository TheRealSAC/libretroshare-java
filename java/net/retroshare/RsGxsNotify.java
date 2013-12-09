/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsGxsNotify {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsGxsNotify(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsGxsNotify obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsGxsNotify(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RsGxsNotify.NotifyType getType() {
    return RsGxsNotify.NotifyType.swigToEnum(RetroshareJNI.RsGxsNotify_getType(swigCPtr, this));
  }

  public final static class NotifyType {
    public final static RsGxsNotify.NotifyType TYPE_PUBLISH = new RsGxsNotify.NotifyType("TYPE_PUBLISH");
    public final static RsGxsNotify.NotifyType TYPE_RECEIVE = new RsGxsNotify.NotifyType("TYPE_RECEIVE");
    public final static RsGxsNotify.NotifyType TYPE_PROCESSED = new RsGxsNotify.NotifyType("TYPE_PROCESSED");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static NotifyType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + NotifyType.class + " with value " + swigValue);
    }

    private NotifyType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private NotifyType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private NotifyType(String swigName, NotifyType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static NotifyType[] swigValues = { TYPE_PUBLISH, TYPE_RECEIVE, TYPE_PROCESSED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}