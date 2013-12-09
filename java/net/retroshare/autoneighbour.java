/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class autoneighbour extends autoserver {
  private long swigCPtr;

  protected autoneighbour(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.autoneighbour_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(autoneighbour obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_autoneighbour(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public autoneighbour() {
    this(RetroshareJNI.new_autoneighbour(), true);
  }

  public void setAuthoritative(boolean value) {
    RetroshareJNI.autoneighbour_authoritative_set(swigCPtr, this, value);
  }

  public boolean getAuthoritative() {
    return RetroshareJNI.autoneighbour_authoritative_get(swigCPtr, this);
  }

  public void setValidAddrs(boolean value) {
    RetroshareJNI.autoneighbour_validAddrs_set(swigCPtr, this, value);
  }

  public boolean getValidAddrs() {
    return RetroshareJNI.autoneighbour_validAddrs_get(swigCPtr, this);
  }

  public void setNeighbour_of(SWIGTYPE_p_std__mapT_std__string_autoserver_t value) {
    RetroshareJNI.autoneighbour_neighbour_of_set(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_autoserver_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_std__string_autoserver_t getNeighbour_of() {
    long cPtr = RetroshareJNI.autoneighbour_neighbour_of_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_std__string_autoserver_t(cPtr, false);
  }

}