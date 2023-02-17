package com.shape.shapeInpl;

import com.shape.Shape;

public class Circle implements Shape {

     double centerx;
     double centery;
     double radius;

    /**
     * A method to compute and return the distance of this shape from the origin
     * @param conterx and centery
     * @return sqrt
     */
    @Override
    public double distToOrigin() {
        return Math.sqrt(centerx * centerx + centery * centery);
    }

    /**
     * A method to compute and return the area of the shape
     * @param radius
     * @return area
     */
    @Override
    public double area() {

        return radius * 3.14 * radius;
    }

    /**
     * A method to compute and return the preimeter of the shape
     * @param radius
     * @return perimeter
     */
    @Override
    public Double perimeter() {

        return radius * 2 * 3.14;
    }

    /**
     * A method that create a "resized" version of this shape and returns it
     * @param centerx, centery and radius
     * @return resize
     */
    @Override
    public Shape resize(double d) {
        Shape s = new Circle();
        ((Circle) s).centerx = this.centerx;
        ((Circle) s).centery = this.centery;
        ((Circle) s).radius = d;
        return s;
    }

    /**
     * A method that compares two shapes based on their area and returns the result
     * @param
     * @return
     */
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
