package com.msutar.cool.api.controller;

import com.msutar.cool.api.common.annotation.Limit;
import com.msutar.cool.api.common.entity.CommonConstant;
import com.msutar.cool.api.common.exception.CommonException;
import com.msutar.cool.api.common.service.CaptchaService;
import com.msutar.cool.api.common.service.RedisService;
import com.msutar.cool.api.dto.LoginDTO;
import com.msutar.cool.api.vo.CaptchaVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/base/open")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OpenController {
    private final CaptchaService captchaService;
    private final RedisService redisService;

    @GetMapping("captcha")
    @Limit(key = "get_captcha", period = 60, count = 10, name = "获取验证码", prefix = "limit")
    public CaptchaVO captcha() {
        return captchaService.create();
    }

    @PostMapping("login")
    public String login(@Valid @RequestBody LoginDTO dto) {
        // 校验验证码
        String code = (String) redisService.get(CommonConstant.VALIDATE_CODE_PREFIX + dto.getCaptchaId());
        if (code == null || !code.equals(dto.getVerifyCode())) throw new CommonException("验证码错误");
        // TODO 校验账号密码

        return null;
    }


}
