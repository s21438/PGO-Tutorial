package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {

    private int x;
    private int y;
    private int z;
    private int a;
    private double e;
    private double f;
    private BigDecimal g;
    private BigDecimal h;
    public ArrayList<Integer> intArray = new ArrayList<Integer>();

    public int multiply (int x, int y){
        this.x = x;
        this.y = y;
        return x * y;
    }
    public int multiply (int x, int y, int z, int a){
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;

        int e = x*y;
        int f = z*a;

        int multiply = multiply(e, f);
        return multiply;
    }
    public double multiply (double e, double f){
        return e * f;
    }

    public BigDecimal multiply (BigDecimal g, BigDecimal h) {
        this.g = g;
        this.h = h;
        return g.multiply(h);
    }

    public int multiply(ArrayList<Integer>arrayListA){
        int product = 1;
        for (int i = 0; i < arrayListA.size(); i++){
            product *= arrayListA.get(i);
        }
        return product;
    }

}
