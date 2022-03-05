public class Fibonacci {
    public int fibonacciRecursive(int n) {
        //Base Case: if the value is zero then returns one
        if ((n == 0) || (n == 1)) return n;
        else if (n < 0) throw new RuntimeException("Invalid Values");
        else return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
