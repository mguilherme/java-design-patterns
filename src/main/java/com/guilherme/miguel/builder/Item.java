package com.guilherme.miguel.builder;

/**
 * @author Miguel Guilherme
 */
public interface Item {
    String name();
    Packing packing();
    float price();
    boolean equals(Object obj);
}
