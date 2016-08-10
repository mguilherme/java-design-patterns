package com.guilherme.miguel.prototype;

/**
 * @author Miguel Guilherme
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    String draw() {
        return "Square::draw() method.";
    }
}
