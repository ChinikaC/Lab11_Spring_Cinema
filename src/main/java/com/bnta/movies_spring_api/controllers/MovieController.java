package com.bnta.movies_spring_api.controllers;

import com.bnta.movies_spring_api.models.Movie;
import com.bnta.movies_spring_api.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

@Autowired
    private MovieService movieService;

@GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
    List<Movie> movies = movieService.getAllMovies();
    return new ResponseEntity<>(movies, HttpStatus.OK);
}

@GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable long id){
    Movie movie = movieService.getMovieById(id);
    return new ResponseEntity<>(movie, HttpStatus.OK);
}

@PostMapping
     public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
    Movie newMovie = movieService.createMovie(movie);
    return new ResponseEntity<>(newMovie, HttpStatus.CREATED); }

    @PatchMapping
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
    Movie updatedMovie = movieService.updateMovie(movie);
    return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
    }

}
