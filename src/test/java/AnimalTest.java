package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    @Test
    public void getFoodReturnsHerbivoreFood() throws Exception {
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals(expected, new Animal().getFood("Травоядное"));
    }

    @Test
    public void getFoodReturnsCarnivoreFood() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, new Animal().getFood("Хищник"));
    }

    @Test
    public void getFoodThrowsExceptionForUnknownKind() {
        Exception exception = assertThrows(Exception.class,
                () -> new Animal().getFood("Всеядное"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage());
    }

    @Test
    public void getFamilyReturnsCorrectFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, new Animal().getFamily());
    }

}
