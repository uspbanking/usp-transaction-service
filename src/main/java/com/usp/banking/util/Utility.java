package com.usp.banking.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utility {

    public String validateString(String str){
        return str != null ? str : null;
    }
}
