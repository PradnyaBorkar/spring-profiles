package com.example.demo.hello;

import com.example.demo.model.MyConfigs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApp {

    @Autowired
    private Environment env;

    @Autowired
    private MyConfigs myConfigs;

    @Autowired
    private ConfigProperties configProperties;

    @Value("${application.name}")
    private String appName;

    @GetMapping("/appName")
    public String getAppName(){
        return appName;
    }

    @GetMapping("/envdetails")
    public String[] envDetails(){
        myConfigs.printConfigs();
        configProperties.printProperties();
        return env.getActiveProfiles();
    }

}
