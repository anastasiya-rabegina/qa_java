package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeForMaleReturnsCorrectValue () throws Exception {
        Lion lion = new Lion("Самец", feline);

        boolean actualHasMane = lion.doesHaveMane();

        Assert.assertTrue(actualHasMane);
    }

    @Test
    public void doesHaveManeForFemaleReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самка", feline);

        boolean actualHasMane = lion.doesHaveMane();

        Assert.assertFalse(actualHasMane);
    }

    @Test
    public void lionConstructionThrowException() {
        String expectedExceptionText = "Используйте допустимые значения пола животного - самей или самка";
        Exception exception = null;

        try {
            Lion lion = new Lion("Another", feline);
        } catch (Exception ex) {
            exception = ex;
        }

        Assert.assertNotNull(exception);
        Assert.assertEquals(expectedExceptionText, exception.getMessage());
    }

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittens = 1;

        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = lion.getKittens();

        Assert.assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getFoodReturnsCorrectList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedList = List.of("Трава", "Различные растения");

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Трава", "Различные растения"));
        List<String> actualList = lion.getFood();

        Assert.assertEquals(expectedList, actualList);
    }
}