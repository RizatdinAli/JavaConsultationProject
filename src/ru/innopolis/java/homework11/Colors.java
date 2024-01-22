package ru.innopolis.java.homework11;

public enum Colors {
    WHITE("White"),
    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    PURPLE("Purple"),
    GREY("Grey"),
    BLACK("Black");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}