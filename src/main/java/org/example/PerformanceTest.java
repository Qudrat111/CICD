package org.example;

public class PerformanceTest {
    public static void main(String[] args) {
        // Task: Sum numbers from 1 to 1,000,000
        long startTime, endTime;

        // Warm-up loop
        for (int i = 0; i < 10; i++) {
            sumNumbers(1_000_000); // Execute the task multiple times
        }

        // Actual performance measurement
        startTime = System.nanoTime();
        sumNumbers(1_000_000);
        endTime = System.nanoTime();

        System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
    }

    private static long sumNumbers(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
