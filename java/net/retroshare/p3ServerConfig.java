/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class p3ServerConfig extends RsServerConfig {
  private long swigCPtr;

  protected p3ServerConfig(long cPtr, boolean cMemoryOwn) {
    super(RetroshareJNI.p3ServerConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(p3ServerConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_p3ServerConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public p3ServerConfig(p3PeerMgr peerMgr, p3LinkMgr linkMgr, p3NetMgr netMgr, pqihandler pqih, p3GeneralConfig genCfg) {
    this(RetroshareJNI.new_p3ServerConfig(p3PeerMgr.getCPtr(peerMgr), peerMgr, p3LinkMgr.getCPtr(linkMgr), linkMgr, p3NetMgr.getCPtr(netMgr), netMgr, pqihandler.getCPtr(pqih), pqih, p3GeneralConfig.getCPtr(genCfg), genCfg), true);
  }

  public void load_config() {
    RetroshareJNI.p3ServerConfig_load_config(swigCPtr, this);
  }

  public int getConfigNetStatus(RsConfigNetStatus status) {
    return RetroshareJNI.p3ServerConfig_getConfigNetStatus(swigCPtr, this, RsConfigNetStatus.getCPtr(status), status);
  }

  public int getConfigStartup(RsConfigStartup params) {
    return RetroshareJNI.p3ServerConfig_getConfigStartup(swigCPtr, this, RsConfigStartup.getCPtr(params), params);
  }

  public int getTotalBandwidthRates(RsConfigDataRates rates) {
    return RetroshareJNI.p3ServerConfig_getTotalBandwidthRates(swigCPtr, this, RsConfigDataRates.getCPtr(rates), rates);
  }

  public int getAllBandwidthRates(SWIGTYPE_p_std__mapT_std__string_RsConfigDataRates_t ratemap) {
    return RetroshareJNI.p3ServerConfig_getAllBandwidthRates(swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_RsConfigDataRates_t.getCPtr(ratemap));
  }

  public SWIGTYPE_p_std__string RsConfigDirectory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3ServerConfig_RsConfigDirectory(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__string RsConfigKeysDirectory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3ServerConfig_RsConfigKeysDirectory(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__string RsProfileConfigDirectory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3ServerConfig_RsProfileConfigDirectory(swigCPtr, this), true);
  }

  public boolean getStartMinimised() {
    return RetroshareJNI.p3ServerConfig_getStartMinimised(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string getRetroShareLink() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3ServerConfig_getRetroShareLink(swigCPtr, this), true);
  }

  public boolean getAutoLogin() {
    return RetroshareJNI.p3ServerConfig_getAutoLogin(swigCPtr, this);
  }

  public void setAutoLogin(boolean autoLogin) {
    RetroshareJNI.p3ServerConfig_setAutoLogin(swigCPtr, this, autoLogin);
  }

  public boolean RsClearAutoLogin() {
    return RetroshareJNI.p3ServerConfig_RsClearAutoLogin(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string getRetroshareDataDirectory() {
    return new SWIGTYPE_p_std__string(RetroshareJNI.p3ServerConfig_getRetroshareDataDirectory(swigCPtr, this), true);
  }

  public long getUserLevel() {
    return RetroshareJNI.p3ServerConfig_getUserLevel(swigCPtr, this);
  }

  public long getNetState() {
    return RetroshareJNI.p3ServerConfig_getNetState(swigCPtr, this);
  }

  public long getNetworkMode() {
    return RetroshareJNI.p3ServerConfig_getNetworkMode(swigCPtr, this);
  }

  public long getNatTypeMode() {
    return RetroshareJNI.p3ServerConfig_getNatTypeMode(swigCPtr, this);
  }

  public long getNatHoleMode() {
    return RetroshareJNI.p3ServerConfig_getNatHoleMode(swigCPtr, this);
  }

  public long getConnectModes() {
    return RetroshareJNI.p3ServerConfig_getConnectModes(swigCPtr, this);
  }

  public boolean getConfigurationOption(long key, SWIGTYPE_p_std__string opt) {
    return RetroshareJNI.p3ServerConfig_getConfigurationOption(swigCPtr, this, key, SWIGTYPE_p_std__string.getCPtr(opt));
  }

  public boolean setConfigurationOption(long key, SWIGTYPE_p_std__string opt) {
    return RetroshareJNI.p3ServerConfig_setConfigurationOption(swigCPtr, this, key, SWIGTYPE_p_std__string.getCPtr(opt));
  }

  public long getOperatingMode() {
    return RetroshareJNI.p3ServerConfig_getOperatingMode(swigCPtr, this);
  }

  public boolean setOperatingMode(long opMode) {
    return RetroshareJNI.p3ServerConfig_setOperatingMode(swigCPtr, this, opMode);
  }

  public int SetMaxDataRates(int downKb, int upKb) {
    return RetroshareJNI.p3ServerConfig_SetMaxDataRates(swigCPtr, this, downKb, upKb);
  }

  public int GetMaxDataRates(SWIGTYPE_p_int downKb, SWIGTYPE_p_int upKb) {
    return RetroshareJNI.p3ServerConfig_GetMaxDataRates(swigCPtr, this, SWIGTYPE_p_int.getCPtr(downKb), SWIGTYPE_p_int.getCPtr(upKb));
  }

  public int GetCurrentDataRates(SWIGTYPE_p_float inKb, SWIGTYPE_p_float outKb) {
    return RetroshareJNI.p3ServerConfig_GetCurrentDataRates(swigCPtr, this, SWIGTYPE_p_float.getCPtr(inKb), SWIGTYPE_p_float.getCPtr(outKb));
  }

}