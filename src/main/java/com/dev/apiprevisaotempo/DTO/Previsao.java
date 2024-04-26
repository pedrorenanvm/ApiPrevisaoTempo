package com.dev.apiprevisaotempo.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Previsao {


 /*   @JsonAlias("nome")
    private String nome;

    @JsonAlias("uf")
    private String uf;
    @JsonAlias("atualizacao")
    private String atualizacao;*/

    @JsonAlias("dia")
    private String dia;
    @JsonAlias("tempo")
    private String tempo;
    @JsonAlias("maxima")
    private int maxima;
    @JsonAlias("minima")
    private int minima;
    @JsonAlias("iuv")
    private double iuv;
}
