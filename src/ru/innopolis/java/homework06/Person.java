package ru.innopolis.java.homework06;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int money;
    private List<Product> bag;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("Деньги не могут быть отрицательными");
        }
        this.money = money;
    }

    public List<Product> getBag() {
        return bag;
    }

    public void addProduct(Product product) {
        if (money >= product.getPrice()) {
            bag.add(product);
            money -= product.getPrice();
            System.out.println(name + " купил " + product.getName());
        } else {
            System.out.println(name + " не может позволить себе " + product.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ");
        if (bag.isEmpty()) {
            sb.append("Ничего не куплено");
        } else {
            for (Product p : bag) {
                sb.append(p.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}