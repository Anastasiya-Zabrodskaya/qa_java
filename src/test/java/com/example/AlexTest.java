package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class AlexTest {

    @Mock
    Feline feline;


    @Test
    public void shouldReturnCorrectFriendsList() throws Exception {
        Alex alex = new Alex(feline);
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");

        assertEquals(expectedFriends, alex.getFriends(), "Список друзей Алекса составлен неверно");
    }


    @Test
    public void shouldReturnCorrectPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline);
        String expectedPlace = "Нью-Йоркский зоопарк";

        assertEquals(expectedPlace, alex.getPlaceOfLiving(), "Алекс должен жить в Нью-Йоркском зоопарке");
    }


    @Test
    public void shouldReturnZeroKittensForAlex() throws Exception {
        Alex alex = new Alex(feline);

        assertEquals(0, alex.getKittens(), "У Алекса не должно быть котят, метод должен возвращать 0");
    }


    @Test
    public void alexShouldHaveManeBecauseHeIsAMale() throws Exception {
        Alex alex = new Alex(feline);


        assertTrue(alex.doesHaveMane(), "Алекс — самец, у него обязательно должна быть грива");
    }
}
