package com.dev.apiprevisaotempo.controller;

import com.dev.apiprevisaotempo.entity.City;
import com.dev.apiprevisaotempo.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping()
    ResponseEntity<List<City>> getAllCity(){
        return ResponseEntity.ok(cityService.getAllCities());
    }
}