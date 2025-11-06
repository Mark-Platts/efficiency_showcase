package com.github.mark_platts.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciWithMemo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        
        Map<Integer, Long> cache = new HashMap<>(); //stores prior calculations of fibMemoHelper
        cache.put(0, 0L);
        cache.put(1, 1L);
        
        return fibMemoHelper(n, cache);
    }

    // checks if value for n was previously cached and if so uses cached value instead of calculating
    private static long fibMemoHelper(int n, Map<Integer, Long> cache) {
        if (cache.containsKey(n)) { 
            return cache.get(n); 
        }
        long value = fibMemoHelper(n - 1, cache) + fibMemoHelper(n - 2, cache);
        cache.put(n, value); // caches calculated values for n
        return value;
    }
}