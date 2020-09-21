package com.company;

public class Car implements Nameable{
    String color;
    String name;
    String manufacturer;
    double zero_to_a_hundreed;
    int hp;
    double weight;

    public Car(String color, String name, String manufacturer, double zero_to_a_hundreed, int hp, double weight) {
        this.color = color;
        this.name = name;
        this.manufacturer = manufacturer;
        this.zero_to_a_hundreed = zero_to_a_hundreed;
        this.hp = hp;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.manufacturer + " " +this.name;
    }
}
