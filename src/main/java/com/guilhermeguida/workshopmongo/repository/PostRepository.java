package com.guilhermeguida.workshopmongo.repository;

import com.guilhermeguida.workshopmongo.domain.Post;
import com.guilhermeguida.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
