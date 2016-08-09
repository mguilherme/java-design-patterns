package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public abstract  class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

//    @Override
//    public abstract float price();

    @Override
    public boolean equals(Object obj) {
        Item burger = (Item) obj;
        return burger.name().equals(name())
                && burger.price() == price()
                && burger.packing().equals(packing());
    }

}
