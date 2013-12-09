/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsCacheItem extends RsItem {
  private long swigCPtr;

  protected RsCacheItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsCacheItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsCacheItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsCacheItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsCacheItem() {
    this(RetroshareJNI.new_RsCacheItem(), true);
  }

  public void clear() {
    RetroshareJNI.RsCacheItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsCacheItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsCacheItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public void setCacheType(int value) {
    RetroshareJNI.RsCacheItem_cacheType_set(swigCPtr, this, value);
  }

  public int getCacheType() {
    return RetroshareJNI.RsCacheItem_cacheType_get(swigCPtr, this);
  }

  public void setCacheSubId(int value) {
    RetroshareJNI.RsCacheItem_cacheSubId_set(swigCPtr, this, value);
  }

  public int getCacheSubId() {
    return RetroshareJNI.RsCacheItem_cacheSubId_get(swigCPtr, this);
  }

  public void setFile(RsTlvFileItem value) {
    RetroshareJNI.RsCacheItem_file_set(swigCPtr, this, RsTlvFileItem.getCPtr(value), value);
  }

  public RsTlvFileItem getFile() {
    long cPtr = RetroshareJNI.RsCacheItem_file_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsTlvFileItem(cPtr, false);
  }

}
