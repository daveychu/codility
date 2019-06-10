package com.daveychu.codility;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PermCheck {
    @Test
    public void tests() {
        assertEquals(1, solution(new int[]{4, 1, 3, 2}));
        assertEquals(0, solution(new int[]{4, 1, 3}));
        assertEquals(1, solution(new int[]{1}));
        assertEquals(0, solution(new int[]{2}));
        assertEquals(0, solution(new int[]{2, 2}));
        assertEquals(0, solution(new int[]{1, 1, 4, 4}));
    }

    private int solution(int[] A) {
        Arrays.sort(A);
        int expected = 1;
        for (int i : A) {
            if (expected != i) {
                return 0;
            }
            expected++;
        }
        return 1;
    }
}
