package com.spring.restaurant.controller;

import com.spring.restaurant.repo.UserRepo;
import com.spring.restaurant.model.LoginResponse;
import com.spring.restaurant.model.LogingRequest;
import com.spring.restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rest")
@CrossOrigin
public class UserLoginController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/login")
    public LoginResponse logMe(@RequestBody LogingRequest logingRequest) {

        List<User> users = this.userRepo.findByUserNameAndPassword(logingRequest.getUserName(), logingRequest.getPassword());
        if (users != null && users.size() == 1) {
            return new LoginResponse(users.get(0).getFullName(), null);
        } else {
            return new LoginResponse(null, "Invalid User Name Or Password");
        }
    }

}
