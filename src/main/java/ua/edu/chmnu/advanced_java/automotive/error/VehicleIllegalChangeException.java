package ua.edu.chmnu.advanced_java.automotive.error;

import lombok.Getter;

@Getter
public class VehicleIllegalChangeException extends Exception {

    private final double delta;

    public VehicleIllegalChangeException(double delta) {
        this.delta = delta;
    }

    public VehicleIllegalChangeException(String message, double delta) {
        super(message);
        this.delta = delta;
    }

    public VehicleIllegalChangeException(String message, Throwable cause, double delta) {
        super(message, cause);
        this.delta = delta;
    }

    public VehicleIllegalChangeException(Throwable cause, double delta) {
        super(cause);
        this.delta = delta;
    }

    public VehicleIllegalChangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, double delta) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.delta = delta;
    }

}
