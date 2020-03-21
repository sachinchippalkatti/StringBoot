package com.att.cti.LTEmon;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"A_END_VLAN_ID",
"A_END_VENDOR",
"A_END_SLOT",
"Z_END_NODE_NAME",
"PATH_ID",
"A_END_OAM_IP",
"Z_END_PORTID",
"Z_END_OAM_IP",
"A_END_PORTID",
"A_END_NODE_NAME",
"Z_END_SLOT",
"PARENT_PATH_ID",
"Z_END_NODE_TYPE",
"Z_END_VLAN_ID",
"Z_END_VENDOR"
})
public class NTESIADNTEMSNConnectivity {

@JsonProperty("A_END_VLAN_ID")
private String aENDVLANID;
@JsonProperty("A_END_VENDOR")
private String aENDVENDOR;
@JsonProperty("A_END_SLOT")
private String aENDSLOT;
@JsonProperty("Z_END_NODE_NAME")
private String zENDNODENAME;
@JsonProperty("PATH_ID")
private String pATHID;
@JsonProperty("A_END_OAM_IP")
private String aENDOAMIP;
@JsonProperty("Z_END_PORTID")
private String zENDPORTID;
@JsonProperty("Z_END_OAM_IP")
private String zENDOAMIP;
@JsonProperty("A_END_PORTID")
private String aENDPORTID;
@JsonProperty("A_END_NODE_NAME")
private String aENDNODENAME;
@JsonProperty("Z_END_SLOT")
private String zENDSLOT;
@JsonProperty("PARENT_PATH_ID")
private String pARENTPATHID;
@JsonProperty("Z_END_NODE_TYPE")
private String zENDNODETYPE;
@JsonProperty("Z_END_VLAN_ID")
private String zENDVLANID;
@JsonProperty("Z_END_VENDOR")
private String zENDVENDOR;

/**
* No args constructor for use in serialization
*
*/
public NTESIADNTEMSNConnectivity() {
}

/**
*
* @param aENDNODENAME
* @param zENDSLOT
* @param zENDPORTID
* @param aENDSLOT
* @param pARENTPATHID
* @param aENDOAMIP
* @param aENDVLANID
* @param zENDVENDOR
* @param zENDNODENAME
* @param zENDOAMIP
* @param aENDVENDOR
* @param pATHID
* @param aENDPORTID
* @param zENDVLANID
* @param zENDNODETYPE
*/
public NTESIADNTEMSNConnectivity(String aENDVLANID, String aENDVENDOR, String aENDSLOT, String zENDNODENAME, String pATHID, String aENDOAMIP, String zENDPORTID, String zENDOAMIP, String aENDPORTID, String aENDNODENAME, String zENDSLOT, String pARENTPATHID, String zENDNODETYPE, String zENDVLANID, String zENDVENDOR) {
super();
this.aENDVLANID = aENDVLANID;
this.aENDVENDOR = aENDVENDOR;
this.aENDSLOT = aENDSLOT;
this.zENDNODENAME = zENDNODENAME;
this.pATHID = pATHID;
this.aENDOAMIP = aENDOAMIP;
this.zENDPORTID = zENDPORTID;
this.zENDOAMIP = zENDOAMIP;
this.aENDPORTID = aENDPORTID;
this.aENDNODENAME = aENDNODENAME;
this.zENDSLOT = zENDSLOT;
this.pARENTPATHID = pARENTPATHID;
this.zENDNODETYPE = zENDNODETYPE;
this.zENDVLANID = zENDVLANID;
this.zENDVENDOR = zENDVENDOR;
}

@JsonProperty("A_END_VLAN_ID")
public String getAENDVLANID() {
return aENDVLANID;
}

@JsonProperty("A_END_VLAN_ID")
public void setAENDVLANID(String aENDVLANID) {
this.aENDVLANID = aENDVLANID;
}

@JsonProperty("A_END_VENDOR")
public String getAENDVENDOR() {
return aENDVENDOR;
}

@JsonProperty("A_END_VENDOR")
public void setAENDVENDOR(String aENDVENDOR) {
this.aENDVENDOR = aENDVENDOR;
}

@JsonProperty("A_END_SLOT")
public String getAENDSLOT() {
return aENDSLOT;
}

@JsonProperty("A_END_SLOT")
public void setAENDSLOT(String aENDSLOT) {
this.aENDSLOT = aENDSLOT;
}

@JsonProperty("Z_END_NODE_NAME")
public String getZENDNODENAME() {
return zENDNODENAME;
}

@JsonProperty("Z_END_NODE_NAME")
public void setZENDNODENAME(String zENDNODENAME) {
this.zENDNODENAME = zENDNODENAME;
}

@JsonProperty("PATH_ID")
public String getPATHID() {
return pATHID;
}

@JsonProperty("PATH_ID")
public void setPATHID(String pATHID) {
this.pATHID = pATHID;
}

@JsonProperty("A_END_OAM_IP")
public String getAENDOAMIP() {
return aENDOAMIP;
}

@JsonProperty("A_END_OAM_IP")
public void setAENDOAMIP(String aENDOAMIP) {
this.aENDOAMIP = aENDOAMIP;
}

@JsonProperty("Z_END_PORTID")
public String getZENDPORTID() {
return zENDPORTID;
}

@JsonProperty("Z_END_PORTID")
public void setZENDPORTID(String zENDPORTID) {
this.zENDPORTID = zENDPORTID;
}

@JsonProperty("Z_END_OAM_IP")
public String getZENDOAMIP() {
return zENDOAMIP;
}

@JsonProperty("Z_END_OAM_IP")
public void setZENDOAMIP(String zENDOAMIP) {
this.zENDOAMIP = zENDOAMIP;
}

@JsonProperty("A_END_PORTID")
public String getAENDPORTID() {
return aENDPORTID;
}

@JsonProperty("A_END_PORTID")
public void setAENDPORTID(String aENDPORTID) {
this.aENDPORTID = aENDPORTID;
}

@JsonProperty("A_END_NODE_NAME")
public String getAENDNODENAME() {
return aENDNODENAME;
}

@JsonProperty("A_END_NODE_NAME")
public void setAENDNODENAME(String aENDNODENAME) {
this.aENDNODENAME = aENDNODENAME;
}

@JsonProperty("Z_END_SLOT")
public String getZENDSLOT() {
return zENDSLOT;
}

@JsonProperty("Z_END_SLOT")
public void setZENDSLOT(String zENDSLOT) {
this.zENDSLOT = zENDSLOT;
}

@JsonProperty("PARENT_PATH_ID")
public String getPARENTPATHID() {
return pARENTPATHID;
}

@JsonProperty("PARENT_PATH_ID")
public void setPARENTPATHID(String pARENTPATHID) {
this.pARENTPATHID = pARENTPATHID;
}

@JsonProperty("Z_END_NODE_TYPE")
public String getZENDNODETYPE() {
return zENDNODETYPE;
}

@JsonProperty("Z_END_NODE_TYPE")
public void setZENDNODETYPE(String zENDNODETYPE) {
this.zENDNODETYPE = zENDNODETYPE;
}

@JsonProperty("Z_END_VLAN_ID")
public String getZENDVLANID() {
return zENDVLANID;
}

@JsonProperty("Z_END_VLAN_ID")
public void setZENDVLANID(String zENDVLANID) {
this.zENDVLANID = zENDVLANID;
}

@JsonProperty("Z_END_VENDOR")
public String getZENDVENDOR() {
return zENDVENDOR;
}

@JsonProperty("Z_END_VENDOR")
public void setZENDVENDOR(String zENDVENDOR) {
this.zENDVENDOR = zENDVENDOR;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("NTESIADNTEMSNConnectivity [aENDVLANID=");
	builder.append(aENDVLANID);
	builder.append(", aENDVENDOR=");
	builder.append(aENDVENDOR);
	builder.append(", aENDSLOT=");
	builder.append(aENDSLOT);
	builder.append(", zENDNODENAME=");
	builder.append(zENDNODENAME);
	builder.append(", pATHID=");
	builder.append(pATHID);
	builder.append(", aENDOAMIP=");
	builder.append(aENDOAMIP);
	builder.append(", zENDPORTID=");
	builder.append(zENDPORTID);
	builder.append(", zENDOAMIP=");
	builder.append(zENDOAMIP);
	builder.append(", aENDPORTID=");
	builder.append(aENDPORTID);
	builder.append(", aENDNODENAME=");
	builder.append(aENDNODENAME);
	builder.append(", zENDSLOT=");
	builder.append(zENDSLOT);
	builder.append(", pARENTPATHID=");
	builder.append(pARENTPATHID);
	builder.append(", zENDNODETYPE=");
	builder.append(zENDNODETYPE);
	builder.append(", zENDVLANID=");
	builder.append(zENDVLANID);
	builder.append(", zENDVENDOR=");
	builder.append(zENDVENDOR);
	builder.append("]");
	return builder.toString();
}

}