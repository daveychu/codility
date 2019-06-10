package com.daveychu.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmp {
    @Test
    public void tests() {
        assertEquals(3, solution(10, 85, 30));
    }

    private int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
