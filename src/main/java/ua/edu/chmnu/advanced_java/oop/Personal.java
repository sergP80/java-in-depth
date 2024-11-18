package ua.edu.chmnu.advanced_java.oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Personal implements BirthDateSupport {
    private static final DateTimeFormatter BIRTH_DATE_FORMATTER = DateTimeFormatter.ofPattern(BIRTH_DATE_FORMAT);

    private String name;

    private double weight;

    private LocalDate birthDate;

    @Override
    public LocalDate birthDate() {
        return birthDate;
    }

    @Override
    public void birthDate(String source) {
        LocalDate bd = LocalDate.parse(source, BIRTH_DATE_FORMATTER);

        setBirthDate(bd);
    }
}
