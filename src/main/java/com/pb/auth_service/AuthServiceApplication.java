package com.pb.auth_service;

import com.pb.auth_service.auth_model.LoginUser;
import com.pb.auth_service.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class AuthServiceApplication {



	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AuthServiceApplication.class, args);
		context.getBean(LoginService.class).getUser("rajesh@abc");


	}

}
