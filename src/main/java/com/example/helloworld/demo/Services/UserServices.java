// package
package com.example.helloworld.demo.Services;

// annotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// entity
import com.example.helloworld.demo.Entity.Users;
import com.example.helloworld.demo.Repository.UserRepo;
import java.util.Optional;
import org.bson.types.ObjectId;

// data structures
import java.util.List;

@Component
public class UserServices {

    @Autowired
    private UserRepo users;

    public void newUser(Users user) {
        users.save(user);
    }

    public List<Users> get() {
        return users.findAll();
    }

    public Optional<Users> getUserById(ObjectId id) {
        return users.findById(id);
    }

    public void deleteById(ObjectId id) {
        users.deleteById(id);
    }
}
