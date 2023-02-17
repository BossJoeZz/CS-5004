package com.shape;

public interface Shape {

    public double distToOrigin();

    public double area();

    public Double perimeter();

    public Shape resize(double d);

    public int compareTo(Shape s);

}
