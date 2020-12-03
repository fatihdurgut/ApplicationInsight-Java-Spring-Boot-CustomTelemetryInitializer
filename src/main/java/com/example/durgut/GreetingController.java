package com.example.durgut;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.microsoft.applicationinsights.TelemetryClient;



@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
    private TelemetryClient telemetryClient;
    

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {     

        telemetryClient.trackEvent("my event3");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
