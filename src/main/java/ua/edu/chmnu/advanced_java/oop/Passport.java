package ua.edu.chmnu.advanced_java.oop;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Passport {

    private String number;

    private String issuer;

    private LocalDate issueDate;

    private LocalDate expireDate;

    private String country;

    public static PassportBuilder builder() {
        return new PassportBuilder();
    }

    public static class PassportBuilder {
        private String number;
        private String issuer;
        private LocalDate issueDate;
        private LocalDate expireDate;
        private String country;

        PassportBuilder() {
        }

        public PassportBuilder number(String number) {
            this.number = number;
            return this;
        }

        public PassportBuilder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        public PassportBuilder issueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public PassportBuilder expireDate(LocalDate expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        public PassportBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Passport build() {
            return new Passport(this.number, this.issuer, this.issueDate, this.expireDate, this.country);
        }

        public String toString() {
            return "Passport.PassportBuilder(number=" + this.number + ", issuer=" + this.issuer + ", issueDate=" + this.issueDate + ", expireDate=" + this.expireDate + ", country=" + this.country + ")";
        }
    }
}
