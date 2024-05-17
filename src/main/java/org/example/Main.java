package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write N: ");
        int n = scanner.nextInt();

        System.out.println("Iter:");
        Fibonacci iterFibonacci = new IterFibonacci(n);
        System.out.println(iterFibonacci);

        System.out.println("Recursive: ");
        Fibonacci recFibonacci = new RecFibonacci(n);
        System.out.println(recFibonacci);

        System.out.println("Dynamic: ");
        Fibonacci dynamicFibonacci = new DynamicFibonacci(n);
        System.out.println(dynamicFibonacci);
    }
}