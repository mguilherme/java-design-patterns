package com.guilherme.miguel.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * @author Miguel Guilherme
 */
public class BuilderTest {

    private MealBuilder mealBuilder;
    private Meal vegMeal;
    private Meal nonVegMeal;

    @Before
    public void setUp() throws Exception {
        mealBuilder = new MealBuilder();
        vegMeal = mealBuilder.prepareVegMeal();
        nonVegMeal = mealBuilder.prepareNonVegMeal();
    }

    @Test
    public void vegMealShouldContainTwoItems() throws Exception {
        assertThat(vegMeal.getItems(), hasSize(2));
    }

    @Test
    public void nonVegMealShouldContainTwoItems() throws Exception {
        assertThat(nonVegMeal.getItems(), hasSize(2));
    }

    @Test
    public void shouldContainVegMeal() throws Exception {
        assertThat(vegMeal.getItems(), hasItems(new VegBurger(), new Coke()));
    }

    @Test
    public void shouldContainNonVegMeal() throws Exception {
        assertThat(nonVegMeal.getItems(), hasItems(new ChickenBurger(), new Pepsi()));
    }

    @Test
    public void vegBurgerShouldCost25() throws Exception {
        assertThat((new VegBurger()).price(), is(equalTo(25.0f)));
    }

    @Test
    public void nonVegBurgerShouldCost50() throws Exception {
        assertThat((new ChickenBurger()).price(), is(equalTo(50.5f)));
    }

    @Test
    public void cokeShouldCost30() throws Exception {
        assertThat((new Coke()).price(), is(equalTo(30.0f)));
    }

    @Test
    public void pepsiShouldCost35() throws Exception {
        assertThat((new Pepsi()).price(), is(equalTo(35.0f)));
    }

    @Test
    public void vegMealShouldCost55() throws Exception {
        assertThat(vegMeal.getCost(), is(equalTo(55.0f)));
    }

    @Test
    public void nonVegMealShouldCost85And5() throws Exception {
        assertThat(nonVegMeal.getCost(), is(equalTo(85.5f)));
    }

    @Test
    public void packageShouldReturnWrapper() throws Exception {
        assertThat((new VegBurger()).packing().pack(), is(equalTo("Wrapper")));
        assertThat((new ChickenBurger()).packing().pack(), is(equalTo("Wrapper")));
    }

    @Test
    public void packageShouldReturnBottle() throws Exception {
        assertThat((new Coke()).packing().pack(), is(equalTo("Bottle")));
        assertThat((new Pepsi()).packing().pack(), is(equalTo("Bottle")));
    }
}
