package com.dev.apiprevisaotempo.service;

import com.dev.apiprevisaotempo.dto.request.ForecastRequest;
import com.dev.apiprevisaotempo.dto.response.CityResponse;
import com.dev.apiprevisaotempo.entity.Forecast;

public interface ForecastService {

    Forecast getForecastByCityId(Long idCity);

    CityResponse getForecastByCityName(ForecastRequest forecastRequest);
}
