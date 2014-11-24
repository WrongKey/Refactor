package com.wrongkey.firstcase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wrongkey
 * @version v1.0
 * @description Customer
 * @date 2014/11/17
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    /**
     * getName
     *
     * @return java.lang.String
     * @date 2014/11/17
     */
    public String getName() {
        return name;
    }

    /**
     * @param [rental]
     * @return void
     * @author wrongkey
     * @description 添加一条租借记录
     * @date 2014/11/17
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * @param []
     * @return java.lang.String
     * @author wrongkey
     * @description 生成详单
     * @date 2014/11/17
     */
    public String statement() {
        String result = getName() + "的租借详单：\n";

        Iterator<Rental> rentals_iter = rentals.iterator();

        while (rentals_iter.hasNext()) {
            Rental rental = rentals_iter.next();
            result += "\t影片: 《" + rental.getMovie().getTitle() + "》\t租期: "
                    + rental.getDaysRented() + "天\t花费： $" + rental.getCharge()
                    + "\t获得积分: " + rental.getFrequentRenterPoints() + "\n";
        }

        result += "\n总共花费: $" + getTotalCharge() + "\n总共获取积分： " + getTotalFrequentrenterPoints();
        return result;
    }

    /**
     * @param []
     * @return int
     * @author wrongkey
     * @description get Total FrequentrenterPoints
     * @date 2014/11/24
     */
    private int getTotalFrequentrenterPoints() {
        int result = 0;

        Iterator<Rental> rentals_iter = rentals.iterator();
        while (rentals_iter.hasNext()) {
            Rental rental = rentals_iter.next();
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    /**
     * @param []
     * @return double
     * @author wrongkey
     * @description get Total Charge
     * @date 2014/11/24
     */
    private double getTotalCharge() {
        double result = 0; //总价格
        Iterator<Rental> rentals_iter = rentals.iterator();

        while (rentals_iter.hasNext()) {
            Rental rental = rentals_iter.next();
            result += rental.getCharge();
        }
        return result;
    }

}
