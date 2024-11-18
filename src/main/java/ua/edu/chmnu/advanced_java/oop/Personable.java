package ua.edu.chmnu.advanced_java.oop;

@FunctionalInterface
public interface Personable {

    Personal personal();

    default String identity() {
        return personal().getName();
    }

    static Personal copy(Personal source) {
        return Personal.builder()
                .name(source.getName())
                .birthDate(source.getBirthDate())
                .weight(source.getWeight())
                .build();
    }
}
