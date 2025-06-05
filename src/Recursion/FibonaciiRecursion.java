package Recursion;

public class FibonaciiRecursion {
    // Recursive method to return nth Fibonacci number
    int fibonacci(int n) {
        if (n <= 1) return n; // base cases: fib(0) = 0, fib(1) = 1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonaciiRecursion sol = new FibonaciiRecursion();
        int n = 7; // Example: Get the 7th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + sol.fibonacci(n));
    }
}
