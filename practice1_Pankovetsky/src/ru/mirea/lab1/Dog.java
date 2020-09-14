/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mirea.lab1;

/**
 *
 * @author student
 */
public class Dog {
    int age;
    String colour;
    String breed;
    public Dog(int age, String colour, String breed)
    {
        this.age = age;
        this.colour = colour;
        this.breed = breed;
        System.out.println("Created an object of type Dog, age: " + this.age +
                " colour: " + this.colour + " breed: " + this.breed);
    }
    public void bark()
    {
        System.out.println("*dog goes woof*");
    }
    public int get_age()
    {
        return this.age;
    }
    public String get_colour()
    {
        return this.colour;
    }
    public String get_breed()
    {
        return this.breed;
    }
}
