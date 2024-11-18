package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class SpeedManagement {

    private final SpeedChangeable speedChangeable;

    @SneakyThrows
    public void change(double value) {
        speedChangeable.change(value);
    }
}
