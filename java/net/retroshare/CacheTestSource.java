/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class CacheTestSource extends CacheSource {
  private long swigCPtr;

  protected CacheTestSource(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.CacheTestSource_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CacheTestSource obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_CacheTestSource(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CacheTestSource(CacheStrapper cs, SWIGTYPE_p_std__string dir) {
    this(RetroshareJNI.new_CacheTestSource(CacheStrapper.getCPtr(cs), cs, SWIGTYPE_p_std__string.getCPtr(dir)), true);
  }

}
