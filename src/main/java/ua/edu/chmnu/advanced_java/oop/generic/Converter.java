package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.function.Function;

@FunctionalInterface
public interface Converter<S, T> extends Function<S, T> {

    default T convert(S source) {
        return apply(source);
    }
}
