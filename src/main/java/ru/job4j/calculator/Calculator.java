package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return a + x;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int divide(int c) {
        return c / x;
    }

    public int multiply(int d) {
        return x * d;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + this.divide(y) + this.multiply(y);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sumAllOperation(4));
    }
}
