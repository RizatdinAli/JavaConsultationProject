package ru.innopolis.java.homework02.task1;


public class FahrenheitToCelsius {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = 212;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Температура в градусах Цельсия: " + celsius);
    }
}
