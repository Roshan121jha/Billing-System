package com.initialwebtech.billing.system.desktop.exception;

public class UnAuthorizedException extends CustomException{

    public UnAuthorizedException() {
        super(ErrorCode.UNAUTHORIZED_ACCESS);
    }
}
