package com.wrongkey.firstcase;

/**
 *@author wrongkey
 *@description Rental
 *@date 2014/11/17
 *@version v1.0
 *
 */
public class Rental {
    private Movie movie;//影片
    private int daysRented;//租期

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     *getMovie
     *@return com.wrongkey.firstcase.Movie
     *@date 2014/11/17
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     *getDaysRented
     *@return int
     *@date 2014/11/17
     */
    public int getDaysRented() {
        return daysRented;
    }
}
