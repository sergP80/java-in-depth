package ua.edu.chmnu.advanced_java.oop.interfaces;

import java.util.Arrays;

public class PersonProcessor {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("John Doe", "22.01.1992"),
                new Person("Alex Grinch", "03.12.1985"),
                new Person("Avram Vachovsky", "26.07.2001"),
        };

        {
            Person[] result = StandardFuncInterfaces.processBy(persons, p -> p.age() <= 30);

            System.out.println(Arrays.toString(result));

        }

        {
            Person[] peopleLess30 = StandardFuncInterfaces.processBy(persons, p -> p.getName().startsWith("A"));

            System.out.println(Arrays.toString(peopleLess30));
        }

    }
}
