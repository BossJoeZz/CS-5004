package com.shape.shapeInpl;

import com.shape.Shape;

public class Rectangle implements Shape {

     double lowerLeftX;
     double lowerleftY;
     double width;
     double height;

    /**
     * A method to compute and return the distance of this shape from the origin
     * @param lowerleftX and lowerleftY
     * @return sqrt
     */
    @Override
    public double distToOrigin() {
        return Math.sqrt(this.lowerLeftX * this.lowerLeftX + this.lowerleftY * this.lowerleftY);
    }

    /**
     * A method to compute and return the area of the shape
     * @param width and height
     * @return area
     */
    @Override
    public double area() {
        return this.width * this.height;
    }

    /**
     * A method to compute and return the preimeter of the shape
     * @param width and height
     * @return perimeter
     */
    @Override
    public Double perimeter() {
        return this.width + this.height + this.width + this.height;
    }

    /**
     * A method that create a "resized" version of this shape and returns it
     * @param lowerleftX, lowerleftY, height and width
     * @return resize
     */
    @Override
    public Shape resize(double d) {
        Shape s = new Rectangle();
        ((Rectangle) s).lowerLeftX = this.lowerLeftX;
        ((Rectangle) s).lowerleftY = this.lowerleftY;
        ((Rectangle) s).height = d;
        ((Rectangle) s).width = d;
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
