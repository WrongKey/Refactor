package com.wrongkey.firstcase;

/**
 * @author wrongkey
 * @version v1.0
 * @description
 * @date 2014/11/24
 */
public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    /**
     * @param daysRented
     * @return double
     * @author wrongkey
     * @description
     * @date 2014/11/24
     */
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
