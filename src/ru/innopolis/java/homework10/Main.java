package ru.innopolis.java.homework10;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ByCondition isEvenNumber = number -> number % 2 == 0;
        ByCondition isSumOfDigitsEven = number -> {
            int sum = 0;
            int tempNumber = number;
            while (tempNumber != 0) {
                sum += tempNumber % 10;
                tempNumber /= 10;
            }
            return sum % 2 == 0;
        };
        int[] arrEx = {10, 21, 1, 9, 5, 78, 37, 56, 12};

        System.out.println("Исходный массив: " + Arrays.toString(arrEx));
        System.out.println("Четные числа: " + Arrays.toString(Sequence.filter(arrEx, isEvenNumber)));
        System.out.println("Числа с четной суммой цифр: " + Arrays.toString(Sequence.filter(arrEx, isSumOfDigitsEven)));
    }
}