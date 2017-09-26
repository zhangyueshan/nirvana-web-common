package com.nirvana.web.common.api;

public class ApiResponseUtils {

    public static <T> ApiResponse<T> response(String resultCode, String resultMsg, T data) {
        return new ApiResponse<>(resultCode, resultMsg, data);
    }

    public static <T> ApiResponse<T> response(Result result, T data) {
        return response(result.getCode(), result.getDesc(), data);
    }

    public static <T> ApiResponse<T> response(Result result) {
        return response(result.getCode(), result.getDesc(), null);
    }

    public static <T> ApiResponse<T> success(T data) {
        return response(Result.SUCCESS, data);
    }

    public static <T> ApiResponse<T> success() {
        return success(null);
    }

    public static <T> ApiResponse<T> failure(String msg) {
        return response(Result.FAILURE.getCode(), msg, null);
    }

    public static <T> ApiResponse<T> failure() {
        return response(Result.FAILURE.getCode(), Result.FAILURE.getDesc(), null);
    }

}
