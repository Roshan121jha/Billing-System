package com.initialwebtech.billing.system.desktop.exception;

public enum ErrorCode {


    /**
     * Error-codes.
     */
    UNKNOWN,
    /*
    {@code: UNAUTHORIZED_ACCESS}
     */
    UNAUTHORIZED_ACCESS,
    /*
  {@code: USER_NOT_FOUND}
   */
    USER_NOT_FOUND;

    private String servicePrefix = "BILLSRVC";

    public String code() {

        StringBuilder errorCode = new StringBuilder();
        // @formatter:off
        errorCode
                .append(this.servicePrefix)
                .append('.')
                .append(this);
        // @formatter:on
        return errorCode.toString();
    }
}
