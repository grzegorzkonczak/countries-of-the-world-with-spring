package com.checkrise.countriesoftheworld.data;

import com.checkrise.countriesoftheworld.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Grzegorz Kończak on 21.11.2016.
 */
@Component
public class CountryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Ecuador", 16144000, "Quito", Arrays.asList(
            "Spanish"
            )),
            new Country("France", 66736000, "Paris", Arrays.asList(
            "French"
            )),
            new Country("India", 1293057000, "New Delhi", Arrays.asList(
            "Hindi", "English"
            )),
            new Country("Italy", 66674003, "Rome", Arrays.asList(
            "Italian"
            )),
            new Country("Kenya", 45010056, "Nairobi", Arrays.asList(
            "English", "Kiswahili"
            ))
    );

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public Country getCountryByName(String name){
        return ALL_COUNTRIES.stream()
                .filter(country -> country.getName().toLowerCase().equals(name.toLowerCase()))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    public List<Country> getCountriesSortedByPopulation() {
        return ALL_COUNTRIES.stream().sorted((country1, country2) ->
            Integer.compare(country2.getPopulation(), country1.getPopulation()))
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesSortedByName() {
        return ALL_COUNTRIES.stream().sorted((country1, country2) ->
                country1.getName().compareTo(country2.getName()))
                .collect(Collectors.toList());
    }

}
