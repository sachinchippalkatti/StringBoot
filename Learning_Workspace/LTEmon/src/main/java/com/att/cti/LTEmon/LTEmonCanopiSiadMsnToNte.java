package com.att.cti.LTEmon;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class LTEmonCanopiSiadMsnToNte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		LTEmonNTESIADNTEMSN ntesiadntemsnConnectivity = null;
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> siadMsnToNteMtso = new HashMap<>();
		
		try
	      {
			ntesiadntemsnConnectivity= mapper.readValue(new File("C:\\feeds\\incoming\\research\\NTE_SIAD_NTE_MSN_Connectivity.20200106"), LTEmonNTESIADNTEMSN.class);
			siadMsnToNteMtso =createMapping(ntesiadntemsnConnectivity);
			System.out.println("siadMsnToNteMtso map containts following value");
			for(String key: siadMsnToNteMtso.keySet()) {
				System.out.println(key + "-->" + siadMsnToNteMtso.get(key));
			}
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
	      //System.out.println(ntesiadntemsnConnectivity);
	}

	private static Map<String, String> createMapping(LTEmonNTESIADNTEMSN ntesiadntemsnConnectivity) {
		// TODO Auto-generated method stub
		Map<String, String> siadMsnToNteMtso = new HashMap<>();
		for(NTESIADNTEMSNConnectivity siadMsn: ntesiadntemsnConnectivity.getNTESIADNTEMSNConnectivity()) {
			siadMsnToNteMtso.put(siadMsn.getZENDNODENAME(), siadMsn.getAENDNODENAME());
		}
		return siadMsnToNteMtso;
	}

}
