package com.guilherme.miguel.prototype;

/**
 * @author Miguel Guilherme
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    String draw() {
        return "Rectangle::draw() method.";
    }
}
