package com.msutar.cool.api.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginVO {
    private Integer expire;
    private Integer refreshExpire;
    private String refreshToken;
    private String token;
}
