package com.guilherme.miguel.builder;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsSame.sameInstance;

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
    public void vegMealShouldCost55() throws Exception {
        assertThat(vegMeal.getCost(), is(equalTo(55.0f)));
    }

    @Test
    public void nonVegMealShouldCost855() throws Exception {
        assertThat(nonVegMeal.getCost(), is(equalTo(85.5f)));
    }

}
