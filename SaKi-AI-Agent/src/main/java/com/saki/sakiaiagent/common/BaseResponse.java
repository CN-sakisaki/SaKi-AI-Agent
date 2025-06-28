package com.saki.sakiaiagent.common;

import com.saki.sakiaiagent.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * 响应结果类
 * @author sakisaki
 * @date 2025/6/27 17:17
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}


