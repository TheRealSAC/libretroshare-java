/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class PluginInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PluginInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PluginInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_PluginInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPlugin(RsPlugin value) {
    RetroshareJNI.PluginInfo_plugin_set(swigCPtr, this, RsPlugin.getCPtr(value), value);
  }

  public RsPlugin getPlugin() {
    long cPtr = RetroshareJNI.PluginInfo_plugin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RsPlugin(cPtr, false);
  }

  public void setFile_hash(SWIGTYPE_p_std__string value) {
    RetroshareJNI.PluginInfo_file_hash_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getFile_hash() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.PluginInfo_file_hash_get(swigCPtr, this), true);
  }

  public void setFile_name(SWIGTYPE_p_std__string value) {
    RetroshareJNI.PluginInfo_file_name_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getFile_name() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.PluginInfo_file_name_get(swigCPtr, this), true);
  }

  public void setCreator(SWIGTYPE_p_std__string value) {
    RetroshareJNI.PluginInfo_creator_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getCreator() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.PluginInfo_creator_get(swigCPtr, this), true);
  }

  public void setName(SWIGTYPE_p_std__string value) {
    RetroshareJNI.PluginInfo_name_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getName() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.PluginInfo_name_get(swigCPtr, this), true);
  }

  public void setAPI_version(long value) {
    RetroshareJNI.PluginInfo_API_version_set(swigCPtr, this, value);
  }

  public long getAPI_version() {
    return RetroshareJNI.PluginInfo_API_version_get(swigCPtr, this);
  }

  public void setSvn_revision(long value) {
    RetroshareJNI.PluginInfo_svn_revision_set(swigCPtr, this, value);
  }

  public long getSvn_revision() {
    return RetroshareJNI.PluginInfo_svn_revision_get(swigCPtr, this);
  }

  public void setStatus(long value) {
    RetroshareJNI.PluginInfo_status_set(swigCPtr, this, value);
  }

  public long getStatus() {
    return RetroshareJNI.PluginInfo_status_get(swigCPtr, this);
  }

  public void setInfo_string(SWIGTYPE_p_std__string value) {
    RetroshareJNI.PluginInfo_info_string_set(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public SWIGTYPE_p_std__string getInfo_string() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.PluginInfo_info_string_get(swigCPtr, this), true);
  }

  public PluginInfo() {
    this(RetroshareJNI.new_PluginInfo(), true);
  }

}