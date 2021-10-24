package Laborator01.ShapeWIthAbstract;

public class Circle extends Shape

{
    private Integer radius;


    public Circle(String colour, Integer radius) {
        super(colour);
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
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

    public Double getArea()
    {
        return Math.PI*radius*radius;
    }
}
