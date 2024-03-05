package com.pb.auth_service.repo;

import com.pb.auth_service.auth_model.LoginUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserLoginRepo extends CrudRepository<LoginUser,Long> {

    List<LoginUser> findByEmail(String email);
}
