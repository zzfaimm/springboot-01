package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("springboot in running....");
        System.out.println("springboot in running....1");
        System.out.println("springboot in running....1");
        System.out.println("springboot in running....2");
        System.out.println("springboot in running....2");
        System.out.println("springboot in running....hot-fix");
        System.out.println("springboot in running....master test");
        System.out.println("springboot in running....hot-fix-test");
        System.out.println("springboot in running....push-test");
        return "springboot in running....";
    }
}
