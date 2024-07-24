package com.usp.banking.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ErrorResponse {

    private String errCode;
    private String errMessage;
    private String details;
    private LocalDateTime errDateTime;

    public ErrorResponse(String errCode,String msg,String details){
        this.errCode = errCode;
        this.errMessage = msg;
        this.details = details;
    }

    public ErrorResponse(String errCode,String msg){
        this.errCode = errCode;
        this.errMessage = msg;
    }

    public ErrorResponse(String errCode){
        this.errCode = errCode;
    }
}
