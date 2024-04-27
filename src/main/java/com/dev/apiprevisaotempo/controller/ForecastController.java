package com.dev.apiprevisaotempo.controller;

import com.dev.apiprevisaotempo.dto.ForecastRequest;
import com.dev.apiprevisaotempo.entity.City;
import com.dev.apiprevisaotempo.entity.Forecast;
import com.dev.apiprevisaotempo.service.ForecastService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "forecast")
public class ForecastController {

    private final ForecastService forecastService;

    public ForecastController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/{idCity}")
    ResponseEntity<Forecast> getForecast(@PathVariable Long idCity){
        return ResponseEntity.ok(forecastService.getForecastByCityId(idCity));
    }

    @GetMapping("/city")
    public ResponseEntity<City> getForecastByCityName(@RequestBody ForecastRequest cityName) {
        return ResponseEntity.ok(forecastService.getForecastByCityName(cityName));
    }

}
