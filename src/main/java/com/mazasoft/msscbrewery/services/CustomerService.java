package com.mazasoft.msscbrewery.services;

import com.mazasoft.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

    CustomerDto save(CustomerDto customerDto);

    void update(UUID customerId, CustomerDto customerDto);

    void delete (UUID customerId);
}
