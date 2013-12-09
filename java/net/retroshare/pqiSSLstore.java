/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class pqiSSLstore extends pqistore {
  private long swigCPtr;

  protected pqiSSLstore(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.pqiSSLstore_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pqiSSLstore obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_pqiSSLstore(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public pqiSSLstore(RsSerialiser rss, SWIGTYPE_p_std__string srcId, BinEncryptedFileInterface bio_in, int bio_flagsin) {
    this(RetroshareJNI.new_pqiSSLstore(RsSerialiser.getCPtr(rss), rss, SWIGTYPE_p_std__string.getCPtr(srcId), BinEncryptedFileInterface.getCPtr(bio_in), bio_in, bio_flagsin), true);
  }

  public boolean encryptedSendItems(SWIGTYPE_p_std__listT_RsItem_p_t arg0) {
    return RetroshareJNI.pqiSSLstore_encryptedSendItems(swigCPtr, this, SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(arg0));
  }

  public boolean getEncryptedItems(SWIGTYPE_p_std__listT_RsItem_p_t arg0) {
    return RetroshareJNI.pqiSSLstore_getEncryptedItems(swigCPtr, this, SWIGTYPE_p_std__listT_RsItem_p_t.getCPtr(arg0));
  }

}