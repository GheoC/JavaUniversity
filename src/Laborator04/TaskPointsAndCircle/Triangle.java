package Laborator04.TaskPointsAndCircle;

import java.text.DecimalFormat;

public class Triangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {

        double d1 = Math.round(v1.distance(v2)*100000d)/100000d;
        double d2 = Math.round(v2.distance(v3)*100000d)/100000d;
        double d3 = Math.round(v3.distance(v1)*100000d)/100000d;

        if ( d1 == d2 && d2 == d3 ) {
            return "Echilateral";
        }

        if (v1.distance(v2) == v2.distance(v3)) {
            return "Isoscel";
        }
        if (v2.distance(v3) == v3.distance(v1)) {
            return "Isoscel";
        }
        if (v1.distance(v2) == v3.distance(v1)) {
            return "Isoscel";
        }
        return "Scalene";

    }
}
