package com.mazasoft.msscbrewery.web.controller;

import com.mazasoft.msscbrewery.services.BeerService;
import com.mazasoft.msscbrewery.services.v2.BeerServiceV2;
import com.mazasoft.msscbrewery.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/beer", produces = {MediaType.APPLICATION_JSON_VALUE})
@Deprecated

public class BeerController {

    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpHeaders> createBeer(@Valid @RequestBody BeerDto beerDto) {
        BeerDto savedBeerDto = beerService.save(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedBeerDto.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@Valid @RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId) {
        beerService.update(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer (@PathVariable("beerId") UUID beerId){
        beerService.delete(beerId);
    }
}
