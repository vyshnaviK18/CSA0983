public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        double area = myRectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
