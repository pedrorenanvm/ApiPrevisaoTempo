package com.dev.apiprevisaotempo.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Forecast implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ManyToOne
    private City city;
}
