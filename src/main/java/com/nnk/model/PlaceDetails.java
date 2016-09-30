package com.nnk.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaceDetails {

	@JsonProperty("country abbreviation")
	private String countryCode;
	
	private String country;
	
	@JsonProperty("place name")
	private String placeName;
	
	private String state;
	
	@JsonProperty("state abbreviation")
	private String stateCode;
	
	@JsonProperty("places")
	private List<Place> places;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	/*@Override
	public String toString() {
		return " {countryCode=" + countryCode + ", country=" + country + ", placeName=" + placeName
				+ ", state=" + state + ", stateCode=" + stateCode + ", places=" + places + "}";
	}*/
	

	
}
