package com.josev001.workshop_mongo.repository;

import com.josev001.workshop_mongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
PostRepository extends MongoRepository<Post, String> {
}
