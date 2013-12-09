/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsDiscSpace {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsDiscSpace(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsDiscSpace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsDiscSpace(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean checkForDiscSpace(long loc) {
    return RetroshareJNI.RsDiscSpace_checkForDiscSpace(loc);
  }

  public static void setFreeSpaceLimit(long mega_bytes) {
    RetroshareJNI.RsDiscSpace_setFreeSpaceLimit(mega_bytes);
  }

  public static long freeSpaceLimit() {
    return RetroshareJNI.RsDiscSpace_freeSpaceLimit();
  }

  public static void setPartialsPath(SWIGTYPE_p_std__string path) {
    RetroshareJNI.RsDiscSpace_setPartialsPath(SWIGTYPE_p_std__string.getCPtr(path));
  }

  public static void setDownloadPath(SWIGTYPE_p_std__string path) {
    RetroshareJNI.RsDiscSpace_setDownloadPath(SWIGTYPE_p_std__string.getCPtr(path));
  }

  public RsDiscSpace() {
    this(RetroshareJNI.new_RsDiscSpace(), true);
  }

}
