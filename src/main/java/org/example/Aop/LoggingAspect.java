package org.example.Aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 切面
@Aspect
@Component
public class LoggingAspect {

/*
 * 通知
 * execution(* org.example.service.*.*(..)) -> 切点的定义式，定义了匹配的连接点
 */
    @Before("execution(* org.example.service.*.*(..))")
//    在方法开始前输出日志信息
    public void logBefore() {
        System.out.println("Method execution is about to start.");
    }

    /*除了捕获连接点外还要关注返回值*/
    @AfterReturning(pointcut = "execution(* org.example.service.*.*(..))", returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("Method executed successfully. Result: " + result);
    }

    @AfterThrowing(pointcut = "execution(* org.example.service.*.*(..))", throwing = "exception")
    public void logAfterThrowing(Exception exception) {
        System.out.println("Method threw an exception: " + exception.getMessage());
    }
}
