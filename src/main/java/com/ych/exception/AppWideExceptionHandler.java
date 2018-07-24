package com.ych.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 组件类，专门处理异常。@CcontrollerAdvice已经包括了@Component注解，该类可以被定义为组件类
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    //定义处理的方法。ExceptionHandler注解定义了处理的类。
    //当有执行到定义的异常时，就会自动调用这个handler方法，做进一步的处理
    @ExceptionHandler(SpittleNotFoundException.class)
    public String mulitSpittleHandler(){
        return "error/duplicate";
    }
}
