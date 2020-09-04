
package ru.mirea.lab1;

public class Ball {
    double radius;
    String colour;
    public Ball(double radius, String colour)
    {
        this.radius = radius;
        this.colour = colour;
        System.out.println("Created an object of type Ball, radius: " + this.radius +
                " colour: " + this.colour);
    }
    public double get_radius()
    {
        return this.radius;
    }
    public String get_colour()
    {
        return this.colour;
    }
}
