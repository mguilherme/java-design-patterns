package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
