package com.usp.banking.constant;

public enum Status {

    PREACTIVE(0),ACTIVE(1),DISABLED(2),ENABLE(3),SOFTDELETE(4);

    public final Integer value;

    private Status(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
