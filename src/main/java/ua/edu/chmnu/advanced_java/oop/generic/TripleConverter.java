package ua.edu.chmnu.advanced_java.oop.generic;

@FunctionalInterface
public interface TripleConverter<S1, S2, S3, T> {

    T convert(S1 source1, S2 source2, S3 source3);
}
