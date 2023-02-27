/**
 * This class represents a Triangle.  It defines all the operations mandated by
 * the Shape interface
 */
public class Triangle extends AbstractShape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    /**
     * Constructs a rectangle object with three coordinates
     *
     * @param x      x coordinate of the one point
     * @param y      y coordinate of the one point
     * @param x1     x coordinate of the one point
     * @param y1     y coordinate of the one point
     * @param x2     x coordinate of the one point
     * @param y2     y coordinate of the one point
     */
    public Triangle(double x, double y, double x1, double y1, double x2, double y2) {
        super(new Point2D(x, y));
        if (x1 == x2 && y1 == y2)
            throw new IllegalArgumentException();
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Get area from Triangle, use halen method
     *
     * @return area
     */
    @Override
    public double area() {
        double side1 = Math.sqrt((super.reference.getX() - x1) * (super.reference.getX() - x1) +  (super.reference.getY() - y1) * (super.reference.getY() - y1));
        double side2 = Math.sqrt((super.reference.getX() - x2) * (super.reference.getX() - x2) +  (super.reference.getY() - y2) * (super.reference.getY() - y2));
        double side3 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        double p=(side1 + side2 + side3)/2;
        double area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));

        return area;
    }

    /**
     * Get perimeter from Triangle through three sides
     *
     * @return perimeter
     */
    @Override
    public double perimeter() {
        double side1 = Math.sqrt((super.reference.getX() - x1) * (super.reference.getX() - x1) +  (super.reference.getY() - y1) * (super.reference.getY() - y1));
        double side2 = Math.sqrt((super.reference.getX() - x2) * (super.reference.getX() - x2) +  (super.reference.getY() - y2) * (super.reference.getY() - y2));
        double side3 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        return side1 + side2 + side3;
    }

    @Override
    public Shape resize(double factor) {
        double sqrtFactor = Math.sqrt(factor);
        return new Triangle(
                this.reference.getX(),
                this.reference.getY(), sqrtFactor *
                this.x1,
                sqrtFactor * this.y1, sqrtFactor *
                this.x2,sqrtFactor *
                this.y2);
    }

    @Override
    public String toString() {
        return String.format("Triangle: point1 (%.3f,%.3f), point2 (%.3f,%.3f), point3 (%.3f,%.3f)",
                this.reference.getX(),this.reference.getY(),this.x1, this.y1, this.x2, this.y2);    }

}
