package ua.edu.chmnu.advanced_java.oop;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Passport {

    private String number;

    private String issuer;

    private LocalDate issueDate;

    private LocalDate expireDate;

    private String country;
}
