package ua.edu.chmnu.advanced_java.files;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car implements Serializable {

    private static final long SerialVersionUID = 10L;

    private transient int id;

    private int year;

    private String model;

    private double price;
}
