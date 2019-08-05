package com.xcy.shop.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * 这个类做为返回登录的状态码和token值及错误码
 */
public class LoginResult {


    //value = "状态",example = "0"
    private int status;
    //value = "token",example = "0"

    private int token;


    private String message;


    public LoginResult(int status, int token, String message) {
        this.status = status;
        this.token = token;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LoginResult{" +
                "status=" + status +
                ", token=" + token +
                ", message='" + message + '\'' +
                '}';
    }
}
