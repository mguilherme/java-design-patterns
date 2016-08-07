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
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
