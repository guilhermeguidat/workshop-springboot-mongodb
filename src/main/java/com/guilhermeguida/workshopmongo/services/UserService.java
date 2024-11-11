package com.guilhermeguida.workshopmongo.services;

import com.guilhermeguida.workshopmongo.domain.User;
import com.guilhermeguida.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //Injeção de dependencia automatica
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
