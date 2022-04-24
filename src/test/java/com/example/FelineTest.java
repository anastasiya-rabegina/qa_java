package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Test
    public void getKittensReturnsCorrectValue() {
        Feline feline = new Feline();
        int expectedKittens = 1;

        int actualKittens = feline.getKittens();

        Assert.assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        String actualFamily = feline.getFamily();

        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithArgsReturnsCorrectValue() {
        Feline feline = new Feline();
        int expectedKittensCount = 2;

        int actualKittensCount = feline.getKittens(2);

        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void eatMeatReturnsCorrectFood() throws Exception {
        Feline feline = spy(new Feline());
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualFoodList = feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");

        Assert.assertEquals(expectedFoodList, actualFoodList);
    }
}