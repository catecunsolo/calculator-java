package com.entity;

import com.interfaces.Calculation;

/**
 *
 * @author Caterina Cunsolo
 */
public class Subtraction extends Operation implements Calculation {

    public Subtraction() {
        super();
    }

    @Override
    public Double calculation() {
        return number1 - number2;
    }

    @Override
    public void showResult() {
        super.showResult();
        System.out.printf("%-15s%-20s%-20s%-10s%n", "SUBTRACTION", number1, number2, calculation());
    }

}
