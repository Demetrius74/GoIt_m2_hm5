package org.example;

public class RecFibonacci extends Fibonacci {
    /**
     * Calculates fibonacci number using head recursion
     *
     * Time complexity: O(2^n)
     * Space complexity: O(n)
     */
    public RecFibonacci(int n) {
        super(n);
    }

    @Override
    public long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

}
