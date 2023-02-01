package com.shape.shapeInpl;

import com.shape.Shape;

public class Circle implements Shape {

     double centerx;
     double centery;
     double radius;

    @Override
    public double distToOrigin() {
        return Math.sqrt(centerx * centerx + centery * centery);
    }

    @Override
    public double area() {

        return radius * 3.14 * radius;
    }

    @Override
    public Double perimeter() {

        return radius * 2 * 3.14;
    }

    @Override
    public Shape resize(double d) {
        Shape s = new Circle();
        ((Circle) s).centerx = this.centerx;
        ((Circle) s).centery = this.centery;
        ((Circle) s).radius = d;
        return s;
    }

    //Repititive
    @Override
    public int compareTo(Shape s) {
        if (this.area() < s.area())
            return -1;
        else if(this.area() > s.area())
            return 1;
        else
            return 0;
    }
}
