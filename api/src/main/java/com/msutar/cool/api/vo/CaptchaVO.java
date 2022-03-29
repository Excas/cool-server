package com.msutar.cool.api.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaptchaVO {
    private String captchaId;
    private String data;
}
