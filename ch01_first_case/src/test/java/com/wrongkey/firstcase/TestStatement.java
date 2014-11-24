package com.wrongkey.firstcase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *@author wrongkey
 *@description Test
 *@date 2014/11/24
 *@version v1.0
 *
 */
public class TestStatement {

    /**
     *@author wrongkey
     *@description
     *@param []
     *@return void
     *@date 2014/11/24
     */
    @Test
    public void testStatement(){
        Movie m1 = new Movie("Tom and Jerry",2);
        Movie m2 = new Movie("Frozen",1);
        Movie m3 = new Movie("Shaolin Temple",0);

        Customer wrongkey = new Customer("wrongkey");
        wrongkey.addRental(new Rental(m1,5));
        wrongkey.addRental(new Rental(m2,10));
        wrongkey.addRental(new Rental(m3,10));

        String statement = wrongkey.statement();
        String result = "wrongkey的租借详单：\n" +
                "\t影片: 《Tom and Jerry》\t租期: 5天\t花费： $4.5\t获得积分: 1\n" +
                "\t影片: 《Frozen》\t租期: 10天\t花费： $30.0\t获得积分: 2\n" +
                "\t影片: 《Shaolin Temple》\t租期: 10天\t花费： $14.0\t获得积分: 1\n" +
                "\n" + "总共花费: $48.5\n" + "总共获取积分： 4";
        assertEquals(result,statement);
    }

}
