package com.daveychu.codility;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class OddOccurrencesInArray {
    @Test
    public void tests() {
        assertEquals(7, solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        assertEquals(1, solution(new int[]{1}));
    }

    private int solution(int[] A) {
        Arrays.sort(A);
        int currentInt = A[0];
        int currentCount = 1;
        for (int i = 1; i < A.length; i++) {
            if (currentInt == A[i]) {
                currentCount++;
            } else if (currentCount % 2 == 1) {
                return currentInt;
            } else {
                currentInt = A[i];
                currentCount = 1;
            }
        }
        return currentInt;
    }
}
