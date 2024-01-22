package ru.innopolis.java.homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("a123me", "Mercedes", Colors.WHITE, 0, 8300000));
        cars.add(new Car("b873of", "Volga", Colors.BLACK, 0, 673000));
        cars.add(new Car("w487mn", "Lexus", Colors.GREY, 76000, 900000));
        cars.add(new Car("p987hj", "Volga", Colors.RED, 610, 704340));
        cars.add(new Car("c987ss", "Toyota", Colors.WHITE, 254000, 761000));
        cars.add(new Car("o983op", "Toyota", Colors.BLACK, 698000, 740000));
        cars.add(new Car("p146op", "BMW", Colors.WHITE, 271000, 850000));
        cars.add(new Car("u893ii", "Toyota", Colors.PURPLE, 210900, 440000));
        cars.add(new Car("l097df", "Toyota", Colors.BLACK, 108000, 780000));
        cars.add(new Car("y876wd", "Toyota", Colors.BLACK, 160000, 1000000));

        System.out.println("Автомобили в базе:");
        System.out.println("Number Model Color Mileage Cost");
        for (Car car : cars) {
            System.out.println(car);
        }

        String colorToFind = "Black";
        int mileageToFind = 0;
        List<String> carNumbers = cars.stream()
                .filter(car -> car.getColor().equals(Colors.valueOf(colorToFind.toUpperCase())) || car.getMileage() == mileageToFind)
                .map(Car::getNumber)
                .collect(Collectors.toList());
        System.out.println("Номера автомобилей по цвету или пробегу: " + carNumbers);

        long n = 700_000;
        long m = 800_000;
        long uniqueModelsCount = cars.stream()
                .filter(car -> car.getCost() >= n && car.getCost() <= m)
                .map(Car::getModel)
                .distinct()
                .count();
        System.out.println("Уникальные автомобили: " + uniqueModelsCount + " шт.");

        String colorWithMinCost = cars.stream()
                .min((car1, car2) -> Double.compare(car1.getCost(), car2.getCost()))
                .map(Car::getColor)
                .orElse(Colors.BLACK)
                .toString();
        System.out.println("Цвет автомобиля с минимальной стоимостью: " + colorWithMinCost);

        String modelToFind = "Toyota";
        double averageCostOfModelToFind = cars.stream()
                .filter(car -> car.getModel().equals(modelToFind))
                .mapToDouble(Car::getCost)
                .average()
                .orElse(0);
        System.out.printf("Средняя стоимость модели %s: %.2f%n", modelToFind, averageCostOfModelToFind);
    }
}