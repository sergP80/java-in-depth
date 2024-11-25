package ua.edu.chmnu.advanced_java.oop.interfaces;

import lombok.Data;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Data
public class Person {

    public static final String PATTERN = "dd.MM.yyyy";

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    private String name;

    private LocalDate birthDate;

    public int age() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate, FORMATTER);
    }
}
