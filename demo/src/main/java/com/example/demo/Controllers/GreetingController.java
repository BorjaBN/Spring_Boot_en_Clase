package com.example.demo.Controllers;

import com.example.demo.Models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    // Llamamos a la clase Greeting
    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World") String name
    ){
        // Retornamos la clase con el Contador, y con el nombre, que por defecto será World
        return new Greeting(counter.incrementAndGet(), template.formatted(name));
    }

}
