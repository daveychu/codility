package com.daveychu.codility;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class PermMissingElem {
    @Test
    public void tests() {
        assertEquals(4, solution(new int[]{2, 3, 1, 5}));
        assertEquals(1, solution(new int[]{}));
        assertEquals(1, solution(new int[]{2}));
        assertEquals(3, solution(new int[]{1, 2}));
    }

    private int solution(int[] A) {
        Arrays.sort(A);
        int expected = 1;
        for (int a : A) {
            if (a != expected) {
                return expected;
            }
            expected++;
        }
        return expected;
    }
}
