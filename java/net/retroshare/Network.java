/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.retroshare;

public class Network {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Network(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Network obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RetroshareJNI.delete_Network(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean initRandom(long n_nodes, float connexion_probability) {
    return RetroshareJNI.Network_initRandom(swigCPtr, this, n_nodes, connexion_probability);
  }

  public void tick() {
    RetroshareJNI.Network_tick(swigCPtr, this);
  }

  public PeerNode node_by_id(SWIGTYPE_p_std__string node_id) {
    return new PeerNode(RetroshareJNI.Network_node_by_id(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(node_id)), false);
  }

  public Network() {
    this(RetroshareJNI.new_Network(), true);
  }

}