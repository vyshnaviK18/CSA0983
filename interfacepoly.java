
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}


class Square implements Drawable {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLength);
    }
}

public class interfacepoly {
    public static void main(String[] args) {
        Drawable circle = new Circle(5.0);
        Drawable square = new Square(4.0);

        circle.draw();
        square.draw();
    }
}
