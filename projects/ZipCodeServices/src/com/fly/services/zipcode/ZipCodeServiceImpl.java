package com.fly.services.zipcode;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="ZipCodeService")
public class ZipCodeServiceImpl implements ZipCodeService {
		
	private Map<String, String> zipCodes = null;
	
	public ZipCodeServiceImpl() {
		
		zipCodes = new HashMap<String, String>();
		
		//Park Ridge, IL
		zipCodes.put("60068", "IL");
		
		//Honolulu, HI
		zipCodes.put("96801", "HI");
		
		//New York, NY
		zipCodes.put("10001", "NY");
		
		//Bethel, AK
		zipCodes.put("99559", "AK");
		
	}
	
	public String getState(@WebParam(name="zipCode") String zipCode) {
		
		System.out.println("ZipCode: " + zipCode);
		
		String state = "TX";
		
		if ( zipCode != null && zipCodes.containsKey(zipCode)) {
			
			state = zipCodes.get(zipCode);
			
		}
		
		return state;
		
	}
	
	
}
