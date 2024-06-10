package com.example.helloworld.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.helloworld.demo.Entity.Users;
import java.util.HashMap;
import java.util.ArrayList;


@RestController
@RequestMapping("/Users")
public class UsersContoller {
    private HashMap<String, Users> db = new HashMap<>();

    @GetMapping("/getUsers")
    public ArrayList<Users> getAll() {
        return new ArrayList<>(db.values());
    }

    @PostMapping("/create")
    public Users createUser(@RequestBody Users newUser) {
        db.put(newUser.getId(), newUser);
        return newUser;
    }

    @GetMapping("/getUserById/{id}")
    public Users getUserById(@PathVariable String id) {
        return db.get(id);
    }

    @DeleteMapping("/deleteId/{id}")
    public Users delete(@PathVariable String id) {
        return db.remove(id);
    }
}
