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

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     *getTitle
     *@return java.lang.String
     *@date 2014/11/17
     */
    public String getTitle() {
        return title;
    }

    /**
     * setTitle
     *
     * @param [title]
     * @date 2014/11/17
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     *getPriceCode
     *@return int
     *@date 2014/11/17
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * setPriceCode
     *
     * @param [priceCode]
     * @date 2014/11/17
     */
    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
