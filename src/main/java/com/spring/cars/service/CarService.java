package com.spring.cars.service;

import com.spring.cars.domain.Car;
import com.spring.cars.exception.CarNotFoundException;

import java.util.List;

public interface CarService {
    List<Car> findAll();
    Car findCar(long id) throws CarNotFoundException;
}