import java.util.Scanner;

public class FibonacciSequence {
    
    // Method to print Fibonacci sequence up to a given limit
    public static void generateFibonacci(int limit) {
        int a = 0, b = 1;
        
        // Print initial Fibonacci numbers
        System.out.print("Fibonacci Sequence: " + a);
        
        while (b <= limit) {
            System.out.print(", " + b);
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for an upper limit
        System.out.print("Enter the upper limit for Fibonacci sequence: ");
        int limit = scanner.nextInt();
        
        // Call the method to generate Fibonacci sequence
        generateFibonacci(limit);
        
        scanner.close();
    }
}
