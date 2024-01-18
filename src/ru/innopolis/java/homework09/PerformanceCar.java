package ru.innopolis.java.homework09;

import java.util.Arrays;


public class PerformanceCar extends Car {
    private String[] addOns;

    public PerformanceCar(String brand, String model, int year, int horsepower, int acceleration, int suspension, int durability, String[] addOns) {
        super(brand, model, year, horsepower, acceleration, suspension, durability);
        this.addOns = addOns;
    }

    public String[] getAddOns() {
        return addOns;
    }

    public void setAddOns(String[] addOns) {
        this.addOns = addOns;
    }

    @Override
    public String toString() {
        return super.toString() + " PerformanceCar{" +
                "addOns=" + Arrays.toString(addOns) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PerformanceCar that = (PerformanceCar) o;
        return Arrays.equals(addOns, that.addOns);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(addOns);
        return result;
    }
}