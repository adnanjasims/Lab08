package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private final List<City> cities;
    public CustomList() {
        this.cities = new ArrayList<>();
    }
    public void addCity(City city) {
        cities.add(city);
    }
    /** true if the list already contains this city */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /** remove a city if present; returns true if removed, false if not found */
    public boolean deleteCity(City city) {
        return cities.remove(city);
    }

    /** number of cities in the list */
    public int countCities() {
        return cities.size();
    }
}
