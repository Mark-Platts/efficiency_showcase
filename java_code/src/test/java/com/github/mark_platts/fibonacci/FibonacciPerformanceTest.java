package com.github.mark_platts.fibonacci;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciPerformanceTest {

    @DisplayName("Test Memoized is faster than Naive: value 35")
    @Test
    void testMemoizationFasterThanNaive() {
        int n = 35; // large enough to see a difference, but not freeze the test

        // Time the naive Fibonacci
        long startNaive = System.nanoTime();
        long naiveResult = Fibonacci.fibonacci(n);
        long naiveTime = System.nanoTime() - startNaive;

        // Time the memoized Fibonacci
        long startMemo = System.nanoTime();
        long memoResult = Fibonacci.fibonacciWithMemo(n);
        long memoTime = System.nanoTime() - startMemo;

        // Ensure both methods return the same result
        assertTrue(naiveResult == memoResult, "Results must match");

        // Assert that memoized is faster
        assertTrue(memoTime < naiveTime, 
                   () -> "Memoized Fibonacci method (" + memoTime + " ns) should be faster than naive (" + naiveTime + " ns)");
    }
}
