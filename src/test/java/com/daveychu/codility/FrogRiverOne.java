package com.daveychu.codility;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FrogRiverOne {
    @Test
    public void tests() {
        assertEquals(6, solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        assertEquals(-1, solution(5, new int[]{2}));
    }

    private int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                leaves.add(A[i]);
            }
            if (leaves.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
