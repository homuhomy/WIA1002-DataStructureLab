import java.util.Scanner;

public class q4 {
    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        // Display factorial
        System.out.println("Factorial of " + n + " is " + sum(n));
    }

    /** Return the factorial for a specified number */
    public static int sum(int n) {
        if (n == 1) // Base case
            return 1;
        else
            return n + sum(n - 1); // Recursive call
    }
}
