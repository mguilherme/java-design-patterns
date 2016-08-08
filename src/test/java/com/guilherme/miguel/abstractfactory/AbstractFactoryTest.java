package com.guilherme.miguel.abstractfactory;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * @author Miguel Guilherme
 */
public class AbstractFactoryTest {

    private AbstractFactory shapeFactory;
    private AbstractFactory colorFactory;

    @Before
    public void setUp() throws Exception {
        shapeFactory = FactoryProducer.getFactory("SHAPE");
        colorFactory = FactoryProducer.getFactory("COLOR");
    }

    @Test
    public void shouldBeShapeFactoryInstance() throws Exception {
        assertThat(shapeFactory, is(instanceOf(ShapeFactory.class)));
    }

    @Test
    public void shouldBeColorFactoryInstance() throws Exception {
        assertThat(colorFactory, is(instanceOf(ColorFactory.class)));
    }

    @Test
    public void shouldCreateCircleInstance() throws Exception {
        Shape circle = shapeFactory.getShape("CIRCLE");

        assertThat(circle, is(instanceOf(Circle.class)));
        assertThat(circle.draw(), is(equalTo("Circle::draw() method.")));
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
    public void shouldCreateRedInstance() throws Exception {
        Color red = colorFactory.getColor("RED");

        assertThat(red, is(instanceOf(Red.class)));
        assertThat(red.fill(), is(equalTo("Red::fill() method.")));
    }

    @Test
    public void shouldCreateGreenInstance() throws Exception {
        Color green = colorFactory.getColor("GREEN");

        assertThat(green, is(instanceOf(Green.class)));
        assertThat(green.fill(), is(equalTo("Green::fill() method.")));
    }

    @Test
    public void shouldCreateBlueInstance() throws Exception {
        Color blue = colorFactory.getColor("BLUE");

        assertThat(blue, is(instanceOf(Blue.class)));
        assertThat(blue.fill(), is(equalTo("Blue::fill() method.")));
    }

}
