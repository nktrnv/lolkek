package org.example;

public class Car {
    private String color;
    private String brand;

    public Car(String color,
               String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
