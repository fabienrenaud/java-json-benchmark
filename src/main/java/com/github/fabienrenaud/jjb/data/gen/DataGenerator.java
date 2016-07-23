package com.github.fabienrenaud.jjb.data.gen;

/**
 * Created by frenaud on 7/23/16.
 */
public interface DataGenerator<T> {

    int populate(T obj, int size);
}
