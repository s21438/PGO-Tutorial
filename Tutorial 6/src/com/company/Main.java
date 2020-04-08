package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Multiplier fourImputs = new Multiplier();
        Multiplier productByList = new Multiplier();
        Multiplier bidDMultiplier = new Multiplier();
        Adder bigD = new Adder();



        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
        arrayListA.add(5);
        arrayListA.add(4);
        arrayListA.add(3);
        arrayListA.add(2);

        ArrayList<BigDecimal> arrayListB = new ArrayList<BigDecimal>();
        arrayListB.add(BigDecimal.valueOf(21.378));
        arrayListB.add(BigDecimal.valueOf(3.25));
        arrayListB.add(BigDecimal.valueOf(3.024));
        arrayListB.add(BigDecimal.valueOf(5.320));


        System.out.println(fourImputs.multiply(5,10,15,7));
        System.out.println(productByList.multiply(arrayListA));
        System.out.println(bidDMultiplier.multiply(7.908, 6785));
        System.out.println(bigD.add(arrayListB));

    }
}