package Laborator04.TaskPointsAndCircle;

import java.util.List;

public class Circle {
    private MyPoint center;
    private double radius;

    public Circle() {
    }

    public Circle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return center.getX();
    }

    public void setCenterX(double x) {
        this.center.setX(x);
    }

    public double getCenterY() {
        return center.getY();
    }

    public void setCenterY(double y) {
        center.setY(y);
    }

    public List<Double> getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(double x, double y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(Circle c)
    {
        return this.center.distance(c.center);
    }
}
