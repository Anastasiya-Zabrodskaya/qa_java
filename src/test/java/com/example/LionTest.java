package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;


    @Test
    public void shouldThrowExceptionForInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Оно", feline);
        });

        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedMessage, exception.getMessage());
    }


    @Test
    public void shouldReturnCorrectKittensCount() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);

        int actualKittens = lion.getKittens();
        assertEquals(3, actualKittens, "Количество львят должно соответствовать данным из Feline");
    }


    @Test
    public void shouldReturnCorrectFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);

        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood, "Рацион льва должен соответствовать рациону хищника");
    }
}
