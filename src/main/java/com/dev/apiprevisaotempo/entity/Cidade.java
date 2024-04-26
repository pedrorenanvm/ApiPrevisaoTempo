package com.dev.apiprevisaotempo.entity;

import com.dev.apiprevisaotempo.DTO.Previsao;
import com.dev.apiprevisaotempo.DTO.PrevisaoList;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cidade {
    @Id
    private Long id;
    private String nome;
    private String UF;


}
