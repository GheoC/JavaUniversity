package Laborator01.ShapeWIthAbstract;

public class Rectangle extends Shape {
    private Integer width;
    private Integer length;


    public Rectangle(String colour, Integer width, Integer lenght) {
        super(colour);
        this.width = width;
        this.length = lenght;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getArea() {
        return Double.valueOf(2 * width + 2 * length);
    }

    public String getClassName()
    {
        return "rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle with colour " + super.getColour() + " has width of " + this.width + " and length of " + this.length;
    }
}
