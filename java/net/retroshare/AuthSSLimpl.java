/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class AuthSSLimpl extends AuthSSL {
  private long swigCPtr;

  protected AuthSSLimpl(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.AuthSSLimpl_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AuthSSLimpl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_AuthSSLimpl(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AuthSSLimpl() {
    this(RetroshareJNI.new_AuthSSLimpl(), true);
  }

  public boolean validateOwnCertificate(SWIGTYPE_p_X509 x509, SWIGTYPE_p_EVP_PKEY pkey) {
    return RetroshareJNI.AuthSSLimpl_validateOwnCertificate(swigCPtr, this, SWIGTYPE_p_X509.getCPtr(x509), SWIGTYPE_p_EVP_PKEY.getCPtr(pkey));
  }

  public boolean active() {
    return RetroshareJNI.AuthSSLimpl_active(swigCPtr, this);
  }

  public int InitAuth(String srvr_cert, String priv_key, String passwd) {
    return RetroshareJNI.AuthSSLimpl_InitAuth(swigCPtr, this, srvr_cert, priv_key, passwd);
  }

  public boolean CloseAuth() {
    return RetroshareJNI.AuthSSLimpl_CloseAuth(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string OwnId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.AuthSSLimpl_OwnId(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__string getOwnLocation() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.AuthSSLimpl_getOwnLocation(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__string SaveOwnCertificateToString() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.AuthSSLimpl_SaveOwnCertificateToString(swigCPtr, this), true);
  }

  public boolean SignData(SWIGTYPE_p_std__string input, SWIGTYPE_p_std__string sign) {
    return RetroshareJNI.AuthSSLimpl_SignData__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(input), SWIGTYPE_p_std__string.getCPtr(sign));
  }

  public boolean SignData(SWIGTYPE_p_void data, long len, SWIGTYPE_p_std__string sign) {
    return RetroshareJNI.AuthSSLimpl_SignData__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), len, SWIGTYPE_p_std__string.getCPtr(sign));
  }

  public boolean SignDataBin(SWIGTYPE_p_std__string arg0, SWIGTYPE_p_unsigned_char arg1, SWIGTYPE_p_unsigned_int arg2) {
    return RetroshareJNI.AuthSSLimpl_SignDataBin__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(arg0), SWIGTYPE_p_unsigned_char.getCPtr(arg1), SWIGTYPE_p_unsigned_int.getCPtr(arg2));
  }

  public boolean SignDataBin(SWIGTYPE_p_void arg0, long arg1, SWIGTYPE_p_unsigned_char arg2, SWIGTYPE_p_unsigned_int arg3) {
    return RetroshareJNI.AuthSSLimpl_SignDataBin__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg0), arg1, SWIGTYPE_p_unsigned_char.getCPtr(arg2), SWIGTYPE_p_unsigned_int.getCPtr(arg3));
  }

  public boolean VerifyOwnSignBin(SWIGTYPE_p_void arg0, long arg1, SWIGTYPE_p_unsigned_char arg2, long arg3) {
    return RetroshareJNI.AuthSSLimpl_VerifyOwnSignBin(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg0), arg1, SWIGTYPE_p_unsigned_char.getCPtr(arg2), arg3);
  }

  public boolean VerifySignBin(SWIGTYPE_p_void data, long len, SWIGTYPE_p_unsigned_char sign, long signlen, SWIGTYPE_p_std__string sslId) {
    return RetroshareJNI.AuthSSLimpl_VerifySignBin(swigCPtr, this, SWIGTYPE_p_void.getCPtr(data), len, SWIGTYPE_p_unsigned_char.getCPtr(sign), signlen, SWIGTYPE_p_std__string.getCPtr(sslId));
  }

  public boolean encrypt(SWIGTYPE_p_p_void out, SWIGTYPE_p_int outlen, SWIGTYPE_p_void in, int inlen, SWIGTYPE_p_std__string peerId) {
    return RetroshareJNI.AuthSSLimpl_encrypt(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(out), SWIGTYPE_p_int.getCPtr(outlen), SWIGTYPE_p_void.getCPtr(in), inlen, SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public boolean decrypt(SWIGTYPE_p_p_void out, SWIGTYPE_p_int outlen, SWIGTYPE_p_void in, int inlen) {
    return RetroshareJNI.AuthSSLimpl_decrypt(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(out), SWIGTYPE_p_int.getCPtr(outlen), SWIGTYPE_p_void.getCPtr(in), inlen);
  }

  public SWIGTYPE_p_X509 SignX509ReqWithGPG(SWIGTYPE_p_X509_REQ req, int days) {
    long cPtr = RetroshareJNI.AuthSSLimpl_SignX509ReqWithGPG(swigCPtr, this, SWIGTYPE_p_X509_REQ.getCPtr(req), days);
    return (cPtr == 0) ? null : new SWIGTYPE_p_X509(cPtr, false);
  }

  public boolean AuthX509WithGPG(SWIGTYPE_p_X509 x509) {
    return RetroshareJNI.AuthSSLimpl_AuthX509WithGPG(swigCPtr, this, SWIGTYPE_p_X509.getCPtr(x509));
  }

  public int VerifyX509Callback(int preverify_ok, SWIGTYPE_p_X509_STORE_CTX ctx) {
    return RetroshareJNI.AuthSSLimpl_VerifyX509Callback(swigCPtr, this, preverify_ok, SWIGTYPE_p_X509_STORE_CTX.getCPtr(ctx));
  }

  public boolean ValidateCertificate(SWIGTYPE_p_X509 x509, SWIGTYPE_p_std__string peerId) {
    return RetroshareJNI.AuthSSLimpl_ValidateCertificate(swigCPtr, this, SWIGTYPE_p_X509.getCPtr(x509), SWIGTYPE_p_std__string.getCPtr(peerId));
  }

  public RsSerialiser setupSerialiser() {
    long cPtr = RetroshareJNI.AuthSSLimpl_setupSerialiser(swigCPtr, this);
    return (cPtr == 0) ? null : new RsSerialiser(cPtr, false);
  }

  public boolean saveList(SWIGTYPE_p_bool cleanup, SWIGTYPE_p_std__listT_RsItem_p_t arg1) {
    return RetroshareJNI.AuthSSLimpl_saveList(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(cleanup), SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(arg1));
  }

  public boolean loadList(SWIGTYPE_p_std__listT_RsItem_p_t load) {
    return RetroshareJNI.AuthSSLimpl_loadList(swigCPtr, this, SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(load));
  }

  public SWIGTYPE_p_SSL_CTX getCTX() {
    long cPtr = RetroshareJNI.AuthSSLimpl_getCTX(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SSL_CTX(cPtr, false);
  }

  public void setCurrentConnectionAttemptInfo(SWIGTYPE_p_std__string gpg_id, SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string ssl_cn) {
    RetroshareJNI.AuthSSLimpl_setCurrentConnectionAttemptInfo(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gpg_id), SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(ssl_cn));
  }

  public void getCurrentConnectionAttemptInfo(SWIGTYPE_p_std__string gpg_id, SWIGTYPE_p_std__string ssl_id, SWIGTYPE_p_std__string ssl_cn) {
    RetroshareJNI.AuthSSLimpl_getCurrentConnectionAttemptInfo(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(gpg_id), SWIGTYPE_p_std__string.getCPtr(ssl_id), SWIGTYPE_p_std__string.getCPtr(ssl_cn));
  }

  public boolean FailedCertificate(SWIGTYPE_p_X509 x509, SWIGTYPE_p_std__string gpgid, SWIGTYPE_p_std__string sslid, SWIGTYPE_p_std__string sslcn, SWIGTYPE_p_sockaddr_in addr, boolean incoming) {
    return RetroshareJNI.AuthSSLimpl_FailedCertificate(swigCPtr, this, SWIGTYPE_p_X509.getCPtr(x509), SWIGTYPE_p_std__string.getCPtr(gpgid), SWIGTYPE_p_std__string.getCPtr(sslid), SWIGTYPE_p_std__string.getCPtr(sslcn), SWIGTYPE_p_sockaddr_in.getCPtr(addr), incoming);
  }

  public boolean CheckCertificate(SWIGTYPE_p_std__string peerId, SWIGTYPE_p_X509 x509) {
    return RetroshareJNI.AuthSSLimpl_CheckCertificate(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(peerId), SWIGTYPE_p_X509.getCPtr(x509));
  }

}