package ru.innopolis.java.homework13.utils;

public class Utils {
    public static int parseCount(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid value: " + value, e);
        }
    }

    public static int validateCount(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be positive: " + value);
        }
        return value;
    }

    public static double parseNumber(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid value: " + value, e);
        }
    }

    public static double validateNumber(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Value cannot be NaN or infinite: " + value);
        }
        return value;
    }
}