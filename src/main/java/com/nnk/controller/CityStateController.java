package com.nnk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnk.helper.ResponseHelper;
import com.nnk.model.WeatherByCityStateResponse;

@RestController
public class CityStateController {
	
	@Autowired
	private ResponseHelper responseHelper;
	
	@RequestMapping(
			  value = "/getWeatherForCityState", 
			  params = { "state", "city" },
			  method = RequestMethod.GET
			  )
	
	@ResponseBody
	public WeatherByCityStateResponse getWeatherForCityState(@RequestParam String state, @RequestParam String city){
		
		System.out.println("City , State "+ city +" ,"+state);
		
		return responseHelper.restResponseMapper(city, state);
		
	}
	
	@RequestMapping("/")
	public String testRun(){
		
		return "Hello: ";
		
	}

}
