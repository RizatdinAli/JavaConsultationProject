package ru.innopolis.java.homework09;

public class ShowCar extends Car {
    private int stars;

    public ShowCar(String brand, String model, int year, int horsepower, int acceleration, int suspension, int durability, int stars) {
        super(brand, model, year, horsepower, acceleration, suspension, durability);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return super.toString() + " ShowCar{" +
                "stars=" + stars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShowCar showCar = (ShowCar) o;
        return stars == showCar.stars;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + stars;
        return result;
    }
}