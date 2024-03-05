package com.pb.auth_service.controller;

import com.pb.auth_service.auth_model.LoginUser;
import com.pb.auth_service.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/register")
    public String saveUser(@RequestBody LoginUser user){
        return loginService.saveLoginCredential(user);
    }
}
