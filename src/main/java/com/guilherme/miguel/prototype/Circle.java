package com.guilherme.miguel.prototype;

/**
 * @author Miguel Guilherme
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    String draw() {
        return "Circle::draw() method.";
    }
}
