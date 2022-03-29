package com.msutar.cool.api.common.entity;

import lombok.Data;

@Data
public class Response<T> {

    /** 结果状态 ,具体状态码参见Response.java*/
    private int status;
    private String message;
    private T data;
    private long timestamp;


    public Response (){
        this.timestamp = System.currentTimeMillis();
    }


    public static <T> Response<T> success(T data) {
        Response<T> response = new Response<>();
        response.setStatus(1000);
        response.setMessage("success");
        response.setData(data);
        return response;
    }

    public static <T> Response<T> fail(String message) {
        Response<T> response = new Response<>();
        response.setStatus(1001);
        response.setMessage(message);
        return response;
    }
}