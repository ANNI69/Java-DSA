package Recursion;

public class FactorialInRecursion {
    int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }
    public static void main(String[] args) {
        FactorialInRecursion f = new FactorialInRecursion();
        System.out.println(f.factorial(5));
    }
}
    