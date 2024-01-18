package ru.innopolis.java.homework09;

import java.util.List;
import java.util.Objects;

public class Garage {
    private List<Car> parkedCars;

    public Garage(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }

    public List<Car> getParkedCars() {
        return parkedCars;
    }

    public void setParkedCars(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }

    public void modifyParkedCar(Car car) {
        // Модификация припаркованного автомобиля
        // ...
    }

    @Override
    public String toString() {
        return "Garage{" +
                "parkedCars=" + parkedCars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(parkedCars, garage.parkedCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parkedCars);
    }
}