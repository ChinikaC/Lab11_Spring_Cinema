package com.bnta.movies_spring_api.models;

import jakarta.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue()
    private long id;
    @Column
    private String title;
    @Column
    private String rating;
    @Column
    private long duration;

    public Movie(long id, String title, String rating, long duration) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }

    public Movie() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }


    }

