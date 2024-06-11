// package
package com.example.helloworld.demo.Repository;

// mongo db repository
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

// entity
import com.example.helloworld.demo.Entity.Users;

// interface
public interface UserRepo extends MongoRepository<Users, ObjectId>{

}
