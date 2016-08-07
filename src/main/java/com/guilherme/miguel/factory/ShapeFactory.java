package com.guilherme.miguel.factory;

/**
 * @author Miguel Guilherme
 */
public class ShapeFactory {

    /**
     * Retrieve an instance of type shape
     *
     * @param shapeType the type (CIRCLE, RECTANGLE or SQUARE)
     * @return the new Object
     */
    public Shape getShape(String shapeType) {
        switch (shapeType == null ? "" : shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }

}
