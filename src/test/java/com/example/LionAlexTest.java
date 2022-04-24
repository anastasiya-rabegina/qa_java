package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class LionAlexTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnsZero() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);

        int actualAmount = lionAlex.getKittens();
        Assert.assertEquals(0, actualAmount);
    }

    @Test
    public void getFriendsReturnsCorrectValue() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expectedList = List.of("Марти, Глория, Мелман");

        List<String> actualList = lionAlex.getFriends();

        Assert.assertEquals(expectedList, actualList);
    }


    @Test
    public void getPlaceOfLivingReturnsCorrectValue() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expectedString = "Нью-Йоркский зоопарк";

        String actualString = lionAlex.getPlaceOfLiving();

        Assert.assertEquals(expectedString, actualString);

    }
}