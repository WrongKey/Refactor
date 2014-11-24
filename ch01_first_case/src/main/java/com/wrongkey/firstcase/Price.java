package com.wrongkey.firstcase;

/**
 * @author wrongkey
 * @version v1.0
 * @description
 * @date 2014/11/24
 */
public abstract class Price {
    /**
     * @param []
     * @return int
     * @author wrongkey
     * @description
     * @date 2014/11/24
     */
    public abstract int getPriceCode();

    /**
     * @param [daysRented]
     * @return double
     * @author wrongkey
     * @description
     * @date 2014/11/24
     */
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
