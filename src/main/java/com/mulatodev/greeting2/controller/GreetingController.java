package com.mulatodev.greeting2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ganaranjo
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Hola, %s!";

    @GetMapping("/")
    public String greeting(@RequestParam(value = "name", defaultValue = "mulato") String name){

        return String.format(TEMPLATE, name);
    }
}
