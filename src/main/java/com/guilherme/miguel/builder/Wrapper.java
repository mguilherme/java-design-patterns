package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }

    @Override
    public boolean equals(Object obj) {
        Wrapper wrapper = (Wrapper) obj;
        return wrapper.pack().equals(pack());
    }
}
