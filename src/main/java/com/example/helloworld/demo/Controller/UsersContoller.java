// package
package com.example.helloworld.demo.Controller;

// boot annotations
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

// entity
import com.example.helloworld.demo.Entity.Users;
import com.example.helloworld.demo.Services.UserServices;
import java.util.ArrayList;

// outer router "/Users"
@RestController
@RequestMapping("/Users")
public class UsersContoller {

    @Autowired
    private UserServices services;

    // get all users (method : get) (end-point : "/Users/getUsers")
    @GetMapping("/getUsers")
    public ArrayList<Users> getAll() {
        return null;
    }

    // create a user (method : post) (end-point : "/Users/create") (body : {"id" : "..", "userName" : "..", "password" : ".."})
    @PostMapping("/create")
    public Users createUser(@RequestBody Users newUser) {
        services.newUser(newUser);
        return newUser;
    }

    // get user by id (method : get) (end-point : "Users/getUserById/{id}")
    @GetMapping("/getUserById/{id}")
    public Users getUserById(@PathVariable String id) {
        return null;
    }

    // delete user by id (method : delete) (end-point : "Users/deleteId/{id}")
    @DeleteMapping("/deleteId/{id}")
    public Users delete(@PathVariable String id) {
        return null;
    }
}
