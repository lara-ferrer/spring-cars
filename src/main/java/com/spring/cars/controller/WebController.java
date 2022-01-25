package com.spring.cars.controller;

import com.spring.cars.domain.Car;
import com.spring.cars.exception.CarNotFoundException;
import com.spring.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Car> cars = carService.findAll();
        model.addAttribute("cars", cars);
        return "index";
    }

    @RequestMapping(value = "/coches/{id}")
    public String product(Model model, @PathVariable long id) throws CarNotFoundException {
        Car car = carService.findCar(id);
        model.addAttribute("car", car);
        return "car";
    }

    @ExceptionHandler(CarNotFoundException.class)
    public String handleException(HttpServletRequest request, CarNotFoundException exception) {
        return "product_error";
    }

    @ExceptionHandler
    public String handleException(HttpServletRequest request, Exception exception) {
        return "error";
    }
}