package ru.innopolis.java.homework04.task2;


import java.util.Scanner;

public class ArrowCount {

    public static void main(String[] args) {
        taskExample();
    }

    public static void taskExample() {
        String str;
        str = "<>--<--<<---<>--->>>->>-->--->>-->-<<<<--<<-<<---<>--->>>->>---->>>->>-->--->>-->-<<<<";
        int count = 0;

        // Iterate through the string and count the arrows
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.startsWith(">>-->", i) || str.startsWith("<--<<", i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void taskFullExample() {
        System.out.print("Введите исходную строку: ");
        Scanner scanner = new Scanner(System.in);
        String inputArrows = scanner.nextLine();

        final String arrowFirst = "<--<<";
        final String arrowSecond = ">>-->";

        if (inputArrows.length() > 106) {
            System.out.println("Длина строки превышает условие");
        } else {
            int count = 0;
            int index = inputArrows.indexOf(arrowFirst);

            while (index != -1) {
                count++;
                index = inputArrows.indexOf(arrowFirst, index + arrowFirst.length());
            }

            index = inputArrows.indexOf(arrowSecond);

            while (index != -1) {
                count++;
                index = inputArrows.indexOf(arrowSecond, index + arrowSecond.length());
            }

            System.out.println("Количество стрел: " + count);
        }
    }
}