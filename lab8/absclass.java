abstract class Shape {
    protected double area;

    public abstract void calculateArea();

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
    }
}

public class absclass {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.showArea();

        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.calculateArea();
        rectangle.showArea();
    }
}