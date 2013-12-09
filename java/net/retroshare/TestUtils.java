/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class TestUtils {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TestUtils(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TestUtils obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_TestUtils(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean createRandomFile(SWIGTYPE_p_std__string filename, java.math.BigInteger size) {
    return RetroshareJNI.TestUtils_createRandomFile(SWIGTYPE_p_std__string.getCPtr(filename), size);
  }

  public static SWIGTYPE_p_std__string createRandomFileHash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.TestUtils_createRandomFileHash(), true);
  }

  public static SWIGTYPE_p_std__string createRandomSSLId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.TestUtils_createRandomSSLId(), true);
  }

  public static SWIGTYPE_p_std__string createRandomPGPId() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.TestUtils_createRandomPGPId(), true);
  }

  public TestUtils() {
    this(RetroshareJNI.new_TestUtils(), true);
  }

}
