package com.eric.rizz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String sayHello() {
        return "Hello from first controller";
    }
}
