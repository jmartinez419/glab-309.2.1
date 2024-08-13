package com.perscholas.FirstProject.ExampleOne.rest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller  {
    @GetMapping("/")
    private String home (){
        return "hello";
    }
}
