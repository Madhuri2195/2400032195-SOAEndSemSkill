package com.example.mockmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MS1Controller {

    @GetMapping("/ms1/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS1.1 - Addition = " + (a + b);
    }
}
