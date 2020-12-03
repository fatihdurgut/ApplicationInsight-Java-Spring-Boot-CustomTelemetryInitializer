package com.example.durgut;

import com.microsoft.applicationinsights.extensibility.TelemetryInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DurgutApplication {

	public static void main(String[] args) {
		SpringApplication.run(DurgutApplication.class, args);
	}

	@Bean
    public TelemetryInitializer myTelemetryInitializer() {
        return new MyTelemetryInitializer();
    }

}
