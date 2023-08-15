package com.app;

import org.modelmapper.ModelMapper;

import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//it has configuration annotation therefore @bean annotation is applied

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Day15LabApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day15LabApplication.class, args);
	}

	// Configure ModelMapper bean in Spring boot application class(since this class
	// is
	// implicitly annotated with @Configuration)
	// Meaning -You can add @Bean methods ONLY in such config classes
	@Bean//only in those classes which has configuration classes
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		//Strict mode => While mapping , src prop names n data types MUST with dest type
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper;
	}

}
