package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class FelineParameterizedTest {
    private final int expectedCount;

    public FelineParameterizedTest (int expectedCount) {
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {0},
                {1},
                {11},
                {-1}
        };
    }

    @Test
    public void getKittensWithArgsReturnsCorrectValue() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expectedCount);
        Assert.assertEquals(expectedCount, actual);
    }
}