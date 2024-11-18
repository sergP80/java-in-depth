package ua.edu.chmnu.advanced_java.oop;

import java.time.LocalDate;

public interface BirthDateSupport {

    String BIRTH_DATE_FORMAT = "dd.MM.yyyy";

    LocalDate birthDate();

    void birthDate(String source);
}
