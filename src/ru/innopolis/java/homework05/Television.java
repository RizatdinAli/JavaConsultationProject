package ru.innopolis.java.homework05;


public class Television {
    private String brand;
    private int channelNumber;
    private int volume;
    private boolean isOn;

    public Television(String brand, int channelNumber, int volume, boolean isOn) {
        this.brand = brand;
        this.channelNumber = channelNumber;
        this.volume = volume;
        this.isOn = isOn;
    }

    // Getters and setters for the fields

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", channelNumber=" + channelNumber +
                ", volume=" + volume +
                ", isOn=" + isOn +
                '}';
    }
}


