package com.ych.model;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 将程序中的异常信息转换为http状态吗，在响应中抛出
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "spittle Not Found")
public class SpittleNotFoundException extends Exception{

}
