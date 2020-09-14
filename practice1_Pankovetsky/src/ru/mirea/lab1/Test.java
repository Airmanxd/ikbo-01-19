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
public class Test {
    public static void main(String[] args) {
        Ball b = new Ball(10, "Blue");
        Dog dog = new Dog(5, "Gray", "Bulldog");
        Book novel = new Book(500, "The Catcher in The Rye", "J. D. Salinger");
        dog.bark(); 
    }
}
