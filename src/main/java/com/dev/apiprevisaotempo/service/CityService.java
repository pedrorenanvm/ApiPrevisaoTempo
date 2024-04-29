package com.dev.apiprevisaotempo.service;

import com.dev.apiprevisaotempo.dto.request.ForecastRequest;
import com.dev.apiprevisaotempo.entity.City;

import java.util.List;

public interface CityService {

    public void buscarCidades(String nomeCidade);

    List<City> getAllCities();
}
