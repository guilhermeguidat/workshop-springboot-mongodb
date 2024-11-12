package com.guilhermeguida.workshopmongo.services;

import com.guilhermeguida.workshopmongo.domain.Post;
import com.guilhermeguida.workshopmongo.repository.PostRepository;
import com.guilhermeguida.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    //Injeção de dependencia automatica
    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
    }
}