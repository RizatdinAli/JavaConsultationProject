package ru.innopolis.java.homework07;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Product> regularProducts;
    private List<DiscountProduct> discountProducts;

    public Person()    {

    }

    public Person(String name) {
        this.name = name;
        regularProducts = new ArrayList<>();
        discountProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRegularProduct(Product product) {
        regularProducts.add(product);
    }

    public void addDiscountProduct(DiscountProduct product) {
        discountProducts.add(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Обычные продукты: ");
        if (regularProducts.isEmpty()) {
            sb.append("Нет");
        } else {
            for (Product p : regularProducts) {
                sb.append(p.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("; Акционные продукты: ");
        if (discountProducts.isEmpty()) {
            sb.append("Нет");
        } else {
            for (DiscountProduct p : discountProducts) {
                sb.append(p.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}