package com.daveychu.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGap {
    @Test
    public void tests() {
        assertEquals(2, solution(9));
        assertEquals(4, solution(529));
        assertEquals(1, solution(20));
        assertEquals(0, solution(15));
        assertEquals(0, solution(32));
    }

    private int solution(int N) {
        int currentBinaryGap = 0;
        int longestBinaryGap = 0;

        String[] splitBinaryString = Integer.toBinaryString(N).split("");
        for (String s : splitBinaryString) {
            if ("0".equals(s)) {
                currentBinaryGap++;
            } else if ("1".equals(s)) {
                if (longestBinaryGap < currentBinaryGap) {
                    longestBinaryGap = currentBinaryGap;
                }
                currentBinaryGap = 0;
            }
        }
        return longestBinaryGap;
    }
}
