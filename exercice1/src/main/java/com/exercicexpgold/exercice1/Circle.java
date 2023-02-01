
package com.exercicexpgold.exercice1;

/**
 *
 * @author Soro
 */
public class Circle {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(){
        this(1);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
    
}

