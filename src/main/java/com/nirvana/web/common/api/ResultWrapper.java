package com.nirvana.web.common.api;

/**
 * 返回结果包装类，用于封装调用第三方服务的结果。
 */
public class ResultWrapper<T> {

    private ApiStatus status;

    private T result;

    private String resultCode;

    private String resultMsg;

    public ResultWrapper() {
    }

    public ResultWrapper(ApiStatus status, T result, String resultCode, String resultMsg) {
        this.status = status;
        this.result = result;
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public static <T> ResultWrapper<T> success(T result, String resultCode, String resultMsg) {
        return new ResultWrapper<>(ApiStatus.SUCCESS, result, resultCode, resultMsg);
    }

    public static <T> ResultWrapper<T> success(T result, String resultCode) {
        return new ResultWrapper<>(ApiStatus.SUCCESS, result, resultCode, null);
    }

    public static <T> ResultWrapper<T> success() {
        return new ResultWrapper<>(ApiStatus.SUCCESS, null, null, null);
    }

    public static <T> ResultWrapper<T> failure(String resultCode, String resultMsg) {
        return new ResultWrapper<>(ApiStatus.FAILURE, null, resultCode, resultMsg);
    }

    public static <T> ResultWrapper<T> failure(String resultCode) {
        return new ResultWrapper<>(ApiStatus.FAILURE, null, resultCode, null);
    }

    public static <T> ResultWrapper<T> failure() {
        return new ResultWrapper<>(ApiStatus.FAILURE, null, null, null);
    }

    public static <T> ResultWrapper<T> unknown() {
        return new ResultWrapper<>(ApiStatus.UNKNOWN, null, null, null);
    }

    public ApiStatus getStatus() {
        return status;
    }

    public void setStatus(ApiStatus status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
