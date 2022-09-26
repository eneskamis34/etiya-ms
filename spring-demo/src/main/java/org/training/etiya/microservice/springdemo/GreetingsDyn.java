package org.training.etiya.microservice.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class GreetingsDyn {

    private String prefix;

    public GreetingsDyn(String prefix) {
        this.prefix = prefix;
    }
    public String hello(String name) {
        return "hello " + prefix ;
    }

    public String goodBye(String name) {
        return "GoodBye " + name;
    }
}
