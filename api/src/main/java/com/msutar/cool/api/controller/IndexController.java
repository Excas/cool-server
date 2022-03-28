package com.msutar.cool.api.controller;

import com.msutar.cool.api.common.annotation.Limit;
import com.msutar.cool.api.common.properties.CaptchaProperties;
import com.msutar.cool.api.common.service.CaptchaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("index")
@Api(tags = "首页")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class IndexController {

    private final CaptchaService captchaService;

    @GetMapping
    @ApiOperation(value = "hello", notes = "hello")
    public String index () {
        return "hello j";
    }

    @GetMapping("captcha")
    @Limit(key = "get_captcha", period = 60, count = 10, name = "获取验证码", prefix = "limit")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        captchaService.create(request, response);

    }
}
