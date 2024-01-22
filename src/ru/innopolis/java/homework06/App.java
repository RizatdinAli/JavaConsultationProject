package ru.innopolis.java.homework06;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] persons = new Person[5];
        persons[0] = new Person("Павел Андреевич", 10000);
        persons[1] = new Person("Анна Петровна", 2000);
        persons[2] = new Person("Борис", 10);
        persons[3] = new Person("Женя", 0);
        persons[4] = new Person("Света", -3);

        Product[] products = new Product[7];
        products[0] = new Product("Хлеб", 40);
        products[1] = new Product("Молоко", 60);
        products[2] = new Product("Торт", 1000);
        products[3] = new Product("Кофе растворимый", 879);
        products[4] = new Product("Масло", 150);
        products[5] = new Product("Мороженое", 200);
        products[6] = new Product("Макароны", 800);

        String input;
        int personIndex = 0;
        while (true) {
            System.out.print(persons[personIndex].getName() + " ");
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("END")) {
                personIndex = (personIndex + 1) % persons.length;
                if (personIndex == 0) {
                    break;
                }
                continue;
            }
            try {
                Product product = findProduct(input, products);
                persons[personIndex].addProduct(product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Person p : persons) {
            System.out.println(p.toString());
        }
    }

    private static Product findProduct(String name, Product[] products) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Продукт не найден");
    }
}