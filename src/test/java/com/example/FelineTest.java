package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {


    Feline feline = new Feline();


    @Test
    public void shouldReturnMeatForEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();

        assertEquals(expectedFood, actualFood, "Метод eatMeat должен возвращать рацион хищника");
    }


    @Test
    public void shouldReturnCorrectFamily() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();

        assertEquals(expectedFamily, actualFamily, "Семейство должно быть Кошачьи");
    }


    @Test
    public void shouldReturnOneKittenByDefault() {
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();

        assertEquals(expectedKittens, actualKittens, "По умолчанию количество котят должно быть равно 1");
    }


    @Test
    public void shouldReturnCorrectKittensCount() {
        int expectedKittens = 5;
        int actualKittens = feline.getKittens(5);

        assertEquals(expectedKittens, actualKittens, "Количество котят должно совпадать с переданным значением");
    }
}
