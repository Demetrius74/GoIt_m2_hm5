package org.example;

public class DynamicFibonacci extends Fibonacci{
    public DynamicFibonacci(int n) {
        super(n);
    }

    @Override
    public long fib(int n) {
        long[] f = new long[n+2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

}
