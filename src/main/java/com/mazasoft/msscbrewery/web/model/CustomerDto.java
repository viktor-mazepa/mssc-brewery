package com.mazasoft.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;

    @NotBlank(message = "Customer name should not be blank")
    @Size(min = 3, max = 100, message = "Customer name should has more than 3 symbols and less than 100 symbols")
    private String customerName;
}
