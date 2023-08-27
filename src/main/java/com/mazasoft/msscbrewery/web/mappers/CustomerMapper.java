package com.mazasoft.msscbrewery.web.mappers;

import com.mazasoft.msscbrewery.domain.Customer;
import com.mazasoft.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer convertDtoToCustomer(CustomerDto dto);

    CustomerDto convertCustomerToDto(Customer customer);
}
