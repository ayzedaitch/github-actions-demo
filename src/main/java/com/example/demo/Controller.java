package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private PersonRepo personRepo;

    @GetMapping
    public List<Person> getPersons(){
        return personRepo.findAll();
    }
    @PostMapping
    public Person postPerson(@RequestBody Person p){
        return personRepo.save(p);
    }
}
