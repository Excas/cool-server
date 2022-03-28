package com.msutar.cool.api.common.exception;

import com.msutar.cool.api.common.enumeration.ExceptionEnum;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EqualsAndHashCode(callSuper = true)
public class CommonException extends RuntimeException {

    private static final long serialVersionUID = -6979901566637669960L;

    private ExceptionEnum exceptionEnum;

    private String code;

    private String message;


    public CommonException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public CommonException(String message) {
        super(message);
        this.exceptionEnum = null;
    }

    public CommonException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.message);
        this.exceptionEnum = exceptionEnum;
    }


    public CommonException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
        this.message = message;
    }

    public CommonException(ExceptionEnum exceptionEnum, Throwable throwable) {
        super(exceptionEnum.message, throwable);
        this.exceptionEnum = exceptionEnum;
    }


    /**
     * @return void
     * @description TODO 重写Throwable中printStackTrace方法，打印异常信息
     */
    // @Override
    // public void printStackTrace() {
    //     if (exceptionEnum != null) {
    //         log.info("异常代码: {}, 异常信息: {}", exceptionEnum.code, exceptionEnum.message);
    //         return;
    //     }
    //     log.info("异常代码: {}, 异常信息: {}", code, message);
    // }

}