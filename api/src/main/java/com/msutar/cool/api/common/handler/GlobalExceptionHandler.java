package com.msutar.cool.api.common.handler;


import cn.dev33.satoken.exception.NotLoginException;
import com.msutar.cool.api.common.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotLoginException.class)
    public Response<String> notLoginException(NotLoginException e) {
        log.error("NotLoginException ex={}", e.getMessage(), e);
        return Response.fail(e.getMessage());
    }
}
