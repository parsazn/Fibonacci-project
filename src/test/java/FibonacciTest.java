import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Passed Zero as value")
    void fibonacciRecursivePassedZeroAsValue() {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(0);
        assertEquals(0,sum);
    }

    @Test
    @DisplayName("Passed One as value")
    void fibonacciRecursivePassedOneAsValue() {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(1);
        assertEquals(1,sum);
    }

    @Test
    @DisplayName("Passed Negative value")
    void fibonacciRecursivePassedNegativeValue() {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(-11);
        //10th element is equal to 55
    }
}