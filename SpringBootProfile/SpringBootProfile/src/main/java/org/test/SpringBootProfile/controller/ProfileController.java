package org.test.SpringBootProfile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfileController {
    @Value(value="${spring.profile.message}")
    private String message;

    @GetMapping(value="/profile")
    public String printMessage(){
         return message;
     }

}
