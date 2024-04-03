package com.example.searchsuggestionservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SearchSuggestionService {


    @GetMapping()
    public String hello(){
        return "hi from search suggestion service controller !";
    }




}
