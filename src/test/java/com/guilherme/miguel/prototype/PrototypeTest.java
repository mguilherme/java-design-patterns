package com.guilherme.miguel.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * @author Miguel Guilherme
 */
public class PrototypeTest {

    @Before
    public void setUp() throws Exception {
        ShapeCache.loadCache();
    }

    @Test
    public void shouldReturnCircleInstance() throws Exception {
        Shape clonedShape = ShapeCache.getShape("1");

        assertThat(clonedShape, is(instanceOf(Circle.class)));
        assertThat(clonedShape.getType(), is(equalTo("Circle")));
    }

    @Test
    public void shouldReturnSquareInstance() throws Exception {
        Shape clonedShape = ShapeCache.getShape("2");

        assertThat(clonedShape, is(instanceOf(Square.class)));
        assertThat(clonedShape.getType(), is(equalTo("Square")));
    }

    @Test
    public void shouldReturnRectangleInstance() throws Exception {
        Shape clonedShape = ShapeCache.getShape("3");

        assertThat(clonedShape, is(instanceOf(Rectangle.class)));
        assertThat(clonedShape.getType(), is(equalTo("Rectangle")));
    }
}
