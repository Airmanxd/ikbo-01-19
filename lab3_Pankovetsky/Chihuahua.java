package com.company;

public class Chihuahua extends Dog{
    int clothes_eaten;
    public Chihuahua(String name, String fur_length, String size, String character, int age,
        int clothes_eaten)
    {
        super(name, fur_length, size, character, age);
        this.clothes_eaten = clothes_eaten;
    }

    @Override
    public void bark() {
        System.out.println("Gwah");
    }
}
