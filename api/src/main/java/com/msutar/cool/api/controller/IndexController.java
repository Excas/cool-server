package com.msutar.cool.api.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
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

@RequestMapping("base")
@Api(tags = "open 接口")
@RestController
public class IndexController {


    @SaCheckLogin
    @GetMapping
    @ApiOperation(value = "hello", notes = "hello")
    public String index () {
        return "hello j";
    }

}
