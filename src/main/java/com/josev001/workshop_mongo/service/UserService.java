package com.josev001.workshop_mongo.service;

import com.josev001.workshop_mongo.domain.User;
import com.josev001.workshop_mongo.repository.UserRepository;
import com.josev001.workshop_mongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        return repo.findById(id)
                .orElseThrow(() ->
                        new ObjectNotFoundException("Objeto não encontrado")
                );
    }

}
