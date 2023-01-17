package com.mulatodev.greeting2.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ganaranjo
 */
@RestController
public class GreetingController {
    private static final String TEMPLATE = "Bienvenido, %1!, %2";

    @GetMapping("/")
    public String greeting(@RequestParam(value = "name", defaultValue = "mulato") String name){

        Date fecha = new Date();
        return String.format(TEMPLATE, name, "Son las " + fecha.toString());
    }
}
