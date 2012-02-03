/**
 * DelExam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.brightedu.server.soap.zzu;

public class DelExam  implements java.io.Serializable {
    private java.lang.String bmh;

    private java.lang.String gid;

    public DelExam() {
    }

    public DelExam(
           java.lang.String bmh,
           java.lang.String gid) {
           this.bmh = bmh;
           this.gid = gid;
    }


    /**
     * Gets the bmh value for this DelExam.
     * 
     * @return bmh
     */
    public java.lang.String getBmh() {
        return bmh;
    }


    /**
     * Sets the bmh value for this DelExam.
     * 
     * @param bmh
     */
    public void setBmh(java.lang.String bmh) {
        this.bmh = bmh;
    }


    /**
     * Gets the gid value for this DelExam.
     * 
     * @return gid
     */
    public java.lang.String getGid() {
        return gid;
    }


    /**
     * Sets the gid value for this DelExam.
     * 
     * @param gid
     */
    public void setGid(java.lang.String gid) {
        this.gid = gid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelExam)) return false;
        DelExam other = (DelExam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bmh==null && other.getBmh()==null) || 
             (this.bmh!=null &&
              this.bmh.equals(other.getBmh()))) &&
            ((this.gid==null && other.getGid()==null) || 
             (this.gid!=null &&
              this.gid.equals(other.getGid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBmh() != null) {
            _hashCode += getBmh().hashCode();
        }
        if (getGid() != null) {
            _hashCode += getGid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelExam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelExam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bmh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bmh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}