package Laborator01.ShapeWIthAbstract;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("***********************");
        Circle circle = new Circle("red", 3);

        System.out.println(circle);
        System.out.println("Area is: " + circle.getArea());


        Shape shape1 = new Circle("red", 3);
        Shape shape2 = new Rectangle("blue", 5, 2);

        System.out.println("***********************");

        System.out.println("this is a " + shape1.getClassName() + " and the area is "
                + shape1.getArea()+" and it's "+shape1.getColour());
        System.out.println("this is a " + shape2.getClassName() + " and the area is "
                + shape2.getArea()+" and it's "+shape2.getColour());


    }
}
