package com.dev.apiprevisaotempo.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CityResponse {
    private String nome;
    private String uf;
    private LocalDate atualizacao;
    private List<ForecastResponse> previsoes;
}
