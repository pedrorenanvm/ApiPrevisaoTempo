package com.dev.apiprevisaotempo.dto.response;

import lombok.Data;

@Data
public class ForecastResponse {

    private String dia;

    private String tempo;

    private int maxima;

    private int minima;

    private double iuv;
}
