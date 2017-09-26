package com.nirvana.web.common.api;

public class BaseApiException extends RuntimeException {

    private String errorCode;

    private String msg;

    public BaseApiException() {
        this(Result.FAILURE);
    }

    public BaseApiException(Result errorCode) {
        super(errorCode.getDesc());
        this.errorCode = errorCode.getCode();
        this.msg = errorCode.getDesc();
    }

    public BaseApiException(Result errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode.getCode();
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMsg() {
        return msg;
    }
}
