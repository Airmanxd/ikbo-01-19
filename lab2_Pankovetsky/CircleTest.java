package com.company;

import java.util.Scanner;

public class CircleTest {
    public static void main (String[] args)
    {
        double r, x, y;
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        x = sc.nextDouble();
        y = sc.nextDouble();
        Circle circ = new Circle(r, x, y);
        System.out.println(circ);
        circ.setRadius(10);
        circ.setX(3);
        circ.setY(6);
        System.out.println(circ);

    }
}
