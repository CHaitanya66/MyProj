package com.weather.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface Weatherservice {

	
	@WebMethod
	public Double weatherreport(int code) ;
		
	
}
