package com.dokstudio.springboot2study.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: HeChengyao
 * @date: 2021/7/21 16:43
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 自定义异常处理
     *
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(MyException.class)
    public ResponseEntity<ErrorResponse> myErrorHandler(HttpServletRequest request, MyException e) {
        LOGGER.error(e.getMessage(), e);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setError(e.getError());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setStatus(e.getStatus());
        errorResponse.setPath(request.getRequestURI());
        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(e.getStatus()));
    }

    public ResponseEntity<ErrorResponse> commonErrorHAndler(HttpServletRequest request, Exception e) {
        LOGGER.error(e.getMessage(), e);
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setTimestamp(System.currentTimeMillis());
        errorResponse.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponse.setPath(request.getRequestURI());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
