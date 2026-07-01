package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class CatTest {


    @Mock
    Feline feline;


    @InjectMocks
    Cat cat;


    @Test
    public void shouldReturnCorrectSound() {
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();

        assertEquals(expectedSound, actualSound, "Кот должен говорить Мяу");
    }


    @Test
    public void shouldReturnCorrectFood() throws Exception {

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");


        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);


        List<String> actualFood = cat.getFood();


        assertEquals(expectedFood, actualFood, "Список еды кота не совпадает с ожидаемым хищным рационом");
    }
}
