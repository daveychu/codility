package com.daveychu.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MissingInteger {
    @Test
    public void tests() {
        assertEquals(5, solution(new int[] { 1, 3, 6, 4, 1, 2 }));
        assertEquals(4, solution(new int[] { 1, 2, 3 }));
        assertEquals(1, solution(new int[] { -1, -3 }));
    }

    private int solution(int[] A) {
        Arrays.sort(A);
        int nextExpectedSmallestInteger = 1;

        for (int i : A) {
            if (i == nextExpectedSmallestInteger) {
                nextExpectedSmallestInteger++;
            }
        }

        return nextExpectedSmallestInteger;
    }
}
