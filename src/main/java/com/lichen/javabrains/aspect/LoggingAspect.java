package com.lichen.javabrains.aspect;

import com.lichen.javabrains.model.Circle;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(public String getName())")
    void LoggingAdvice() {
        System.out.println("Advice run. Get Method called");
    }
}
