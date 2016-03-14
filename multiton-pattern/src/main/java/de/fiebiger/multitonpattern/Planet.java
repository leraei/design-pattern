package de.fiebiger.multitonpattern;

/**
 * Created by Timo on 14.03.16.
 */
public class Planet {
    private PlanetName name;

    private int radius;
    private int mass;
    private double gravity;

    private Planet() {
    }

    protected Planet(PlanetName name, int radius, int mass, double gravity) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.gravity = gravity;
    }

    public PlanetName getName() {
        return name;
    }

    public void setName(PlanetName name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }
}
