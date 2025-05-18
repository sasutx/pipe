package com.sasu.pipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
public class controller {
    @GetMapping("/api")
    public String welcome(){
        return "welcome tu my api";
    }
}
