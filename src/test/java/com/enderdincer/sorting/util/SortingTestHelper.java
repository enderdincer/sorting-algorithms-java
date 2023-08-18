package com.enderdincer.sorting.util;

import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SortingTestHelper {

    public static <T> void measureAverageTime(Runnable runnable, int times) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
        }

        long durationMillis = 0;

        for (int i = 0; i < times; i++) {
            Instant start = Instant.now();
            runnable.run();
            Instant end = Instant.now();
            long currentDuration = end.toEpochMilli() - start.toEpochMilli();
            durationMillis += currentDuration;
            System.out.printf("Time taken for iteration %d: %d ms%n", i + 1, currentDuration);
        }

        double averageTimeTaken = (double) durationMillis / times;


        System.out.printf("Average time taken for %d runs: %f ms%n", times, averageTimeTaken);
    }

    public static <T> T measureTimeAndReturnResult(Supplier<T> supplier) {
        Instant start = Instant.now();
        T result = supplier.get();
        Instant end = Instant.now();

        long durationMillis = end.toEpochMilli() - start.toEpochMilli();

        System.out.println("Time taken: " + durationMillis + "ms");

        return result;
    }
}
