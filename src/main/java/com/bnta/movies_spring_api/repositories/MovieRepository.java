package com.bnta.movies_spring_api.repositories;

import com.bnta.movies_spring_api.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
