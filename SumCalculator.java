public class SumCalculator {

    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public double sum(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int sumInt = calculator.sum(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumInt);
        double sumDouble = calculator.sum(1.5, 2.5, 3.5, 4.5, 5.5);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}
