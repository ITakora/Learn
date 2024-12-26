package com.example.test.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFunController {

    @GetMapping("/")
    public String hello() {
        return " World";
    }


    @GetMapping("/peq")
    public String workout() {
        return "workout";
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "fortune";
    }


}
