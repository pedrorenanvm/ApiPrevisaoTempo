package com.dev.apiprevisaotempo.repository;

import com.dev.apiprevisaotempo.entity.Previsao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PrevisaoRepository {

    //private String INSERT = "insert into previsao(nome,uf,atualizacao,dia,tempo,maxima,minima,iuv) VALUES(?,?,?,?,?,?,?,?)";
    private String INSERT = "insert into previsao(nome,uf,atualizacao) VALUES(?,?,?)";

    private JdbcTemplate jdbcTemplate;

    public PrevisaoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Previsao insert(Previsao previsao) {
        //jdbcTemplate.update(INSERT,previsao.getNome(),previsao.getUf(),previsao.getAtualizacao(),previsao.getDia(),previsao.getTempo(),previsao.getMaxima(),previsao.getMinima(),previsao.getIuv());
        jdbcTemplate.update(INSERT,previsao.getNome(),previsao.getUf(),previsao.getAtualizacao());
        return previsao;
    }
}
