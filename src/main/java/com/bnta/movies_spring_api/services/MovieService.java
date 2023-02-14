package com.bnta.movies_spring_api.services;

import com.bnta.movies_spring_api.models.Movie;
import com.bnta.movies_spring_api.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id){
        return movieRepository.findById(id).get();
    }

    public Movie createMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }

    public Movie updateMovie(Movie updatedMovie){
        return movieRepository.save(updatedMovie);
    }


}
