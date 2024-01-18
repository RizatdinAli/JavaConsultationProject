package ru.innopolis.java.homework07;


public class Product {
    private String name;
    private int price;

    public Product() {

    }

    public Product(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Недопустимое имя продукта!");
        }
        if (name.matches("\\d+")) {
            throw new IllegalArgumentException("Недопустимое имя продукта!");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("Недопустимое имя продукта!");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Недопустимая цена продукта!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}