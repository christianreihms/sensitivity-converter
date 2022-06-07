package com.christianreihms.sensitivityconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.christianreihms.sensitivityconverter"})
public class SensitivityConverterApplication {
	public static void main(String[] args) {
		SpringApplication.run(SensitivityConverterApplication.class, args);
	}
}