package com.msutar.cool.api.controller;

import com.msutar.cool.api.common.annotation.Limit;
import com.msutar.cool.api.common.service.CaptchaService;
import com.msutar.cool.api.vo.CaptchaVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base/open")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OpenController {
    private final CaptchaService captchaService;


    @GetMapping("captcha")
    @Limit(key = "get_captcha", period = 60, count = 10, name = "获取验证码", prefix = "limit")
    public CaptchaVO captcha() {
        return captchaService.create();
    }

}
