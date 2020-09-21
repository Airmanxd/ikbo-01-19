package com.company;

public class DogTest {
    public static void main(String[] args) {
        Borzoi b = new Borzoi("good boy", "medium", "Big", "Intelligent",
                10, 120);
        Husky h = new Husky("Hatiko", "Long", "Huge", "Loyal", 14, 8);
        Chihuahua c = new Chihuahua("Boba", "Short", "Small", "Annoying", 6, 20);
        b.bark();
        h.bark();
        c.bark();
    }

}
