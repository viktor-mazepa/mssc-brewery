package com.mazasoft.msscbrewery.services.impl;

import com.mazasoft.msscbrewery.services.BeerService;
import com.mazasoft.msscbrewery.web.model.BeerDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Lvivske")
                .beerStyle("Dark")
                .build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID()).build();
    }

    @Override
    public void update(UUID beerId, BeerDto beerDto) {
        log.debug("BeerServiceImpl.update: beerId = " + beerId);
        log.debug("BeerServiceImpl.update: beerDto = " + beerDto);
    }

    @Override
    public void delete(UUID beerId) {
        log.debug("BeerServiceImpl.delete: beerId = " + beerId);
    }
}
