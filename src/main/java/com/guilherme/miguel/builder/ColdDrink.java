package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

//    @Override
//    public abstract float price();

    @Override
    public boolean equals(Object obj) {
        Item coldDrink = (Item) obj;
        return coldDrink.name().equals(name())
                && coldDrink.price() == price()
                && coldDrink.packing().equals(packing());
    }
}
