package com.nnk.service;

import com.nnk.model.PlaceDetails;

public interface CityStateZipCodeService {
	
	public PlaceDetails getZipCodeFromCityState(String city, String state);

}
