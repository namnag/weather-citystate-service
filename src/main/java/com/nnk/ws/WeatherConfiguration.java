
package com.nnk.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WeatherConfiguration {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.weather.jaxb");
		return marshaller;
	}

	@Bean
	public WeatherByZipClient weatherClient(Jaxb2Marshaller marshaller) {
		WeatherByZipClient client = new WeatherByZipClient();
		client.setDefaultUri("http://spring.io/guides/gs-producing-web-service");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
