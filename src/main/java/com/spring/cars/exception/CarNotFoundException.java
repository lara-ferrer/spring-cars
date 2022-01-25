package com.spring.cars.exception;

public class CarNotFoundException extends Exception {
    public CarNotFoundException(String message) {
        super(message);
    }

    public CarNotFoundException() {
        super();
    }
}
