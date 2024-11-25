package ua.edu.chmnu.advanced_java.oop.interfaces;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StandardFuncInterfaces {

    public static <S> S[] processBy(S[] source, Predicate<S> predicate) {
        return processBy(source, predicate, Function.identity());
    }

    public static <S, T> T[] processBy(S[] source, Predicate<S> predicate, Function<S, T> mapper) {
        T[] target = (T[]) new Object[source.length];

        int counter = 0;

        for(var i : source) {
            if (predicate.test(i)) {
                target[counter++] = mapper.apply(i);
            }
        }

        if (counter > 0 && counter < source.length) {
            T[] temp = (T[])new Object[counter];

            System.arraycopy(target, 0, temp, 0, counter);

            target = temp;
        }

        return target;
    }

    public static Person[] filterPersonBy(Person[] source, Predicate<Person> predicate, UnaryOperator<Person> mapper) {
        Person[] target = new Person[source.length];

        int counter = 0;

        for(var i : source) {
            if (predicate.test(i)) {
                target[counter++] = mapper.apply(i);
            }
        }

        if (counter > 0 && counter < source.length) {
            Person[] temp = new Person[counter];

            System.arraycopy(target, 0, temp, 0, counter);

            target = temp;
        }

        return target;
    }

    public static String[] processPersonNames(Person[] source, Predicate<Person> predicate, Function<Person, String> mapper) {
        String[] target = new String[source.length];

        int counter = 0;

        for(var i : source) {
            if (predicate.test(i)) {
                target[counter++] = mapper.apply(i);
            }
        }

        if (counter > 0 && counter < source.length) {
            String[] temp = new String[counter];

            System.arraycopy(target, 0, temp, 0, counter);

            target = temp;
        }

        return target;
    }

    public static String[] intToStringWith(int[] source, Predicate<Integer> predicate, Function<Integer, String> mapper) {
        String[] target = new String[source.length];

        int counter = 0;

        for(var i : source) {
            if (predicate.test(i)) {
                target[counter++] = mapper.apply(i);
            }
        }

        if (counter > 0 && counter < source.length) {
            String[] temp = new String[counter];

            System.arraycopy(target, 0, temp, 0, counter);

            target = temp;
        }

        return target;
    }

    public static double[] doubleToStringWith(int[] source, Predicate<Integer> predicate, Function<Integer, Double> mapper) {
        double[] target = new double[source.length];

        int counter = 0;

        for(var i : source) {
            if (predicate.test(i)) {
                target[counter++] = mapper.apply(i);
            }
        }

        if (counter > 0 && counter < source.length) {
            double[] temp = new double[counter];

            System.arraycopy(target, 0, temp, 0, counter);

            target = temp;
        }

        return target;
    }

    public static void main(String[] args) {
        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        Function<Integer, String> stringMapper = i -> "*".repeat(i);

        Consumer<String> consumer = s ->
                System.out.println(s.length());

        int[] source = {4, 5, 8, 11, 15, 22};

        String[] result = intToStringWith(source, i -> i % 2 == 0, i -> "*".repeat(i));

        System.out.println(Arrays.toString(result));

        for(var i: result) {
            consumer.accept(i);
        }
    }
}
