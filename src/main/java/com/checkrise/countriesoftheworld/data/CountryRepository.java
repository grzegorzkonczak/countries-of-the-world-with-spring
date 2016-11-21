package com.checkrise.countriesoftheworld.data;

import com.checkrise.countriesoftheworld.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

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
        for(Country country : ALL_COUNTRIES){
            if (country.getName().toLowerCase().equals(name.toLowerCase())){
                return country;
            }
        }
        return null;
    }

}
