package com.lichen.javabrains;

import com.lichen.javabrains.service.ShapeService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        shapeService.getCircle().setName("Li Chen's circle");
        shapeService.getCircle().setNameAndReturn("Hello");
    }
}
