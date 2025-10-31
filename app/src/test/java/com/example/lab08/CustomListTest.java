package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        assertFalse(list.hasCity(calgary), "empty list should not have Calgary");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary), "after add, list should have Calgary");
    }
/*
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edm = new City("Edmonton", "AB");
        City van = new City("Vancouver", "BC");

        list.addCity(edm);
        list.addCity(van);
        assertTrue(list.hasCity(edm));
        assertTrue(list.hasCity(van));

        assertTrue(list.deleteCity(edm), "delete should return true when city existed");
        assertFalse(list.hasCity(edm));

        //dletes non-existing (should be safe)
        assertFalse(list.deleteCity(new City("Toronto", "ON")),
                "delete should return false when city didn't exist");
        assertTrue(list.hasCity(van), "other cities remain");
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities(), "empty list count");

        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, list.countCities());

        //deleting reduces count
        list.deleteCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());


 */
    }
}