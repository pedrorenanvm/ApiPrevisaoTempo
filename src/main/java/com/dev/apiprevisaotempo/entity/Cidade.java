package com.dev.apiprevisaotempo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cidade {
    @Id
    private Long id;
    private String nome;
    private String UF;

}
