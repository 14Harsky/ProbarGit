package com.example.MiPrimeraWeb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyHomeController {

    @GetMapping("/")
    public String index() {
        return new String("Esta es mi primera Web");
    }

    @GetMapping("/api")
    public String otro() {
        return new String("Esta es otra Web");
    }

    @GetMapping("/api/valor")
    public String valor(@RequestParam int num1) {
        return "El valor ingresado es " + num1;
    }

    @GetMapping("/api/v2")
    public String otrov2() {
        return new String("Esta es otra Web v2");
    }

    @GetMapping("/api/v3")
    public String otrov3() {
        return new String("Esta es otra Web v3");
    }
}
