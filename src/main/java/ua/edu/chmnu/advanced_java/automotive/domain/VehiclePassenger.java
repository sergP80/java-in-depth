package ua.edu.chmnu.advanced_java.automotive.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class VehiclePassenger {

    private final int maxCount;

    private int count;

    public void change(int delta) {
        this.count += delta;
    }
}
