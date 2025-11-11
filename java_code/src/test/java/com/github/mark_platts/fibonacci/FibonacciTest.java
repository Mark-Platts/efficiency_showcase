package com.github.mark_platts.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @DisplayName("Test first 6 values of sequence: Naive")
    @Test
    void testNaiveFibonacciSmall() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
    }

    @DisplayName("Test first 6 values of sequence: Memoized")
    @Test
    void testMemoizedFibonacciSmall() {
        assertEquals(0, Fibonacci.fibonacciWithMemo(0));
        assertEquals(1, Fibonacci.fibonacciWithMemo(1));
        assertEquals(1, Fibonacci.fibonacciWithMemo(2));
        assertEquals(2, Fibonacci.fibonacciWithMemo(3));
        assertEquals(3, Fibonacci.fibonacciWithMemo(4));
        assertEquals(5, Fibonacci.fibonacciWithMemo(5));
        assertEquals(8, Fibonacci.fibonacciWithMemo(6));
    }
}
