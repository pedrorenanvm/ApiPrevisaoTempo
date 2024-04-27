package com.dev.apiprevisaotempo.service;

import com.dev.apiprevisaotempo.dto.ForecastRequest;
import com.dev.apiprevisaotempo.entity.City;

import java.util.List;

public interface CityService {

    void fetchAndSaveCities(ForecastRequest forecastRequest);

    public void buscarCidades(String nomeCidade);

    List<City> getAllCities();
}
