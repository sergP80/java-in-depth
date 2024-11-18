package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonalTest {

    private final BirthDateSupport personal = new Personal();

    static Stream<Arguments> provideBdFixture() {
        return Stream.of(
                Arguments.of("12.01.1991", LocalDate.of(1991, 1, 12))
        );
    }

    @ParameterizedTest
    @MethodSource("provideBdFixture")
    void shouldSuccessSetupBirthDate(String bdSource, LocalDate expected) {
        personal.birthDate(bdSource);

        assertEquals(expected, personal.birthDate());
    }

    @ParameterizedTest
    @ValueSource(strings = {"22/03/1981", "15/08/1995"})
    void shouldFailSetupBirthDateWithWrongDataFormat(String bdSource) {
        assertThrows(DateTimeParseException.class, () -> personal.birthDate(bdSource));
    }
}