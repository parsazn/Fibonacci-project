import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Passed Zero as value")
    void fibonacciRecursivePassedZeroAsValue() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(0);
        assertEquals(0, sum);
    }

    @Test
    @DisplayName("Passed One as value")
    void fibonacciRecursivePassedOneAsValue() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        int sum = fibonacci.fibonacciRecursive(1);
        assertEquals(1, sum);
    }

    @Test
    @DisplayName("Passed Negative value")
    void fibonacciRecursivePassedNegativeValue() {
        //Testing if an error pops up
        assertThrows(Exception.class, () -> new Fibonacci().fibonacciRecursive(-1));
    }

    @Test
    @DisplayName("Passed Large value")
    void fibonacciRecursivePassedLargeValue() {
        //Testing if an error pops up
        assertThrows(StackOverflowError.class, () -> new Fibonacci().fibonacciRecursive(29013231));
    }

    @Test
    @DisplayName("Checking differnt values")
    void fibonacciRecursiveDifferentValues() {
        Fibonacci fibonacci = new Fibonacci();
        //Testing if an error pops up
        assertAll("Should return correct values",
                () -> assertEquals(0, fibonacci.fibonacciRecursive(0)),
                () -> assertEquals(1, fibonacci.fibonacciRecursive(1)),
                () -> assertEquals(1, fibonacci.fibonacciRecursive(2)),
                () -> assertEquals(2, fibonacci.fibonacciRecursive(3)),
                () -> assertEquals(3, fibonacci.fibonacciRecursive(4)),
                () -> assertEquals(5, fibonacci.fibonacciRecursive(5)),
                () -> assertEquals(8, fibonacci.fibonacciRecursive(6))
        );
    }
}