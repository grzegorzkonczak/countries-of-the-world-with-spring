package com.checkrise.countriesoftheworld.controller;

import com.checkrise.countriesoftheworld.data.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Grzegorz Kończak on 21.11.2016.
 */
@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String listCountries(ModelMap modelMap){
        modelMap.put("countries", countryRepository.getAllCountries());
        return "index";
    }

    @RequestMapping("/country/{name}")
    public String country(@PathVariable String name, ModelMap modelMap){
        modelMap.put("country", countryRepository.getCountryByName(name));
        return "country";
    }

    @RequestMapping("/sort/population")
    public String listCountriesByPopulation(ModelMap modelMap){
        modelMap.put("countries", countryRepository.getCountriesSortedByPopulation());
        return "index";
    }

    @RequestMapping("/sort/name")
    public String listCountriesByName(ModelMap modelMap){
        modelMap.put("countries", countryRepository.getCountriesSortedByName());
        return "index";
    }
}
