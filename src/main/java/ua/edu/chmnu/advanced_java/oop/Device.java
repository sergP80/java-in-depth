package ua.edu.chmnu.advanced_java.oop;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Device implements Serializable {


    private static Device DEVICE = null;

    private String uuid;

    private String name;

    private String type;

    private Device(String uuid, String name, String type) {
        this.uuid = uuid;
        this.name = name;
        this.type = type;
    }

    private Device(String name, String type) {
        this(null, name, type);
    }

    public static Device getDevice(String uuid, String name, String type) {
        if (DEVICE == null) {
            DEVICE = new Device(uuid, name, type);
        }

        return DEVICE;
    }

    public static Device getDevice(String name, String type) {
        return getDevice(null, name, type);
    }
}
