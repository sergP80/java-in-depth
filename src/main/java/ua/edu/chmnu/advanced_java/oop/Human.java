package ua.edu.chmnu.advanced_java.oop;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Human implements Personable {

    private Personal personal;

    private Passport passport;

    @Override
    public Personal personal() {
        return personal;
    }

    @Override
    public String identity() {
        return passport.getNumber();
    }

    public static void main(String[] args) {
        Personal personal = Personal.builder()
                .name("John Doe")
                .build();

        personal.birthDate("11.03.1991");

        Personable p = Human.builder()
                .personal(personal)
                .passport(
                        Passport.builder()
                                .number("2345221")
                                .build()
                )
                .build();

        p.personal().getName();

        System.out.println(p.identity());
    }

}
