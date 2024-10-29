package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassportTest {

    @Test
    void shouldCreateOnlyNumberAndCountry() {
        Passport result = Passport.builder()
                .number("1234")
                .country("UA")
                .build();

        assertEquals("1234", result.getNumber());
        assertEquals("UA", result.getCountry());

        assertNull(result.getIssuer());
        assertNull(result.getExpireDate());
        assertNull(result.getIssueDate());
    }
}