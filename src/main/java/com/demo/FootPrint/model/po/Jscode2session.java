package com.demo.FootPrint.model.po;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: softwork-project
 * @description: 微信临时登录凭证code换取的长期凭证
 * @author: Yyf
 * @create: 2018-11-11 19:21
 **/
@Data
public class Jscode2session implements Serializable {

    @JsonProperty("session_key")
    private String sessionKey;

    @JsonProperty("expires_in")
    private String expires_in;

    @JsonProperty("openid")
    private String openid;
}