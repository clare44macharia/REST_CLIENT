package com.example.netflix.Models;

import java.util.Set;

public class Movie {
    private String movieName;
    private String yearReleased;
    private Long id;

    private Users user;

    private Set<Category> categories ;

    public Movie(String movieName, String yearReleased, Long id, Users user, Set<Category> categories) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
        this.id = id;
        this.user = user;
        this.categories = categories;
    }

    public Movie(String movieName, String yearReleased, Users user, Set<Category> categories) {
        this.movieName = movieName;
        this.yearReleased = yearReleased;
        this.user = user;
        this.categories = categories;
    }


    public Movie(){}

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
