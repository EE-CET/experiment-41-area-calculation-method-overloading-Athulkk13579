import java.util.Scanner;

public class AreaCalculator {

    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(float length, float breadth) {
        return length * breadth;
    }

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        float radius = scanner.nextFloat();

        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.printf("%.2f%n", calculator.calculateArea(radius));
        System.out.printf("%.2f%n", calculator.calculateArea(length, breadth));
        System.out.printf("%.2f%n", calculator.calculateArea(base, height));
        
        scanner.close();
    }
}
