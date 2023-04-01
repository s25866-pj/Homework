package Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }
    public Circle(){
        this.radius = 2;
        this.color="yellow";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
