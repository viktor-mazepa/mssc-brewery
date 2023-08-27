package com.mazasoft.msscbrewery.services.v2;

import com.mazasoft.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 save(BeerDtoV2 beerDto);

    void update(UUID beerId, BeerDtoV2 beerDto);

    void delete(UUID beerId);
}
