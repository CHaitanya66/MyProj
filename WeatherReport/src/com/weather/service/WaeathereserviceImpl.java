package com.weather.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.weather.service.Weatherservice")
public class WaeathereserviceImpl implements Weatherservice{
	@Override
	public Double weatherreport(int code) {
		
		if(code==500) {
			return 15.5;
			
		}
		else if(code==501){
			return 45.5;
		}
		return null;
	}

	
	
}