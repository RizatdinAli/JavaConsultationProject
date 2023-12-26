package ru.innopolis.java.homework06;

public class Product {
    private String name;
    private int price;

    public Product()    {

    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название продукта не может быть пустым");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Стоимость продукта не может быть отрицательной");
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

    private static Product findProduct(String name, Product[] products) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Продукт не найден");
    }

}