package com.brianeno.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tech.ailef.snapadmin.external.SnapAdminAutoConfiguration;

@EnableCaching
@SpringBootApplication
@ImportAutoConfiguration(SnapAdminAutoConfiguration.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
