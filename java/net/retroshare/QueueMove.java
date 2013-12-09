/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public final class QueueMove {
  public final static QueueMove QUEUE_TOP = new QueueMove("QUEUE_TOP", RetroshareJNI.QUEUE_TOP_get());
  public final static QueueMove QUEUE_UP = new QueueMove("QUEUE_UP", RetroshareJNI.QUEUE_UP_get());
  public final static QueueMove QUEUE_DOWN = new QueueMove("QUEUE_DOWN", RetroshareJNI.QUEUE_DOWN_get());
  public final static QueueMove QUEUE_BOTTOM = new QueueMove("QUEUE_BOTTOM", RetroshareJNI.QUEUE_BOTTOM_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static QueueMove swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + QueueMove.class + " with value " + swigValue);
  }

  private QueueMove(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private QueueMove(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private QueueMove(String swigName, QueueMove swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static QueueMove[] swigValues = { QUEUE_TOP, QUEUE_UP, QUEUE_DOWN, QUEUE_BOTTOM };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
