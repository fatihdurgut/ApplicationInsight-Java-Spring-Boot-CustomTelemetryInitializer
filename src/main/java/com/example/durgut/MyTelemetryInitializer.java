package com.example.durgut;

import com.microsoft.applicationinsights.extensibility.TelemetryInitializer;
import com.microsoft.applicationinsights.telemetry.Telemetry;

import org.springframework.stereotype.Component;


public class MyTelemetryInitializer implements TelemetryInitializer {
    

    @Override
    public void initialize(Telemetry telemetry){               
        
        telemetry.getProperties().put("test", "test");      
        System.out.println("initialize worked, finally");
    }

}
