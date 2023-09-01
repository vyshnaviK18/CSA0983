//Write a Java program to create a class called Car with a constructor that takes in the make, model, and year of the car, and a method to print out the car's make, model, and year.

public class car {
    private String make;
    private String model;
    private int year;
    
    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void printCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    
    public static void main(String[] args) {
        // Create a Car object
        car myCar = new car("Toyota", "Camry", 2022);
        
        // Print the car details
        myCar.printCarDetails();
    }
}
