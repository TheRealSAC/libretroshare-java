/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class RsPeerCryptoParams {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RsPeerCryptoParams(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RsPeerCryptoParams obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_RsPeerCryptoParams(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setConnexion_state(int value) {
    RetroshareJNI.RsPeerCryptoParams_connexion_state_set(swigCPtr, this, value);
  }

  public int getConnexion_state() {
    return RetroshareJNI.RsPeerCryptoParams_connexion_state_get(swigCPtr, this);
  }

  public void setCipher_name(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPeerCryptoParams_cipher_name_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getCipher_name() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPeerCryptoParams_cipher_name_get(swigCPtr, this), true);
  }

  public void setCipher_bits_1(int value) {
    RetroshareJNI.RsPeerCryptoParams_cipher_bits_1_set(swigCPtr, this, value);
  }

  public int getCipher_bits_1() {
    return RetroshareJNI.RsPeerCryptoParams_cipher_bits_1_get(swigCPtr, this);
  }

  public void setCipher_bits_2(int value) {
    RetroshareJNI.RsPeerCryptoParams_cipher_bits_2_set(swigCPtr, this, value);
  }

  public int getCipher_bits_2() {
    return RetroshareJNI.RsPeerCryptoParams_cipher_bits_2_get(swigCPtr, this);
  }

  public void setCipher_version(SWIGTYPE_p_std__string value) {
    RetroshareJNI.RsPeerCryptoParams_cipher_version_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getCipher_version() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.RsPeerCryptoParams_cipher_version_get(swigCPtr, this), true);
  }

  public RsPeerCryptoParams() {
    this(RetroshareJNI.new_RsPeerCryptoParams(), true);
  }

}
