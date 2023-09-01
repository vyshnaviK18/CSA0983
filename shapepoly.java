
abstract class Shape {
    private double area;
    private double perimeter;

    abstract void calculateArea();

    abstract void calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("area="+area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("perimeter="+perimeter);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("area="+area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("perimeter="+perimeter);
    }
}

public class shapepoly {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();
        circle.calculatePerimeter();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

    }
}
