package com.guilherme.miguel.factory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * @author Miguel Guilherme
 */
public class FactoryTest {

    private ShapeFactory shapeFactory;

    @Before
    public void setUp() throws Exception {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void shouldNotCreateInstance() throws Exception {
        Shape noShape = shapeFactory.getShape(null);
        assertThat(noShape, is(equalTo(null)));
    }

    @Test
    public void shouldCreateRectangleInstance() throws Exception {
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        assertThat(rectangle, is(instanceOf(Rectangle.class)));
        assertThat(rectangle.draw(), is(equalTo("Rectangle::draw() method.")));
    }

    @Test
    public void shouldCreateSquareInstance() throws Exception {
        Shape square = shapeFactory.getShape("SQUARE");

        assertThat(square, is(instanceOf(Square.class)));
        assertThat(square.draw(), is(equalTo("Square::draw() method.")));
    }

    @Test
    public void shouldCreateCircleInstance() throws Exception {
        Shape circle = shapeFactory.getShape("CIRCLE");

        assertThat(circle, is(instanceOf(Circle.class)));
        assertThat(circle.draw(), is(equalTo("Circle::draw() method.")));
    }

}
