/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.basic.helloworld.Repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raghu.v
 */
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String returnHelloworld(){
        return "HelloWorld";
    }
    @GetMapping("/hello/{name}")
    public String retunhelloWorldWithName(@PathVariable String name){
        return "Hi\t"+name+"\t Welcome To The SpringBoot Project's";
    }
}
