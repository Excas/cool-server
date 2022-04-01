package com.msutar.cool.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class LoginDTO implements Serializable {

    @NotNull(message = "用户名不能为 Null")
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    @NotNull(message = "密码不能为 Null")
    @NotBlank(message = "密码不能为空")
    @ApiModelProperty(value = "密码", required = true)
    private String password;

    @NotNull(message = "验证码不能为 Null")
    @NotBlank(message = "验证码不能为空")
    @ApiModelProperty(value = "验证码", required = true)
    private String verifyCode;

    @NotNull(message = "验证码id不能为 Null")
    @NotBlank(message = "验证码id不能为空")
    @ApiModelProperty(value = "验证码id", required = true)
    private String captchaId;
}
