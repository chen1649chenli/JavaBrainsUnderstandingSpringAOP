package com.lichen.javabrains.service;

import com.lichen.javabrains.aspect.Loggable;
import com.lichen.javabrains.model.Circle;
import com.lichen.javabrains.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;

    @Loggable
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
