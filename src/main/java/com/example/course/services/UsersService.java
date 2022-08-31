package com.example.course.services;

import com.example.course.entities.Users;
import com.example.course.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public List<Users> findAll() {
        return repository.findAll();
    }

    public Users findById(Long id){
        Optional<Users> obj = repository.findById(id);
        return obj.get();
    }
}