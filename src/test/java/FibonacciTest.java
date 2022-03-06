import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Passed Zero as value")
    void fibonacciRecursivePassedZeroAsValue() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(0);
        assertEquals(0,sum);
    }

    @Test
    @DisplayName("Passed One as value")
    void fibonacciRecursivePassedOneAsValue() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(1);
        assertEquals(1,sum);
    }

    @Test
    @DisplayName("Passed Negative value")
    void fibonacciRecursivePassedNegativeValue() {
        Fibonacci fibonacci = new Fibonacci();
        //Testing if an error pops up
        assertThrows(Exception.class, ()->new Fibonacci().fibonacciRecursive(-11));
    }

    @Test
    @DisplayName("Passed Large value")
    void fibonacciRecursivePassedLargeValue() {
        Fibonacci fibonacci = new Fibonacci();
        //Testing if an error pops up
        assertThrows(StackOverflowError.class, ()->new Fibonacci().fibonacciRecursive(29013231));
    }
}