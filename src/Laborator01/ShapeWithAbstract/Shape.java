package Laborator01.ShapeWithAbstract;

public abstract class Shape {
    private String colour;
    private Boolean filled;

    public Shape() {
        this.filled = false;
    }

    public Shape(String colour) {
        this.colour = colour;
        this.filled = true;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
        if (colour == null) {
            this.filled = false;
        } else {
            this.filled = true;
        }
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getClassName();

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
