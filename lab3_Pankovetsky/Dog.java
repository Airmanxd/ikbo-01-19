package com.company;

public abstract class Dog {
    public String name;
    public String fur_length;
    public String size;
    public String character;
    public int age;
    public Dog(String name, String fur_length, String size, String character, int age) {
        this.name = name;
        this.fur_length = fur_length;
        this.size = size;
        this.character = character;
        this.age = age;
    }

    public abstract void bark();

}
