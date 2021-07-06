package com.javastart.helloworld;

public class Main {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber =10;

        int sum;
        int subtraction;
        int multiplication;
        int division;
        int reminder;

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = secondNumber / firstNumber;
        reminder = firstNumber % secondNumber;

        System.out.println("Сумма:" + sum);
        System.out.println("Вычитание:" + subtraction);
        System.out.println("Умножение:" + multiplication);
        System.out.println("Деление:" + division);
        System.out.println("Остаток-:" + reminder);
    }
}
