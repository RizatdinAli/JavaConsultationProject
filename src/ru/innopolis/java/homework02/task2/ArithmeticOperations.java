package ru.innopolis.java.homework02.task2;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;
        int distance = Math.abs(num1 - num2);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разница: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Среднее значение: " + average);
        System.out.println("Расстояние: " + distance);
        System.out.println("Максимум: " + maximum);
        System.out.println("Минимум: " + minimum);

        scanner.close();
    }
}
