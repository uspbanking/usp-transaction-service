package com.usp.banking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "TS_ADDRESS_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TsAddressDetails extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addrId;
    @Column(name = "addr_line1")
    private String addrLine1;
    @Column(name = "addr_line2")
    private String addrLine2;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "zipcode")
    private String zipCode;
    @Column(name = "addr_type")
    private String addrType;

    @Column(name = "cust_num")
    private String custNum;
    @Column(name = "status")
    private int status;
}
