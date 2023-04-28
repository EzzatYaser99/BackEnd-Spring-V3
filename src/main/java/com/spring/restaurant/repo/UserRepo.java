package com.spring.restaurant.repo;

import com.spring.restaurant.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findByUserNameAndPassword(String userName, Long password);
}
