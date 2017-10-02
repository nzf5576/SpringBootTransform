package com.app.startup;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Start {


    @PostConstruct
    public void init(){
        System.out.println("-------------------> ooooooooooooooooo");
    }
}