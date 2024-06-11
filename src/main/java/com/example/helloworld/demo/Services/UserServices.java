// package
package com.example.helloworld.demo.Services;

// annotations
import org.springframework.beans.factory.annotation.Autowired;

import com.example.helloworld.demo.Entity.Users;
import com.example.helloworld.demo.Repository.UserRepo;

public class UserServices {

    @Autowired
    private UserRepo users;

    public void newUser(Users user) {
        users.save(user);
    }
}
