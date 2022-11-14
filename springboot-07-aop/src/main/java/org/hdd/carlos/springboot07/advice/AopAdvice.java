package org.hdd.carlos.springboot07.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Aspect
public class AopAdvice {

    // public 返回类型 包路径.方法(..)
    @Pointcut("execution (* org.hdd.carlos.springboot07.controller.*.*(..))")
    public void aopLog(){
    }

    @Before("aopLog()")
    public void beforeAdvice() {
        System.out.println("Before Advice aopLog()");
    }

    @After("aopLog()")
    public void afterAdvice() {
        System.out.println("After Advice aopLog()");
    }

    @Around("aopLog()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("Around[Before] Advice aopLog()");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Exception in Around");
        }
        System.out.println("Around[After] Advice aopLog()");
    }

    @AfterReturning(pointcut = "aopLog()", returning = "retObj")
    public void afterReturnAdvice(Object retObj) {
        System.out.println(Optional.ofNullable(retObj).map(Object::toString).orElse("null"));
    }
}
