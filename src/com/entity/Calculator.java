
package com.entity;
/**
 *
 * @author Caterina Cunsolo
 */
public class Calculator {
  private Sum sum;
  private Subtraction subtraction;
  private Division division;
  private Multiplication multiplication;

    public Calculator(Sum sum, Subtraction subtraction, Division division, Multiplication multiplication) {
        this.sum = sum;
        this.subtraction = subtraction;
        this.division = division;
        this.multiplication = multiplication;
    }

    public Calculator() {
    }

    public Sum getSum() {
        return sum;
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public Subtraction getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(Subtraction subtraction) {
        this.subtraction = subtraction;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Multiplication getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(Multiplication multiplication) {
        this.multiplication = multiplication;
    }
  

    
}
