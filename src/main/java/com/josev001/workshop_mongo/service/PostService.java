package com.josev001.workshop_mongo.service;

import com.josev001.workshop_mongo.domain.Post;
import com.josev001.workshop_mongo.repository.PostRepository;
import com.josev001.workshop_mongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new ObjectNotFoundException("Objeto não encontrado")
                );
    }


    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
