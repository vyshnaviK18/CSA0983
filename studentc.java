import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double[] marks;
    
    public Student(int id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    
    public String calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        double average = calculateAverage();
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class studentc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        double[] marks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        
        Student student = new Student(id, name, marks);
        student.displayDetails();
        
        scanner.close();
    }
}
