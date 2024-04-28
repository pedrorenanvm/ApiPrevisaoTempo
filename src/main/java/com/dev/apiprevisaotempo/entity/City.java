package com.dev.apiprevisaotempo.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@JsonPropertyOrder({"nome", "uf", "atualizacao", "previsoes"})
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @JsonAlias("nome")
    private String nome;

    @JsonAlias("atualizacao")
    private LocalDate atualizacao;

    @JsonAlias("uf")
    private String uf;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "previsao")

    @OneToMany(mappedBy = "city")
    private List<Forecast> previsoes;

}
