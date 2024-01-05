package ru.innopolis.java.homework07;

import java.util.Scanner;

;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("Павел Андреевич");

        Product bread = new Product("Хлеб", 40);
        Product milk = new Product("Молоко", 60);
        Product chocolate = new Product("шоколадка", 100);
        DiscountProduct cake = new DiscountProduct("Торт", 800, 15);
        DiscountProduct coffee = new DiscountProduct("Кофе растворимый", 432, 50);

        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            String[] parts = input.split("=");
            if (parts.length != 2) {
                System.out.println("Недопустимый формат ввода!");
                continue;
            }
            String name = parts[0].trim();
            int price;
            try {
                price = Integer.parseInt(parts[1].trim());
            } catch (NumberFormatException e) {
                System.out.println("Недопустимая цена продукта!");
                continue;
            }
            try {
                Product product;
                if (name.equalsIgnoreCase(bread.getName())) {
                    product = bread;
                } else if (name.equalsIgnoreCase(milk.getName())) {
                    product = milk;
                } else if (name.equalsIgnoreCase(chocolate.getName())) {
                    throw new IllegalArgumentException("Недопустимая цена продукта!");
                } else if (name.equalsIgnoreCase(cake.getName())) {
                    product = cake;
                } else if (name.equalsIgnoreCase(coffee.getName())) {
                    product = coffee;
                } else {
                    throw new IllegalArgumentException("Недопустимое имя продукта!");
                }
                product.setPrice(price);
                if (product instanceof DiscountProduct) {
                    person.addDiscountProduct((DiscountProduct) product);
                } else {
                    person.addRegularProduct(product);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(person.toString());
    }
}