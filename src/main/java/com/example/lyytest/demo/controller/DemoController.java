package com.example.lyytest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    @GetMapping
    public String test(){
        return "大法师大法师大大打啊三大12啊实打实的666";
    }
}
