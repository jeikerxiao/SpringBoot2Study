package com.jeiker.mongodb.controller;

import com.jeiker.mongodb.dao.MovieRepository;
import com.jeiker.mongodb.model.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movie")
@Slf4j
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/test")
    public Map<String, String> test() {
        return Collections.singletonMap("message", "Hello World");
    }

    @GetMapping("/list")
    public List<Movie> list() {
        return movieRepository.findAll();
    }
}
