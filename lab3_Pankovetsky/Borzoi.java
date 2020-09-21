package com.company;

public class Borzoi extends Dog {
    int prey_found;

    public Borzoi(String name, String fur_length, String size, String character, int age, int prey_found) {
        super(name, fur_length, size, character, age);
        this.prey_found = prey_found;
    }

    @Override
    public void bark() {
        System.out.println("Grah!");
    }
}
