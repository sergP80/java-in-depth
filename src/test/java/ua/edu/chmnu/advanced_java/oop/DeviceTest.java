package ua.edu.chmnu.advanced_java.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    private static final String name = "D1";
    private static final String type = "T1";

    @Test
    void shouldCreateInstance() {

        Device device = Device.getDevice(name, type);

        assertNotNull(device);
    }

    @Test
    void shouldCreateOnly1Instance() {

        Device device1 = Device.getDevice(name, type);

        Device device2 = Device.getDevice(name, type);

        assertEquals(device1, device2);
    }
}