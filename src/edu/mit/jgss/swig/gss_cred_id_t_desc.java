/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.mit.jgss.swig;

public class gss_cred_id_t_desc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected gss_cred_id_t_desc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(gss_cred_id_t_desc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gsswrapperJNI.delete_gss_cred_id_t_desc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLoopback(gss_cred_id_t_desc value) {
    gsswrapperJNI.gss_cred_id_t_desc_loopback_set(swigCPtr, this, gss_cred_id_t_desc.getCPtr(value), value);
  }

  public gss_cred_id_t_desc getLoopback() {
    long cPtr = gsswrapperJNI.gss_cred_id_t_desc_loopback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new gss_cred_id_t_desc(cPtr, false);
  }

  public void setCount(int value) {
    gsswrapperJNI.gss_cred_id_t_desc_count_set(swigCPtr, this, value);
  }

  public int getCount() {
    return gsswrapperJNI.gss_cred_id_t_desc_count_get(swigCPtr, this);
  }

  public void setMechs_array(gss_OID_desc value) {
    gsswrapperJNI.gss_cred_id_t_desc_mechs_array_set(swigCPtr, this, gss_OID_desc.getCPtr(value), value);
  }

  public gss_OID_desc getMechs_array() {
    long cPtr = gsswrapperJNI.gss_cred_id_t_desc_mechs_array_get(swigCPtr, this);
    return (cPtr == 0) ? null : new gss_OID_desc(cPtr, false);
  }

  public void setCred_array(gss_cred_id_t_desc value) {
    gsswrapperJNI.gss_cred_id_t_desc_cred_array_set(swigCPtr, this, value);
  }

  public gss_cred_id_t_desc getCred_array() {
    return gsswrapperJNI.gss_cred_id_t_desc_cred_array_get(swigCPtr, this);
}

  public gss_cred_id_t_desc() {
    this(gsswrapperJNI.new_gss_cred_id_t_desc(), true);
  }

}
