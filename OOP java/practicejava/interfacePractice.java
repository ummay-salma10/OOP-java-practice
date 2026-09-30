
interface Shape {
    public double area();
    public double perimeter();
}

class Circle implements Shape {
    public double PI = Math.PI;
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public double diameter() {
        return 2 * radius;
    }
}

class Rectangle implements Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}

public class interfacePractice {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("Area: " + c1.area() + "\nPerimeter: " + c1.perimeter() + "\nDiameter: " + c1.diameter());

        Rectangle r1 = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + r1.area() + "\nPerimeter: " + r1.perimeter() + "\nDiagonal: " + r1.diagonal());
    }
}

