package com.usp.banking.exception;

public class ApplicationException extends Exception{

    private String errorcode;

    public ApplicationException(){
        super();
    }

    public ApplicationException(String message){
        super(message);
    }

    public ApplicationException(String message,String errorcode){
        super(message);
        this.errorcode = errorcode;
    }

    public ApplicationException(String message,String errorcode,Throwable ex){
        super(message,ex);
        this.errorcode = errorcode;
    }

    public String getErrorcode(){
        return this.errorcode;
    }
}
