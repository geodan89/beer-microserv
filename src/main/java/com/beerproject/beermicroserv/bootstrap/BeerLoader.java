package com.beerproject.beermicroserv.bootstrap;

import com.beerproject.beermicroserv.domain.Beer;
import com.beerproject.beermicroserv.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Flurry Beer")
                    .beerStyle("LAGER")
                    .quantityToBrew(400)
                    .minOnHand(15)
                    .upc(2387873L)
                    .price(new BigDecimal(13.45))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Space Beer")
                    .beerStyle("STOUT")
                    .quantityToBrew(350)
                    .minOnHand(11)
                    .upc(2587874L)
                    .price(new BigDecimal(11.45))
                    .build());
        }
    }
}
