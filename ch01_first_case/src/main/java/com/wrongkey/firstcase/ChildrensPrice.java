package com.wrongkey.firstcase;

/**
 * @author wrongkey
 * @version v1.0
 * @description
 * @date 2014/11/24
 */
public class ChildrensPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
