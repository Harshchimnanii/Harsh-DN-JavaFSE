package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");

        try {
            // Hands-on 1: Get All Countries
            testGetAllCountries();

            // Hands-on 6: Find Country by Code
            testFindCountryByCode();

            // Hands-on 7: Add a new Country
            testAddCountry();

            // Hands-on 8: Update Country
            testUpdateCountry();

            // Hands-on 9: Delete Country
            testDeleteCountry();

        } catch (Exception e) {
            LOGGER.error("Error occurred: ", e);
        }
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start: testGetAllCountries");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End: testGetAllCountries");
    }

    private static void testFindCountryByCode() throws CountryNotFoundException {
        LOGGER.info("Start: testFindCountryByCode");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country:{}", country);
        LOGGER.info("End: testFindCountryByCode");
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start: testAddCountry");
        Country newCountry = new Country("SL", "Sri Lanka");
        countryService.addCountry(newCountry);

        Country fetchedCountry = countryService.findCountryByCode("SL");
        LOGGER.debug("Added Country:{}", fetchedCountry);
        LOGGER.info("End: testAddCountry");
    }

    private static void testUpdateCountry() throws CountryNotFoundException {
        LOGGER.info("Start: testUpdateCountry");
        countryService.updateCountry("SL", "Sri Lanka Updated");

        Country fetchedCountry = countryService.findCountryByCode("SL");
        LOGGER.debug("Updated Country:{}", fetchedCountry);
        LOGGER.info("End: testUpdateCountry");
    }

    private static void testDeleteCountry() {
        LOGGER.info("Start: testDeleteCountry");
        countryService.deleteCountry("SL");
        LOGGER.debug("Deleted Country with code SL");
        LOGGER.info("End: testDeleteCountry");
    }
}