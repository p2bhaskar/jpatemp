package com.pb.auth_service.service;


import com.pb.auth_service.auth_model.Hobby;
import com.pb.auth_service.auth_model.LoginUser;
import com.pb.auth_service.repo.HobbyRepo;
import com.pb.auth_service.repo.UserLoginRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private UserLoginRepo userLoginRepo;



    @Autowired
    private HobbyRepo authorityRepo;

    public String saveLoginCredential(LoginUser user){
        for (Hobby hobby : user.getHobbies()) {
            hobby.setLoginUser(user);
            authorityRepo.save(hobby);
        }


        userLoginRepo.save(user);
        return "Registration successful!!";
    }


    public  List<LoginUser> getUser(String email){

        List<LoginUser> userList = userLoginRepo.findByEmail(email);
       for(LoginUser user:userList){
           System.out.println(user);
       }
        return userList;
    }

}
