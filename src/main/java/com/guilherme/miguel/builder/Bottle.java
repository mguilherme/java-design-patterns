package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }

    @Override
    public boolean equals(Object obj) {
        Packing bottle = (Bottle) obj;
        return bottle.pack().equals(pack());
    }
}
