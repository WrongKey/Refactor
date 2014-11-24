package com.wrongkey.firstcase;

/**
 * @author wrongkey
 * @version v1.0
 * @description Movie
 * @date 2014/11/17
 */
public class Movie {
    //price code
    public static final int CHILDRENS = 2;//儿童片
    public static final int REGULAR = 0;//普通片
    public static final int NEW_RELEASE = 1;//新片

    private String title;//片名
    private int priceCode;//价格码
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    /**
     * getTitle
     *
     * @return java.lang.String
     * @date 2014/11/17
     */
    public String getTitle() {
        return title;
    }

    /**
     * getPriceCode
     *
     * @return int
     * @date 2014/11/17
     */
    public int getPriceCode() {
        return price.getPriceCode();
    }

    /**
     * setPriceCode
     *
     * @param [priceCode]
     * @date 2014/11/17
     */
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case Movie.REGULAR:
                price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case Movie.CHILDRENS:
                price = new ChildrensPrice();
                break;
        }
        this.priceCode = priceCode;
    }

    /**
     * @param [daysRented]
     * @return int
     * @author wrongkey
     * @description getFrequentRenterPoints
     * @date 2014/11/24
     */
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    /**
     * @param [daysRented]
     * @return double
     * @author wrongkey
     * @description
     * @date 2014/11/24
     */
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
}
