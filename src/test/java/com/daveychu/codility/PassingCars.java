package com.daveychu.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PassingCars {
    @Test
    public void tests() {
        assertEquals(5, solution(new int[] { 0, 1, 0, 1, 1 }));
    }

    private int solution(int[] A) {
        int goingWestLeft = sum(A);
        int totalPairs = 0;
        for (int i : A) {
            if (i == 0) {
                totalPairs += goingWestLeft;
            } else if (i == 1) {
                goingWestLeft--;
            }
            if (totalPairs > 1000000000) {
                return -1;
            }
        }

        return totalPairs;
    }

    private int sum(int[] part) {
        int count = 0;
        for (int aPart : part) {
            count += aPart;
        }
        return count;
    }
}
