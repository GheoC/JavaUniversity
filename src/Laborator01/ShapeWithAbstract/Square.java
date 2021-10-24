package Laborator01.ShapeWithAbstract;

public class Square extends Rectangle {

    public Square(double length) {
        super(length,length);
    }

    public Square(String colour, double length) {
        super(colour, length, length);
    }

    public double getArea() {
        return super.getLength() * super.getLength();
    }

    public double getPerimeter() {
        return 4 * super.getLength();
    }

    public String getClassName() {
        return "square";
    }

    public void setSide(double length) {
        super.setLength(length);
    }


}
