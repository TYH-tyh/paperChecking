package com.paperchecking.paperchecking.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paperchecking.paperchecking.domain.User;

import java.util.ArrayList;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
    ArrayList<User> findById(int id);



}