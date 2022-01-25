package com.spring.cars.service;

import com.spring.cars.domain.Car;
import com.spring.cars.exception.CarNotFoundException;
import com.spring.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }
    @Override
    public Car findCar(long id) throws CarNotFoundException {
        return carRepository.findById(id)
                .orElseThrow(CarNotFoundException::new);
    }
}