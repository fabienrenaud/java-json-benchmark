package com.github.fabienrenaud.jjb.data.gen;

public interface DataGenerator<T> {

    int populate(T obj, int size);
}
