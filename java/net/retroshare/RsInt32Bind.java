/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsInt32Bind extends RetroBind {
  private long swigCPtr;

  protected RsInt32Bind(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsInt32Bind_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsInt32Bind obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsInt32Bind(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsInt32Bind(int value, int index) {
    this(RetroshareJNI.new_RsInt32Bind(value, index), true);
  }

  public boolean bind(SWIGTYPE_p_sqlite3_stmt stm) {
    return RetroshareJNI.RsInt32Bind_bind(swigCPtr, this, SWIGTYPE_p_sqlite3_stmt.getCPtr(stm));
  }

  public void setMValue(int value) {
    RetroshareJNI.RsInt32Bind_mValue_set(swigCPtr, this, value);
  }

  public int getMValue() {
    return RetroshareJNI.RsInt32Bind_mValue_get(swigCPtr, this);
  }

}
