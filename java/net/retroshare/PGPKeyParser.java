/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class PGPKeyParser {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PGPKeyParser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PGPKeyParser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_PGPKeyParser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static java.math.BigInteger read_KeyID(SWIGTYPE_p_p_unsigned_char data) {
    return RetroshareJNI.PGPKeyParser_read_KeyID(SWIGTYPE_p_p_unsigned_char.getCPtr(data));
  }

  public static long read_125Size(SWIGTYPE_p_p_unsigned_char data) {
    return RetroshareJNI.PGPKeyParser_read_125Size(SWIGTYPE_p_p_unsigned_char.getCPtr(data));
  }

  public static long read_partialBodyLength(SWIGTYPE_p_p_unsigned_char data) {
    return RetroshareJNI.PGPKeyParser_read_partialBodyLength(SWIGTYPE_p_p_unsigned_char.getCPtr(data));
  }

  public static void read_packetHeader(SWIGTYPE_p_p_unsigned_char data, SWIGTYPE_p_unsigned_char packet_tag, SWIGTYPE_p_unsigned_int packet_length) {
    RetroshareJNI.PGPKeyParser_read_packetHeader(SWIGTYPE_p_p_unsigned_char.getCPtr(data), SWIGTYPE_p_unsigned_char.getCPtr(packet_tag), SWIGTYPE_p_unsigned_int.getCPtr(packet_length));
  }

  public static long write_125Size(SWIGTYPE_p_unsigned_char data, long size) {
    return RetroshareJNI.PGPKeyParser_write_125Size(SWIGTYPE_p_unsigned_char.getCPtr(data), size);
  }

  public static SWIGTYPE_p_std__string extractRadixPartFromArmouredKey(SWIGTYPE_p_std__string pgp_cert, SWIGTYPE_p_std__string version_string) {
    return new SWIGTYPE_p_std__string(RetroshareJNI.PGPKeyParser_extractRadixPartFromArmouredKey(SWIGTYPE_p_std__string.getCPtr(pgp_cert), SWIGTYPE_p_std__string.getCPtr(version_string)), true);
  }

  public PGPKeyParser() {
    this(RetroshareJNI.new_PGPKeyParser(), true);
  }

  public final static short PGP_PACKET_TAG_PUBLIC_KEY = RetroshareJNI.PGPKeyParser_PGP_PACKET_TAG_PUBLIC_KEY_get();
  public final static short PGP_PACKET_TAG_USER_ID = RetroshareJNI.PGPKeyParser_PGP_PACKET_TAG_USER_ID_get();
  public final static short PGP_PACKET_TAG_SIGNATURE = RetroshareJNI.PGPKeyParser_PGP_PACKET_TAG_SIGNATURE_get();
}