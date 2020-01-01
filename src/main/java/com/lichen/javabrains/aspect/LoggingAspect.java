package com.lichen.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.JoinPoint;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    void LoggingAdvice(JoinPoint jointPoint) {
        System.out.println(jointPoint.getTarget());
    }

    @Before("args(name)")
    public void stringArgumentMethods(String name){
        System.out.println(" A method that takes string arguments has been called. And the value is: " + name);
    }


    @Pointcut("execution(public * get*())")
    public void allGetters() {};

    @Pointcut("within(com.lichen.javabrains.model.Circle)")
    public void allCircleMethods() {}

}
