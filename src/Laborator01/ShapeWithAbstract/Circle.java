package Laborator01.ShapeWithAbstract;

public class Circle extends Shape
{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with colour " + super.getColour() + " has a radius of " + this.radius;
    }

    public String getClassName()
    {
        return "circle";
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
