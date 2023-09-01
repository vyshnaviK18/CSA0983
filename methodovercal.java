class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; 
        }
        return num1 / num2;
    }
}

class ScientificCalculator extends Calculator {
    public double multiply(double num1, double num2) {
        return Math.pow(num1, 2) * Math.pow(num2, 3);
    }
}

public class  methodovercal {
    public static void main(String[] args) {
        Calculator basicCalc = new Calculator();
        ScientificCalculator sciCalc = new ScientificCalculator();

        double result1 = basicCalc.multiply(5.0, 3.0); 
        double result2 = sciCalc.multiply(5.0, 3.0);   

        System.out.println("Basic Calculator Multiply Result: " + result1);
        System.out.println("Scientific Calculator Multiply Result: " + result2);
    }
}
