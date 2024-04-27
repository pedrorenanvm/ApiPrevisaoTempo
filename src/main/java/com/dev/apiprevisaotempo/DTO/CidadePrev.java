package com.dev.apiprevisaotempo.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonPropertyOrder({"nome", "uf", "atualizacao", "previsoes"})
public class CidadePrev {
    @JsonAlias("nome")
    private String nome;
    @JsonAlias("atualizacao")
    private String atualizacao;
    @JsonAlias("uf")
    private String UF;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "previsao")
    private List<Previsao> previsoes;
}
