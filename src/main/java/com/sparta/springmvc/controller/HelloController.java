package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller  //이 클래스는 컨트롤러의 역할의 수행할 거라는 의미
@RequestMapping("/api") //api로 넘어오는 요청은 하단 클래스가 돌아감(중복되는 경로를 쉽게 처리함)
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!!!"; //Hello World.html을 찾는다 but 순수하게 문자를 반환할 때는 @ResponseBody를 달아준다
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return  "Post Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public  String put(){
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "Delete Method 요청";
    }
}
