package com.mazasoft.msscbrewery.services.v2.impl;

import com.mazasoft.msscbrewery.services.v2.BeerServiceV2;
import com.mazasoft.msscbrewery.web.model.v2.BeerDtoV2;
import com.mazasoft.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Lvivske")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 save(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID()).build();
    }

    @Override
    public void update(UUID beerId, BeerDtoV2 beerDto) {
        log.debug("BeerServiceImpl.update: beerId = " + beerId);
        log.debug("BeerServiceImpl.update: beerDto = " + beerDto);
    }

    @Override
    public void delete(UUID beerId) {
        log.debug("BeerServiceImpl.delete: beerId = " + beerId);
    }

}
