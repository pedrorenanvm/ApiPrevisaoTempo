package com.dev.apiprevisaotempo.service;

import com.dev.apiprevisaotempo.entity.Previsao;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PrevisaoService {


    public Previsao listarPrevisao(String codLocalidade) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://servicos.cptec.inpe.br/XML/cidade/" + codLocalidade + "/previsao.xml";
        XmlMapper xmlMapper = new XmlMapper();
        MappingJackson2XmlHttpMessageConverter converter = new MappingJackson2XmlHttpMessageConverter(xmlMapper);
        restTemplate.getMessageConverters().add(converter);
        return restTemplate.getForObject(url, Previsao.class);
    }
}
