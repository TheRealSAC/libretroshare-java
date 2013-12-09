/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class Expression {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Expression(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Expression obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_Expression(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean eval(FileEntry file) {
    return RetroshareJNI.Expression_eval(swigCPtr, this, FileEntry.getCPtr(file), file);
  }

  public void linearize(LinearizedExpression e) {
    RetroshareJNI.Expression_linearize(swigCPtr, this, LinearizedExpression.getCPtr(e), e);
  }

}