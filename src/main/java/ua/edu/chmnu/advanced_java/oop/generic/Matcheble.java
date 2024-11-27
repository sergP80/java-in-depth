package ua.edu.chmnu.advanced_java.oop.generic;

public interface Matcheble<S1, S2> {

    boolean match(S1 source, S2 matcher);
}
