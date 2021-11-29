package edu.kit.informatik.core;

import java.util.Objects;

/**
 * This data structure implements a data tuple
 *
 * @param <E> data type of first element
 * @param <T> data type of second element
 * @author Thomas Marwitz
 * @version 1.0
 */
public class Tuple<E, T> {

    private static final String TO_STRING_FORMATTING_TEMPLATE = "%s %s";

    private final E first;
    private final T second;

    /**
     * Create a triple with arbitrary datatypes
     *
     * @param first the first element
     * @param second the second element
     */
    public Tuple(E first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Getter method for the first element
     *
     * @return the first element
     */
    public E getFirst() {
        return first;
    }

    /**
     * Getter method for the second element
     *
     * @return the second element
     */
    public T getSecond() {
        return second;
    }

    /**
     * Nice formatted string representation
     *
     * @return a string representation of the tuple
     */
    @Override
    public String toString() {
        return String.format(TO_STRING_FORMATTING_TEMPLATE, first, second);
    }

    /**
     * Overridden equals method so that we can use a tuple as hashmap key
     *
     * @param o another object
     * @return -1, 0, 1 depending on comparison result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(first, tuple.first) && Objects.equals(second, tuple.second);
    }

    /**
     * Overridden hashcode method so that we can use a tuple as hashmap key
     *
     * @return the hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}

