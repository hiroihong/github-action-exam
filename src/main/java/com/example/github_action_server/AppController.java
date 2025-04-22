package com.example.github_action_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "진짜 편하긴 해";
    }
}
