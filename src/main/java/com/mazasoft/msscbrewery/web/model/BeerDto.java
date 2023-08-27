package com.mazasoft.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;
    @NotBlank(message = "")
    private String beerName;
    @NotBlank(message = "")
    private String beerStyle;
    @Positive
    private Long upc;

    private OffsetDateTime createdDate;

    private OffsetDateTime updatedDate;

}
