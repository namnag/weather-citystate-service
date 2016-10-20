
package com.nnk.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.weather.jaxb.GetWeatherRequest;
import com.weather.jaxb.GetWeatherResponse;

public class WeatherByZipClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(WeatherByZipClient.class);

    //@Cacheable(cacheNames = "weatherForZip", key="zipCode")
	public GetWeatherResponse getCityWeatherByZip(String zipCode) {

		GetWeatherRequest request = new GetWeatherRequest();
		request.setZipCode(zipCode);

		log.info("Requesting Weather for " + zipCode);

		GetWeatherResponse response = (GetWeatherResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						"http://weather-zipcode-service.cfapps.io/ws/",
						request,
						new SoapActionCallback("http://weather-zipcode-service.cfapps.io/ws/getWeatherRequest"));
		
		System.out.println("Temperature for"+ response.getCity() +" is "+ response.getTemperature());

		return response;
	}

}
