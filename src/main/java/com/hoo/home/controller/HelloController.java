package com.hoo.home.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hello")  //루트 URL
public class HelloController {



    @GetMapping("")
    public String hello(){
        return "hello world!!!";
    }


}
