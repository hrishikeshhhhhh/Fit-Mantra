/**
 * The `GeometricalCalculator` class contains methods for calculating the area of various geometric
 * shapes and includes a main method for example usage.
 */
// The line `public class GeometricalCalculator` is declaring a public class named
// `GeometricalCalculator`. This class can be accessed from other classes and contains methods for
// calculating the area of various geometric shapes.
public class GeometricalCalculator {

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        // Example usage
        double base = 5;
        double height = 8;
        double length = 10;
        double width = 6;
        double radius = 3;
        double side = 4;

        System.out.println("Area of Triangle: " + calculateTriangleArea(base, height));
        System.out.println("Area of Rectangle: " + calculateRectangleArea(length, width));
        System.out.println("Area of Circle: " + calculateCircleArea(radius));
        System.out.println("Area of Square: " + calculateSquareArea(side));
    }
}