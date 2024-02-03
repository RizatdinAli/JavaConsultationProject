package ru.innopolis.java.homework12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = readPersonData();
            writePersonData(person);
        } catch (PersonException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Person readPersonData() throws PersonException {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        if (data.length != 7) {
            throw new PersonException("Некорректное количество полей");
        }

        Person person = new Person();
        person.setLastName(data[0]);
        person.setFirstName(data[1]);
        person.setMiddleName(data[2]);

        // Проверяем формат даты рождения
        if (!data[3].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new PersonException("Некорректный формат даты рождения");
        }
        person.setBirthDate(data[3]);

        // Проверяем номер телефона
        if (!data[4].matches("\\d+")) {
            throw new PersonException("Некорректный номер телефона");
        }
        person.setPhoneNumber(data[4]);

        // Проверяем пол
        if (data[5].length() != 1 || (data[5].charAt(0) != 'f' && data[5].charAt(0) != 'm')) {
            throw new PersonException("Некорректный пол");
        }
        person.setGender(data[5].charAt(0));

        // Проверяем возраст
        try {
            int age = Integer.parseInt(data[6]);
            person.setAge(age);
        } catch (NumberFormatException e) {
            throw new PersonException("Некорректный возраст");
        }

        return person;
    }

    public static void writePersonData(Person person) {
        String filePath = "src/ru/innopolis/java/homework12/Иванов.txt" + person.getLastName() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName() + " " +
                    person.getBirthDate() + " " + person.getPhoneNumber() + " " + person.getGender() + " " + person.getAge());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}