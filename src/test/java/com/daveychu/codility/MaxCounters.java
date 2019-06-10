package com.daveychu.codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxCounters {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    private int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int aggregatedMaxCounter = 0;
        int currentMaxCounter = 0;

        for (int i : A) {
            int zeroIndexedInteger = i - 1;
            if (zeroIndexedInteger < N) {
                counters[zeroIndexedInteger]++;
                if (counters[zeroIndexedInteger] > currentMaxCounter) {
                    currentMaxCounter = counters[zeroIndexedInteger];
                }
            } else if (currentMaxCounter > 0) {
                aggregatedMaxCounter += currentMaxCounter;
                currentMaxCounter = 0;
                counters = new int[N];
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] += aggregatedMaxCounter;
        }

        return counters;
    }
}
