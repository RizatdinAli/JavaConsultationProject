package ru.innopolis.java.homework02.task3;

import java.util.Scanner;


public class StringRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Исходная строка: ");
        String originalString = scanner.nextLine();

        System.out.print("Сколько раз вывести строку? ");
        int repetitionCount = scanner.nextInt();

        String repeatedString = repeatString(originalString, repetitionCount);

        System.out.println("После повторения " + repetitionCount + " раз: " + repeatedString);

        scanner.close();
    }

    public static String repeatString(String str, int count) {
        StringBuilder repeatedString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            repeatedString.append(str);
        }
        return repeatedString.toString();
    }
}
