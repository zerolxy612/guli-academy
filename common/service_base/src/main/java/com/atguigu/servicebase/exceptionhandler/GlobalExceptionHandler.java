package com.atguigu.servicebase.exceptionhandler;

import com.atguigu.commonutils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    // 指定出现什么异常会出现这个方法
    @ExceptionHandler(Exception.class)
    @ResponseBody // 为了返回数据
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("执行了全局异常处理...");
    }

}
