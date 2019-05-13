package com.cognizant.usergmdbservice.controller;

import com.cognizant.usergmdbservice.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping(value = "/")
    public String getHome(){
        return "congra";
    }

    @PostMapping(value = "/createuser")
    public String createUser(@RequestBody User user){
        System.out.println(user);
        return "thank you!";
    }
}
