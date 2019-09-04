package com.adevguide.java.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class MovieDataBaseDeep implements Cloneable {

    private String movieName;
    private String releaseDate;
    private List<String> genre;
    private List<String> ratings;

    public MovieDataBaseDeep() {
        System.out.println("Defaut Constructor");
    }

    public MovieDataBaseDeep(String movieName, String releaseDate, List<String> genre, List<String> ratings) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.ratings = ratings;
    }

    public void getData() {
        System.out.println("Getting Data from External REST API");
        this.movieName = "The Dark Knight";
        this.releaseDate = "2018";
        this.genre = new ArrayList<String>();
        this.genre.add("Drama");
        this.genre.add("Thriller");
        this.ratings = new ArrayList<String>();
        this.ratings.add("IMDB:9");
        this.ratings.add("RottenTomatoes:94%");
        this.ratings.add("MetaCritic:84%");
        System.out.println("You have been charged 1$ for last API call.");
    }

    @Override
    public String toString() {
        return String.format("MovieDataBaseDeep [movieName=%s, releaseDate=%s,\n genre=%s, ratings=%s]", movieName,
                releaseDate, genre, ratings);
    }

    @Override
    protected MovieDataBaseDeep clone() throws CloneNotSupportedException {
        List<String> deepRatings = new ArrayList<String>();
        deepRatings.addAll(this.ratings);   //deep cloning of ratings as it is mutable
        //shallow cloning of genre

        return new MovieDataBaseDeep(this.movieName, this.releaseDate, this.genre, deepRatings);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getRatings() {
        return ratings;
    }

    public void setRatings(List<String> ratings) {
        this.ratings = ratings;
    }

}
