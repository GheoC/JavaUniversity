package Laborator01.ShapeWithAbstract;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("***********************");

        //creating a simple circle
        Circle circle = new Circle("red", 3);

        System.out.println(circle);
        System.out.println("Area is: " + circle.getArea());

        System.out.println("***********************");

        //testing polymorphism
        Shape shape1 = new Circle("red", 3);

        Shape shape2 = new Rectangle("blue", 5, 4);

        Shape shape3 = new Square("pink", 10);

        List<Shape> shapeList = Arrays.asList(shape1, shape2, shape3);
        shapeList.forEach(shape ->
                System.out.println("this is a " + shape.getColour() + " " + shape.getClassName() +
                        ". Area is " + shape.getArea() + "; Perimeter is " + shape.getPerimeter()));

        //testing filled colour
        Shape shape4 = new Square(6);
        System.out.println(shape4.getFilled()+"! --> Colour: "+shape4.getColour());
        shape4.setColour("cyan");
        System.out.println(shape4.getFilled()+"! --> Colour: "+shape4.getColour());

        //repainting the shape
        shape4.setColour(null);
        System.out.println(shape4.getFilled()+"! --> Colour: "+shape4.getColour());
        shape4.setColour("Yellow");
        System.out.println(shape4.getFilled()+"! --> Colour: "+shape4.getColour());
        
    }
}
