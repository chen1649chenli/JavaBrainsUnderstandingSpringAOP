package com.lichen.javabrains.model;

public class Circle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setNameAndReturn (String name) {
        return name + " World!";
    }

}
