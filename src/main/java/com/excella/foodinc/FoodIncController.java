package com.excella.foodinc;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FoodIncController {

    @RequestMapping("/demo")
    public String index() {
        return "Hello World";
    }
}
