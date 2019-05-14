package com.cognizant.usergmdbservice.controller;

import com.cognizant.usergmdbservice.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {


    @PostMapping(value = "/createuser")
    public ResponseEntity<User> createUser(@RequestBody User user){

        System.out.println(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
