package com.dokstudio.springboot2study.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 10:12
 */
@Data
public class MyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    private final Integer status;

    /**
     * 错误信息
     */
    private final String error;

    /**
     * 构造方法
     * @param message 错误信息
     * @param httpStatus 状态码
     */
    public MyException(String message, HttpStatus httpStatus) {
        super(message);
        this.status = httpStatus.value();
        this.error = httpStatus.name();
    }

    /**
     * 构造方法
     * @param message
     */
    public MyException(String message) {
        super(message);
        this.status = 400;
        this.error = message;
    }

}
