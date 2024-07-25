package com.usp.banking.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AddressDto {

    private Long addrId;

    private String addrLine1;

    private String addrLine2;

    private String city;

    private String country;

    private String zipCode;

    private String addrType;

    private String custNum;

    private int status;
}
