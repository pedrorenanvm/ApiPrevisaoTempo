package com.dev.apiprevisaotempo.repository;

import com.dev.apiprevisaotempo.entity.Cidade;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CidadeRepository {

    private static String INSERT = "insert into cidade(id,nome,uf) values(?,?,?)";

    private JdbcTemplate jdbcTemplate;

    public CidadeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Cidade insert(Cidade cidade) {
        jdbcTemplate.update(INSERT,cidade.getId(),cidade.getNome(),cidade.getUF());
        return cidade;
    }

}
