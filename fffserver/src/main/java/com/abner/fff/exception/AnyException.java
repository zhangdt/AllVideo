package com.abner.fff.exception;


import com.abner.fff.constant.ExceptionEnum;

/**
 * 统一异常
 */
public class AnyException extends RuntimeException {

    public AnyException(ExceptionEnum exceptionEnum){
        super(exceptionEnum.getMessage());
    }

    public AnyException(String message){
        super(message);
    }

}
