package com.kodilla;

public class Calculator {

    public Double add(Double number1, Double number2){
        return number1 + number2;
    }

    public Double subtract(Double number1, Double number2){
        return number1 - number2;
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10.0,20.0));
        System.out.println(c.subtract(30.0,20.0));

    }
}
