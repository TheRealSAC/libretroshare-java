/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3Config extends pqiConfig {
  private long swigCPtr;

  protected p3Config(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3Config_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3Config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3Config(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean loadConfiguration(SWIGTYPE_p_std__string loadHash) {
    return RetroshareJNI.p3Config_loadConfiguration(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(loadHash));
  }

  public boolean saveConfiguration() {
    return RetroshareJNI.p3Config_saveConfiguration(swigCPtr, this);
  }

}
