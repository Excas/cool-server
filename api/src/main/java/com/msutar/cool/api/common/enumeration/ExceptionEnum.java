package com.msutar.cool.api.common.enumeration;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ExceptionEnum {

    UNKNOWN_EXCEPTION("unknown_exception","未知异常"),

    SYSTEM_EXCEPTION("system_exception","系统异常"),

    PARAMETER_EXCEPTION("parameter_exception","参数异常"),

    NO_RECORD_EXCEPTION("parameter_exception","记录不存在"),

    ALREADY_EXIST_EXCEPTION("already_exist_exception","记录已存在"),

    PASSWORD_NOT_MATCH("password_not_match","账号密码不匹配"),

    ACCOUNT_NOT_EXIST("account_not_exist", "账号不存在"),

    VERIFY_CODE_NOT_MATCH("verify_code_not_match", "验证码错误"),

    AUTH_EXCEPTION("verify_code_not_match", "认证数据异常"),

    REPEAT_EXCEPTION("verify_code_not_match", "重复操作"),

    UPDATE_EXCEPTION("update_exception","数据更新异常");

    public final String code;

    public final String message;

}