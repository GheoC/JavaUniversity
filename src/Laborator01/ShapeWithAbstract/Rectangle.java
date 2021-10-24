package Laborator01.ShapeWithAbstract;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String colour, double width, double length) {
        super(colour);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public String getClassName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle with colour " + super.getColour() + " has width of " + this.width + " and length of " + this.length;
    }
}
