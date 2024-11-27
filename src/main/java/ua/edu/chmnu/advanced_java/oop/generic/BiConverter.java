package ua.edu.chmnu.advanced_java.oop.generic;

import java.util.function.BiFunction;

@FunctionalInterface
public interface BiConverter<S1, S2, T> extends BiFunction<S1, S2, T> {

    default T convert(S1 source1, S2 source2) {
        return apply(source1, source2);
    }
}
