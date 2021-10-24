package Laborator04.TaskPointsAndCircle;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class main
{
    public static void main(String[] args)
    {
        List<MyPoint> points = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            MyPoint myPoint = new MyPoint(i+1,i+1);
            points.add(myPoint);
        }

        System.out.println(points);
        System.out.println();

        //first method
        System.out.print("First method => Distance between " + points.get(0).toString() + " and [3.0, 7.0] is: ");
        System.out.println(points.get(0).distance(3, 7));

        //second method
        MyPoint point2 = new MyPoint(3,7);
        System.out.print("Second method => Distance between " + points.get(0).toString() + " and "+point2.toString()+" is: ");
        System.out.println(points.get(0).distance(point2));

        //testing circles
        System.out.println();
        Circle circle1 = new Circle(points.get(0),6);
        Circle circle2 = new Circle(point2, 2);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.print("Distance between " + circle1.toString() + " and "+ circle2.toString()+" is: ");
        System.out.println(circle1.distance(circle2));

        //testing triangles
        Triangle triangle1 = new Triangle(points.get(0), point2, points.get(5));
        Triangle triangle2 = new Triangle(1,1,3,7,8,8);
        System.out.println();
        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println("Perimeter for "+triangle1.toString()+" is: "+ triangle1.getPerimeter());
        System.out.println("Perimeter for "+triangle2.toString()+" is: "+ triangle2.getPerimeter());


        //testing triangle type
        System.out.println();
        System.out.println(triangle1.toString()+" is "+triangle1.getType());

        Triangle isoscel = new Triangle(6,4,5,-2,7,-2);
        System.out.println(isoscel.toString() +" is "+isoscel.getType());

        Triangle echilateral1 = new Triangle(0,0,0,8,Math.sqrt(48),4);
        System.out.println(echilateral1.toString()+" is "+ echilateral1.getType());

        MyPoint p1 = new MyPoint(4,3);
        MyPoint p2 = new MyPoint(-4,3);
        MyPoint p3 = new MyPoint(0,3-4*Math.sqrt(3));

        Triangle echilateral2 = new Triangle(p1,p2,p3);

        System.out.println(echilateral2.toString()+" is "+ echilateral2.getType());
    }
}
