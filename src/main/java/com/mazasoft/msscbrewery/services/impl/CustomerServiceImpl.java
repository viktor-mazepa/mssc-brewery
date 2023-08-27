package com.mazasoft.msscbrewery.services.impl;

import com.mazasoft.msscbrewery.services.CustomerService;
import com.mazasoft.msscbrewery.web.model.CustomerDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Test Customer")
                .build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID()).build();
    }

    @Override
    public void update(UUID customerId, CustomerDto customerDto) {
        log.debug("CustomerServiceImpl.update: customerId = " + customerId);
        log.debug("CustomerServiceImpl.update: customerDto = " + customerDto);
    }

    @Override
    public void delete(UUID customerId) {
        log.debug("CustomerServiceImpl.delete: customerId = " + customerId);
    }
}
