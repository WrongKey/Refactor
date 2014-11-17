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
        double totalAmount = 0; //总价格
        int frequentRenterPoints = 0;//积分
        String result = getName() + "的租借详单：\n";

        Iterator<Rental> rentals_iter = rentals.iterator();

        while (rentals_iter.hasNext()) {
            double thisAmount = 0;  //此条租借记录的费用
            Rental rental = rentals_iter.next();

            switch (rental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    //普通片价格策略，两天以内（含两天）共2元，之后每天1.5元
                    thisAmount += 2;
                    if (rental.getDaysRented() > 2)
                        thisAmount += (rental.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    //新片价格策略，每天3元
                    thisAmount += rental.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    //儿童片价格策略，三天以内（含两天）共1.5元,之后每天1.5元
                    thisAmount += 1.5;
                    if (rental.getDaysRented() > 3)
                        thisAmount += (rental.getDaysRented() - 3) * 1.5;
                    break;
            }

            frequentRenterPoints++;//积分增加
            //影片为新片且租期大于1积分再加1
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    rental.getDaysRented() > 1)
                frequentRenterPoints++;

            result += "\t影片: 《" + rental.getMovie().getTitle() + "》\t租期: "
                    + rental.getDaysRented() + "天\t花费： $"+thisAmount
                    +"\t获得积分: "+(((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    rental.getDaysRented() > 1)?2:1)+"\n";

            totalAmount += thisAmount;
        }

        result += "\n总共花费: $" + totalAmount +"\n总共获取积分： "+frequentRenterPoints;
        return result;
    }
}
