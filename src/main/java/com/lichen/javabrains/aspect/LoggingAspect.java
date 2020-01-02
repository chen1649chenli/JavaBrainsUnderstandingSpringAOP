package com.lichen.javabrains.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
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

    @AfterReturning(pointcut = "args(name)", returning = "returnString")
    public void stringArgumentMethods(String name, String returnString){
        System.out.println(" A method that takes string arguments has been called. " +
                "And the return value is: " + returnString);
    }


    @Pointcut("execution(public * get*())")
    public void allGetters() {};

    @Pointcut("within(com.lichen.javabrains.model.Circle)")
    public void allCircleMethods() {}

    @Around("@annotation(com.lichen.javabrains.aspect.Loggable)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        Object object = null;
        try{
            System.out.println("Before advice");
            object = proceedingJoinPoint.proceed();
            System.out.println("After advice");
        } catch (Throwable e){
            System.out.println("After throwing");
        }
        return object;
    }
}
