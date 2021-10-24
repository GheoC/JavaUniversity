package Laborator04.TaskPointsAndCircle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public List<Double> getXY() {
        return Arrays.asList(this.x, this.y);
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) *(this.x - x)  + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint myPoint) {
        return Math.sqrt((this.x - myPoint.x) *(this.x - myPoint.x)  + (this.y - myPoint.y) * (this.y - myPoint.y));
    }

    public double distance() {
        return Math.sqrt(this.x *this.x + this.y *this.x);
    }
}
