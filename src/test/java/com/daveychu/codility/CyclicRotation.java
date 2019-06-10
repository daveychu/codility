package com.daveychu.codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CyclicRotation {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{0, 0, 0}, solution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{1, 2, 3, 4}, solution(new int[]{1, 2, 3, 4}, 4));
        assertArrayEquals(new int[]{}, solution(new int[]{}, 1));
    }

    private int[] solution(int[] A, int K) {
        int length = A.length;
        if (length == 0) {
            return A;
        }

        int[] rotatedArray = new int[length];

        int spacesToShift = K % length;
        for (int i = 0; i < length; i++) {
            int newPosition = (i + spacesToShift) % length;
            rotatedArray[newPosition] = A[i];
        }

        return rotatedArray;
    }
}
