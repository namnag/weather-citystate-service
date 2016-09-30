package com.nnk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Place {
	
	@JsonProperty("place name")
	private String placeName;
	
	@JsonProperty("post code")
	private String postCode;
	
	private String latitude;
	
	private String longitude;
	
	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	
	/*@Override
	public String toString() {
		return " { placeName=" + placeName + ", longitude=" + longitude + ", postCode=" + postCode + ", latitude="
				+ latitude +"}";
		
		
	}   */ 	
    	

}
