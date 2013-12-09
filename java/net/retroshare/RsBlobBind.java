/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsBlobBind extends RetroBind {
  private long swigCPtr;

  protected RsBlobBind(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsBlobBind_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsBlobBind obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsBlobBind(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsBlobBind(String data, long dataLen, int index) {
    this(RetroshareJNI.new_RsBlobBind(data, dataLen, index), true);
  }

  public boolean bind(SWIGTYPE_p_sqlite3_stmt stm) {
    return RetroshareJNI.RsBlobBind_bind(swigCPtr, this, SWIGTYPE_p_sqlite3_stmt.getCPtr(stm));
  }

  public void setMData(String value) {
    RetroshareJNI.RsBlobBind_mData_set(swigCPtr, this, value);
  }

  public String getMData() {
    return RetroshareJNI.RsBlobBind_mData_get(swigCPtr, this);
  }

  public void setMDataLen(long value) {
    RetroshareJNI.RsBlobBind_mDataLen_set(swigCPtr, this, value);
  }

  public long getMDataLen() {
    return RetroshareJNI.RsBlobBind_mDataLen_get(swigCPtr, this);
  }

}
