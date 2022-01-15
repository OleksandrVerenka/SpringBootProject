package com.example.springbootproject.controller;

import com.example.springbootproject.entity.Departure;
import com.example.springbootproject.service.DepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartureController {

    @Autowired
    DepartureService departureService;

    @GetMapping("/hello")
    public String hello() {
        return "HELLO DDD";
    }

    @PostMapping("/departures")
    public Departure addDeparture(@RequestBody Departure departure) {
        return departureService.addDeparture(departure);
    }

    @GetMapping("/departures")
    public List<Departure> getAllDepartures() {
        return departureService.getDepartures();
    }
}