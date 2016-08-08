package com.guilherme.miguel.abstractfactory;

/**
 * @author Miguel Guilherme
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
