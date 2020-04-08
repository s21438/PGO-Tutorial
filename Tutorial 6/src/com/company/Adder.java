
package com.company;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Adder {
    private int x;
    private int y;

    public int add(int x, int y) {
        this.x = x;
        this.y = y;
        return x+y;
    }

    public static BigDecimal add (ArrayList<BigDecimal> arrayListB) {
        BigDecimal product = BigDecimal.valueOf(0.00);
        for(int i = 0; i < arrayListB.size(); i++){
            product = product.add(arrayListB.get(i));
        }
        return product;
    }
}