package com.dev.apiprevisaotempo.service;

import com.dev.apiprevisaotempo.entity.Cidade;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class LocalidadeService {


    private static final String URL_BASE = "http://servicos.cptec.inpe.br/XML/listaCidades?city=";

    public Cidade[] buscarCidades(String nomeCidade){
        String cidadeCodificada;
        try {
            cidadeCodificada = URLEncoder.encode(nomeCidade, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Erro ao codificar o nome da cidade.", e);
        }
        String url = URL_BASE + cidadeCodificada;
        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2XmlHttpMessageConverter converter = new MappingJackson2XmlHttpMessageConverter();
        converter.setObjectMapper(new XmlMapper());
        restTemplate.getMessageConverters().add(converter);
        return restTemplate.getForObject(url, Cidade[].class);
    }
}
