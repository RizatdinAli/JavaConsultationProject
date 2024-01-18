package ru.innopolis.java.homework09;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, 200, 8, 5, 10);
        Car car2 = new Car("Honda", "Civic", 2021, 180, 9, 4, 9);

        PerformanceCar performanceCar = new PerformanceCar("Ferrari", "458 Italia", 2022, 600, 3, 2, 8, new String[]{"Spoiler", "Racing Exhaust"});
        ShowCar showCar = new ShowCar("Lamborghini", "Aventador", 2021, 650, 3, 4, 9, 5);

        Race race = new Race(1000, "City Circuit", 50000, Arrays.asList(car1, car2));

        Garage garage = new Garage(Arrays.asList(car1, car2));

        System.out.println(car1);
        System.out.println(performanceCar);
        System.out.println(showCar);
        System.out.println(race);
        System.out.println(garage);
    }
}