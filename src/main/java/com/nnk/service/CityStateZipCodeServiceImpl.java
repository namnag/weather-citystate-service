package com.nnk.service;

import org.springframework.web.client.RestTemplate;

import com.nnk.model.PlaceDetails;

public class CityStateZipCodeServiceImpl implements  CityStateZipCodeService {

	public PlaceDetails getZipCodeFromCityState(String city, String state){
		RestTemplate restTemplate = new RestTemplate();
	    final String uri = "http://api.zippopotam.us/us/"+state+"/"+city;
	    PlaceDetails placeDetailResponse = restTemplate.getForObject(uri, PlaceDetails.class);
        return placeDetailResponse;
		
	}
}
