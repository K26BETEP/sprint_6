package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, new Feline().eatMeat());
    }

    @Test
    public void getFoodPredatorReturnsPredatorFood() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, new Feline().getFood("Хищник"));
    }

    @Test
    public void getFoodHerbivoreReturnsGrass() throws Exception {
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals(expected, new Feline().getFood("Травоядное"));
    }

    @Test
    public void getFoodUnknownKindThrowsException() {
        assertThrows(Exception.class, () -> new Feline().getFood("Неизвестное"));
    }

    @Test
    public void getKittensReturnsOne() {
        assertEquals(1, new Feline().getKittens());
    }

    @Test
    public void getFamilyReturnsCats() {
        assertEquals("Кошачьи", new Feline().getFamily());
    }
}

