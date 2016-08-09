package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
    public boolean equals(Object obj);
}
