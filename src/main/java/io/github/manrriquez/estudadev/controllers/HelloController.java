package io.github.manrriquez.estudadev.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello ontroller";
    }
}
