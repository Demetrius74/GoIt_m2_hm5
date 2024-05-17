package org.example;

public abstract class Fibonacci {
    protected final int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    protected abstract long fib(int n);

    @Override
    public String toString() {
        return String.valueOf(fib(this.n));
    }
}
