package ru.innopolis.java.homework03.Television;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Television[] televisions = new Television[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < televisions.length; i++) {
            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter channel number: ");
            int channelNumber = scanner.nextInt();

            System.out.print("Enter volume: ");
            int volume = scanner.nextInt();

            System.out.print("Is the TV on? (true/false): ");
            boolean isOn = scanner.nextBoolean();

            scanner.nextLine(); // Consume the newline character

            televisions[i] = new Television(brand, channelNumber, volume, isOn);
        }

        for (Television tv : televisions) {
            System.out.println(tv);
        }
    }
}