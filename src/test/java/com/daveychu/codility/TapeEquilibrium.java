package com.daveychu.codility;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibrium {
    @Test
    public void tests() {
        Assert.assertEquals(1, solution(new int[]{3, 1, 2, 4, 3}));
        Assert.assertEquals(0, solution(new int[]{1, 2, 3, 4, 2}));
        Assert.assertEquals(2000, solution(new int[]{-1000, 1000}));
    }

    private int solution(int[] A) {
        int part1 = A[0];
        int part2 = sum(A) - A[0];
        int minDifference = Math.abs(part1 - part2);
        for (int i = 1; i < A.length - 1; i++) {
            part1 += A[i];
            part2 -= A[i];
            int difference = Math.abs(part1 - part2);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }

    private int sum(int[] part) {
        int count = 0;
        for (int aPart : part) {
            count += aPart;
        }
        return count;
    }
}
