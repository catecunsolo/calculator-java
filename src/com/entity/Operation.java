package com.entity;

/**
 *
 * @author Caterina Cunsolo
 */
public abstract class Operation {

    protected Double number1;
    protected Double number2;

    public Operation(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Operation() {
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public void showResult() {
        System.out.printf("%-15s%-20s%-20s%-10s%n", "OPERATION", "FIRST NUMBER", "SECOND NUMBER", "RESULT");
    }
}
