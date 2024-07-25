package com.usp.banking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "TS_BRANCH_DETAILS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TsBranchDetails extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seqId;
    @Column(name = "branch_code")
    private String branchCode;
    @Column(name = "ifsc_code")
    private String ifsc;
    @Column(name = "address_id")
    private long addressId;
    @Column(name = "status")
    private int status;
}
