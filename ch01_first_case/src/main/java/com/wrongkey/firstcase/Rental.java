package com.wrongkey.firstcase;

/**
 * @author wrongkey
 * @version v1.0
 * @description Rental
 * @date 2014/11/17
 */
public class Rental {
    private Movie movie;//影片
    private int daysRented;//租期

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * getMovie
     *
     * @return com.wrongkey.firstcase.Movie
     * @date 2014/11/17
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * getDaysRented
     *
     * @return int
     * @date 2014/11/17
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * @param []
     * @return int
     * @author wrongkey
     * @description 获取积分点数
     * @date 2014/11/24
     */
    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }

    /**
     * @param []
     * @return double
     * @author wrongkey
     * @description 获取花费
     * @date 2014/11/24
     */
    public double getCharge() {
        return getMovie().getCharge(getDaysRented());
    }
}
