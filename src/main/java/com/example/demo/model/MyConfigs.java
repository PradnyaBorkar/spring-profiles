package com.example.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:roots.properties")
public class MyConfigs {

    @Value("${application.service.root1}")
    private  String root1;

    @Value("${application.service.root2}")
    private  String root2;

    public void printConfigs(){
        System.out.println("root1 "+ this.root1 +" root2 "+ this.root2);
    }
}
