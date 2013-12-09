/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsPrivateChatDistantInviteConfigItem extends RsChatItem {
  private long swigCPtr;

  protected RsPrivateChatDistantInviteConfigItem(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.RsPrivateChatDistantInviteConfigItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsPrivateChatDistantInviteConfigItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsPrivateChatDistantInviteConfigItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RsPrivateChatDistantInviteConfigItem() {
    this(RetroshareJNI.new_RsPrivateChatDistantInviteConfigItem__SWIG_0(), true);
  }

  public RsPrivateChatDistantInviteConfigItem(SWIGTYPE_p_void data, long size) {
    this(RetroshareJNI.new_RsPrivateChatDistantInviteConfigItem__SWIG_1(SWIGTYPE_p_void.getCPtr(data), size), true);
  }

  public void clear() {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out, int indent) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsPrivateChatDistantInviteConfigItem_print__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out), indent), false);
  }

  public SWIGTYPE_p_std__ostream print(SWIGTYPE_p_std__ostream out) {
    return new SWIGTYPE_p_std__ostream(RetroshareJNI.RsPrivateChatDistantInviteConfigItem_print__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(out)), false);
  }

  public boolean serialise(SWIGTYPE_p_void data, SWIGTYPE_p_unsigned_int size) {
    return RetroshareJNI.RsPrivateChatDistantInviteConfigItem_serialise(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_unsigned_int.getCPtr(size));
  }

  public long serial_size() {
    return RetroshareJNI.RsPrivateChatDistantInviteConfigItem_serial_size(swigCPtr, this);
  }

  public void setAes_key(SWIGTYPE_p_unsigned_char value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_aes_key_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getAes_key() {
    long cPtr = RetroshareJNI.RsPrivateChatDistantInviteConfigItem_aes_key_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setHash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_hash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPrivateChatDistantInviteConfigItem_hash_get(swigCPtr, this), true);
  }

  public void setEncrypted_radix64_string(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_encrypted_radix64_string_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getEncrypted_radix64_string() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPrivateChatDistantInviteConfigItem_encrypted_radix64_string_get(swigCPtr, this), true);
  }

  public void setDestination_pgp_id(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_destination_pgp_id_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getDestination_pgp_id() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPrivateChatDistantInviteConfigItem_destination_pgp_id_get(swigCPtr, this), true);
  }

  public void setTime_of_validity(long value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_time_of_validity_set(swigCPtr, this, value);
  }

  public long getTime_of_validity() {
    return RetroshareJNI.RsPrivateChatDistantInviteConfigItem_time_of_validity_get(swigCPtr, this);
  }

  public void setLast_hit_time(long value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_last_hit_time_set(swigCPtr, this, value);
  }

  public long getLast_hit_time() {
    return RetroshareJNI.RsPrivateChatDistantInviteConfigItem_last_hit_time_get(swigCPtr, this);
  }

  public void setFlags(long value) {
    RetroshareJNI.RsPrivateChatDistantInviteConfigItem_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return RetroshareJNI.RsPrivateChatDistantInviteConfigItem_flags_get(swigCPtr, this);
  }

}