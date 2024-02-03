package ru.innopolis.java.homework04.task1;

import java.util.Scanner;


public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.next().charAt(0);

        char[] keyboard = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        int currentIndex = -1;
        for (int i = 0; i < keyboard.length; i++) {
            if (keyboard[i] == inputChar) {
                currentIndex = i;
                break;
            }
        }

        if (currentIndex != -1) {
            int leftIndex = (currentIndex - 1 + keyboard.length) % keyboard.length;
            System.out.println(keyboard[leftIndex]);
        }
    }
}
