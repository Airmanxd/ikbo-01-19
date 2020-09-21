package com.company;

public class Husky extends Dog{
    int sled_races_won;

    public Husky(String name, String fur_length, String size, String character, int age, int wins) {
        super(name, fur_length, size, character, age);
        this.sled_races_won = wins;

    }

    @Override
    public void bark() {
        System.out.println("Woof!");
    }
}
