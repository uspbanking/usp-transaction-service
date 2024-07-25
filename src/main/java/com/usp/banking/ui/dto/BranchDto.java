package com.usp.banking.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BranchDto extends BaseObject{

    private Long seqId;

    private String branchCode;

    private String ifsc;

    private int status;

    private AddressDto address;
}
