package com.company;

public class Planet implements Nameable {
    String name;
    double radius;
    String atmosphere;
    double distance_from_the_star;
    boolean habitable;

    public Planet(String name, double radius, String atmosphere,
                  double distance_from_the_star, boolean habitable) {
        this.name = name;
        this.radius = radius;
        this.atmosphere = atmosphere;
        this.distance_from_the_star = distance_from_the_star;
        this.habitable = habitable;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public double getDistance_from_the_star() {
        return distance_from_the_star;
    }

    public void setDistance_from_the_star(double distance_from_the_star) {
        this.distance_from_the_star = distance_from_the_star;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
