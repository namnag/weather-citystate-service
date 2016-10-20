package com.nnk.ws;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.nnk.service.LoggingService;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.nnk.service.*")
public class AspectConfig {

	public LoggingService logger(){
		return new LoggingService();
	}
}
