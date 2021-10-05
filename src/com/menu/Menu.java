package com.menu;

import com.entity.Calculator;
import com.entity.Division;
import com.entity.Multiplication;
import com.entity.Subtraction;
import com.entity.Sum;
import java.util.Scanner;

/**
 *
 * @author Caterina Cunsolo
 */
public class Menu {

    private Double number1;
    private Double number2;
    private Calculator calculator = new Calculator(new Sum(), new Subtraction(), new Division(), new Multiplication());
    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        Integer option;
        System.out.println("--WELCOME TO CASIO CALCULATOR--");
        do {
            System.out.println("SELECT THE N°OPERATION "
                    + "\n 1. SUM"
                    + "\n 2. SUBTRACTION"
                    + "\n 3. DIVISION"
                    + "\n 4. TURN OFF");
            option = read.nextInt();
            switch (option) {
                case 1:
                    enterNumbers();
                    calculator.getSum().setNumber1(number1);
                    calculator.getSum().setNumber2(number2);
                    calculator.getSum().showResult();
                    break;
                case 2:
                    enterNumbers();
                    calculator.getSubtraction().setNumber1(number1);
                    calculator.getSubtraction().setNumber2(number2);
                    calculator.getSubtraction().showResult();
                    break;
                case 3:
                    enterNumbers();
                    calculator.getMultiplication().setNumber1(number1);
                    calculator.getMultiplication().setNumber2(number2);
                    calculator.getMultiplication().showResult();
                    break;
                case 4:
                    //    do{
                    enterNumbers();
                    calculator.getDivision().setNumber1(number1);
                    calculator.getDivision().setNumber2(number2);
                    if (number2 == 0) {
                        System.out.println("You cannot divide by zero.");
                    }
                    //  }while(number2==0);
                    calculator.getDivision().showResult();
                    break;
                case 5:
                    System.out.println("Turning off...");
                    System.out.println("x_x");
                    break;
                default:
                    System.out.println("Incorrect option.");
                    break;
            }
        } while (option != 5);
    }

    public void enterNumbers() {
        System.out.println("Enter the first number.");
        number1 = read.nextDouble();
        System.out.println("Enter the second number.");
        number2 = read.nextDouble();
    }

}
