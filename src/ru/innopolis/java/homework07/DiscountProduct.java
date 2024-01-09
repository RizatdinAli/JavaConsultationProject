package ru.innopolis.java.homework07;


public class DiscountProduct extends Product {
    private int discount;

    public DiscountProduct() {

    }

    public DiscountProduct(String name, int price, int discount) {
        super(name, price);
        setDiscount(discount);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Недопустимый размер скидки!");
        }
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + ", скидка " + discount + "%";
    }
}