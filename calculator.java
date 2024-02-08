public class calculator {
    //method to add two numbers
    public float add(float x, float y) {
        return (x + y);
    }

    //method to subtract two numbers
    public float sub(float x, float y) {
        return (x - y);
    }

    //method to multiply two numbers
    public float mul(float x, float y) {
        return (x * y);
    }

    //Method to divide two numbers
    public float div(float x, float y) {
        if (y == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (x / y);
    }

    public float square(float x) {
        return (x * x);
    }

    public float cube(float x) {
        return (x * x * x);
    }

    public static void main(String[] args) {
        float a = 5;
        float b = 3;
        calculator obj = new calculator();
        System.out.println("Sum of " + a + " and " + b + " is : " + obj.add(a, b));
        System.out.println("\nDifference of " + a + " and " + b + " is : " + obj.sub(a, b));
        System.out.println("\nProduct of " + a + " and " + b + " is : " + obj.mul(a, b) + "\n");
        System.out.println("\nDivision of " + a + " by " + b + " is : " + obj.div(a, b));
        System.out.print("\nSquare of " + a + " is: " + obj.square(a));
        System.out.print("\nCube of " + a + " is: " + obj.cube(a));
    }
}