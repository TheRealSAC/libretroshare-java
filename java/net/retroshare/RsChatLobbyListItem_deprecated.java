/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsChatLobbyListItem_deprecated extends RsChatItem {
  private long swigCPtr;

  protected RsChatLobbyListItem_deprecated(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsChatLobbyListItem_deprecated_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsChatLobbyListItem_deprecated obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsChatLobbyListItem_deprecated(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsChatLobbyListItem_deprecated() {
    this(RetroshareJNI.new_RsChatLobbyListItem_deprecated__SWIG_0(), true);
  }

  public RsChatLobbyListItem_deprecated(SWIGTYPE_p_void data, long size) {
    this(RetroshareJNI.new_RsChatLobbyListItem_deprecated__SWIG_1(SWIGTYPE_p_void.getCPtr(data), size), true);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsChatLobbyListItem_deprecated_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsChatLobbyListItem_deprecated_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public boolean serialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsChatLobbyListItem_deprecated_serialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public long serial_size() {
    return RetroshareJNI.RsChatLobbyListItem_deprecated_serial_size(swigCPtr, this);
  }

  public void setLobby_ids(SWIGTYPE_p_std__vectorT_unsigned_long_long_t value) {
    RetroshareJNI.RsChatLobbyListItem_deprecated_lobby_ids_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_unsigned_long_long_t getLobby_ids() {
    return new SWIGTYPE_p_std__vectorT_unsigned_long_long_t(RetroshareJNI.RsChatLobbyListItem_deprecated_lobby_ids_get(swigCPtr, this), true);
  }

  public void setLobby_names(SWIGTYPE_p_std__vectorT_std__string_t value) {
    RetroshareJNI.RsChatLobbyListItem_deprecated_lobby_names_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__string_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_std__string_t getLobby_names() {
    return new SWIGTYPE_p_std__vectorT_std__string_t(RetroshareJNI.RsChatLobbyListItem_deprecated_lobby_names_get(swigCPtr, this), true);
  }

  public void setLobby_counts(SWIGTYPE_p_std__vectorT_unsigned_int_t value) {
    RetroshareJNI.RsChatLobbyListItem_deprecated_lobby_counts_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_int_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_unsigned_int_t getLobby_counts() {
    return new SWIGTYPE_p_std__vectorT_unsigned_int_t(RetroshareJNI.RsChatLobbyListItem_deprecated_lobby_counts_get(swigCPtr, this), true);
  }

}