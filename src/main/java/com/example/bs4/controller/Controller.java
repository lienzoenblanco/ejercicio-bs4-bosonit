package com.example.bs4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${VAR1}")
    private String var1;

    @Value("${My.VAR2}")
    private int myVar2;

    @Value("${VAR3:var3 no tiene valor}")
    private String var3;

    @GetMapping("/valores/")
    public String getProperties() {
        return "valor de var1 es: "+this.var1+ "valor de my.var2 es: "+this.myVar2;
    }

    @GetMapping("/var3/")
    public String getVar3() {
        return "valor de var3 es: " +this.var3;
    }
}
