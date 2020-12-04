package com.initialwebtech.billing.system.desktop.exception;

public abstract class CustomException extends Exception{

    private final ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    CustomException(ErrorCode errorCode) {

        super(String.valueOf(errorCode));

        this.errorCode = errorCode;
    }
}
