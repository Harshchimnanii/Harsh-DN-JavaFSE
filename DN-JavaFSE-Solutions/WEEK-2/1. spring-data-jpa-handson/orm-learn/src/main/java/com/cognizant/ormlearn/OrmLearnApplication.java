package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.CountryService;
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
        CountryRepository countryRepository = context.getBean(CountryRepository.class);
        StockRepository stockRepository = context.getBean(StockRepository.class);

        LOGGER.info("Inside main");

        try {
            // ==========================================
            // MODULE 1: CRUD OPERATIONS (Purana Code Safe Hai)
            // (Commented out so they don't insert duplicates on every run)
            // ==========================================
            // testGetAllCountries();
            // testFindCountryByCode();
            // testAddCountry();
            // testUpdateCountry();
            // testDeleteCountry();



            // --- Hands-on 1 Tests (Country Query Methods) ---
            LOGGER.info("1. Countries containing 'ou' in Ascending order:");
            List<Country> ouCountries = countryRepository.findByNameContainingOrderByNameAsc("ou");
            LOGGER.debug("Countries: {}", ouCountries);

            LOGGER.info("2. Countries starting with 'Z':");
            List<Country> zCountries = countryRepository.findByNameStartingWith("Z");
            LOGGER.debug("Countries: {}", zCountries);

            // --- Hands-on 2 Tests (Stock Query Methods) ---
            LOGGER.info("3. Google stocks where close price > 1250:");
            stockRepository.findByCodeAndCloseGreaterThan("GOOGL", 1250.0).forEach(stock -> LOGGER.debug(stock.toString()));

            LOGGER.info("4. Top 3 FB stocks by Volume:");
            stockRepository.findTop3ByCodeOrderByVolumeDesc("FB").forEach(stock -> LOGGER.debug(stock.toString()));

            LOGGER.info("5. Lowest 3 NFLX stocks by Close price:");
            stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX").forEach(stock -> LOGGER.debug(stock.toString()));

        } catch (Exception e) {
            LOGGER.error("Error occurred: ", e);
        }
    }

}