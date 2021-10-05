package com.entity;

import com.interfaces.Calculation;

/**
 *
 * @author Caterina Cunsolo
 */
public class Multiplication extends Operation implements Calculation {

    public Multiplication() {
        super();
    }

    @Override
    public void showResult() {
        super.showResult();
        System.out.printf("%-15s%-20s%-20s%-10s%n", "MULTIPLICATION", number1, number2, calculation());
    }

    @Override
    public Double calculation() {
        return number1 * number2;
    }

}
