package com.usp.banking.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseObject {

    private String createdBy;
    private String modifiedBy;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
