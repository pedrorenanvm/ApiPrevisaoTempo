package com.dev.apiprevisaotempo.service;

import com.dev.apiprevisaotempo.dto.ForecastRequest;
import com.dev.apiprevisaotempo.entity.City;
import com.dev.apiprevisaotempo.entity.Forecast;

public interface ForecastService {

    Forecast getForecastByCityId(Long idCity);

    City getForecastByCityName(ForecastRequest forecastRequest);
}
