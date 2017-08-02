package com.nirvana.web.common.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("接口响应数据结构")
public class ApiResponse<T> {

    @ApiModelProperty(value = "状态码", required = true)
    private String resultCode;

    @ApiModelProperty("响应消息")
    private String message;

    @ApiModelProperty("响应结果数据")
    private T data;

    public ApiResponse() {
    }

    public ApiResponse(String resultCode, String message, T data) {
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
