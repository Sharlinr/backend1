package com.example.demo_backend1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

        @RequestMapping("/esp")
        public String indexSp() {
            return "Hola Mundo";
        }

    }

