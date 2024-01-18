package ru.innopolis.java.homework02.task3;

import java.util.Scanner;


public class GridPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число строк и столбцов сетки: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.print("Введите повторяемый элемент сетки: ");
        String element = scanner.next();

        printGrid(rows, columns, element);

        scanner.close();
    }

    public static void printGrid(int rows, int columns, String element) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
