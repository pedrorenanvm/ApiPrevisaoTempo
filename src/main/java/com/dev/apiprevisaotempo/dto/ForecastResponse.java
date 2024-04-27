package com.dev.apiprevisaotempo.dto;

import com.dev.apiprevisaotempo.entity.City;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ForecastResponse {

    private Long id;

    private LocalDate dia;

    private String tempo;

    private int maxima;

    private int minima;

    private double iuv;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
