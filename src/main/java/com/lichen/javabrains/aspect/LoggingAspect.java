package com.lichen.javabrains.aspect;

import com.lichen.javabrains.model.Circle;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters() && allModelMethods()")
    void LoggingAdvice() {
        System.out.println("Advice run. Get Method called");
    }

    @Before("allGetters()")
    void secondAdvice() {
        System.out.println("Second Advice run. Get Method called");
    }

    @Pointcut("execution(public * get*())")
    public void allGetters() {};

    @Pointcut("within(com.lichen.javabrains.model..*)")
    public void allModelMethods() {}

}
