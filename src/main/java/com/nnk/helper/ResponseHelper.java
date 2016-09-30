package com.nnk.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.nnk.model.PlaceDetails;
import com.nnk.model.WeatherByCityStateResponse;
import com.nnk.service.CityStateZipCodeService;
import com.nnk.weatherbyzip.GetWeatherResponse;
import com.nnk.ws.WeatherByZipClient;

@Component
public class ResponseHelper {

	@Autowired
	WeatherByZipClient weatherByZipClient;
	
	@Autowired
	CityStateZipCodeService cityStateZipCodeService;
	
	public WeatherByCityStateResponse restResponseMapper (String city, String state){
		WeatherByCityStateResponse getWeatherResponse = new WeatherByCityStateResponse();
		
		PlaceDetails placeDetailResponse  = cityStateZipCodeService.getZipCodeFromCityState(city, state);
		System.out.println(placeDetailResponse.toString());
		
		String zipCode = placeDetailResponse.getPlaces().get(0).getPostCode();;
		
		if(!StringUtils.isEmpty(zipCode))
		{
			GetWeatherResponse weatherByZipResponse = weatherByZipClient.getCityWeatherByZip(zipCode);
			if(null != weatherByZipResponse ){
				
				getWeatherResponse.setCity(weatherByZipResponse.getCity());
				getWeatherResponse.setHumidity(weatherByZipResponse.getHumidity());
				getWeatherResponse.setPressure(weatherByZipResponse.getPressure());
				getWeatherResponse.setState(weatherByZipResponse.getState());
				getWeatherResponse.setTemperature(weatherByZipResponse.getTemperature());
				getWeatherResponse.setResponseText(weatherByZipResponse.getResponsetext());
			}
		}

		return getWeatherResponse;
		
	}
}
