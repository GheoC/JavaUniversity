package Laborator01.ShapeWIthAbstract;

public abstract class Shape
{
    private String colour;

    public Shape() {
    }

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract Double getArea();
    public abstract String getClassName();

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
