/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class SmallObjectAllocator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SmallObjectAllocator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SmallObjectAllocator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_SmallObjectAllocator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SmallObjectAllocator(long maxObjectSize) {
    this(RetroshareJNI.new_SmallObjectAllocator(maxObjectSize), true);
  }

  public SWIGTYPE_p_void allocate(long numBytes) {
    long cPtr = RetroshareJNI.SmallObjectAllocator_allocate(swigCPtr, this, numBytes);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void deallocate(SWIGTYPE_p_void p, long size) {
    RetroshareJNI.SmallObjectAllocator_deallocate(swigCPtr, this, SWIGTYPE_p_void.getCPtr(p), size);
  }

  public void printStatistics() {
    RetroshareJNI.SmallObjectAllocator_printStatistics(swigCPtr, this);
  }

  public void set_active(boolean value) {
    RetroshareJNI.SmallObjectAllocator__active_set(swigCPtr, this, value);
  }

  public boolean get_active() {
    return RetroshareJNI.SmallObjectAllocator__active_get(swigCPtr, this);
  }

}
