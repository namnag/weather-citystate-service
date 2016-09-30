package com.nnk.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.nnk.service.CityStateZipCodeService;
import com.nnk.service.CityStateZipCodeServiceImpl;

@SpringBootApplication
@ComponentScan({ "com.nnk.*" })
public class WeatherCityStateApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherCityStateApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	 @Bean
	    public CityStateZipCodeService cityStateZipCodeService() {
	        return new CityStateZipCodeServiceImpl();
	    }
}
