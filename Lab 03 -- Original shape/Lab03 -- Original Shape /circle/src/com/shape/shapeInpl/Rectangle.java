package com.shape.shapeInpl;

import com.shape.Shape;

public class Rectangle implements Shape {

     double lowerLeftX;
     double lowerleftY;
     double width;
     double height;

    @Override
    public double distToOrigin() {
        return Math.sqrt(this.lowerLeftX * this.lowerLeftX + this.lowerleftY * this.lowerleftY);
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public Double perimeter() {
        return this.width + this.height + this.width + this.height;
    }

    @Override
    public Shape resize(double d) {
        Shape s = new Rectangle();
        ((Rectangle) s).lowerLeftX = this.lowerLeftX;
        ((Rectangle) s).lowerleftY = this.lowerleftY;
        ((Rectangle) s).height = d;
        ((Rectangle) s).width = d;
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
