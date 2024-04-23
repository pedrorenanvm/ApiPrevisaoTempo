package com.dev.apiprevisaotempo.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Previsao {

    @Id
    @JsonAlias("nome")
    private String nome;

    @JsonAlias("uf")
    private String uf;
    @JsonAlias("atualizacao")
    private String atualizacao;

    /*@JsonAlias("dia")
    private String dia;
    @JsonAlias("tempo")
    private String tempo;
    @JsonAlias("maxima")
    private int maxima;
    @JsonAlias("minima")
    private int minima;
    @JsonAlias("iuv")
    private double iuv;*/
}
