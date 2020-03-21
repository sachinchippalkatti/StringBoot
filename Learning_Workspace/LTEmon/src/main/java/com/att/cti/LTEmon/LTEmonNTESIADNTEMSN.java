package com.att.cti.LTEmon;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class LTEmonNTESIADNTEMSN {

	@JsonProperty("NTE_SIAD_NTE_MSN_Connectivity")
	private List<NTESIADNTEMSNConnectivity> nTESIADNTEMSNConnectivity = null;

	/**
	* No args constructor for use in serialization
	*
	*/
	public LTEmonNTESIADNTEMSN() {
	}

	/**
	*
	* @param nTESIADNTEMSNConnectivity
	*/
	public LTEmonNTESIADNTEMSN(List<NTESIADNTEMSNConnectivity> nTESIADNTEMSNConnectivity) {
	super();
	this.nTESIADNTEMSNConnectivity = nTESIADNTEMSNConnectivity;
	}

	@JsonProperty("NTE_SIAD_NTE_MSN_Connectivity")
	public List<NTESIADNTEMSNConnectivity> getNTESIADNTEMSNConnectivity() {
	return nTESIADNTEMSNConnectivity;
	}

	@JsonProperty("NTE_SIAD_NTE_MSN_Connectivity")
	public void setNTESIADNTEMSNConnectivity(List<NTESIADNTEMSNConnectivity> nTESIADNTEMSNConnectivity) {
	this.nTESIADNTEMSNConnectivity = nTESIADNTEMSNConnectivity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LTEmonNTESIADNTEMSN [nTESIADNTEMSNConnectivity=");
		builder.append(nTESIADNTEMSNConnectivity);
		builder.append("]");
		return builder.toString();
	}

}
