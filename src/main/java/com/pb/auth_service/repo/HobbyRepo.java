package com.pb.auth_service.repo;

import com.pb.auth_service.auth_model.Hobby;
import org.springframework.data.repository.CrudRepository;

public interface HobbyRepo extends CrudRepository<Hobby,Long> {
}
