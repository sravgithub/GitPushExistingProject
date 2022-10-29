package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
@RestController
public class GreetingController {

    private static final String template = "Hello, %s! ";
    private AtomicInteger id = new AtomicInteger();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = ("World")) String name) {
        return new Greeting(id.incrementAndGet(), String.format(template, name));
    }
}
