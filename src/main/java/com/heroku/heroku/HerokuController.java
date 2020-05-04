package com.heroku.heroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {

    @GetMapping("/teste")
    public String teste() {
        return "OPAAA";
    }
}
