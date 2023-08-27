package com.mazasoft.msscbrewery.services;

import com.mazasoft.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto save(BeerDto beerDto);

    void update(UUID beerId, BeerDto beerDto);

    void delete(UUID beerId);
}
