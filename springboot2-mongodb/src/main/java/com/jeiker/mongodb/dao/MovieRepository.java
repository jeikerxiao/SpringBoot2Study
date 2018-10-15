package com.jeiker.mongodb.dao;

import com.jeiker.mongodb.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {

    List<Movie> findAll();
}