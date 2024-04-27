package com.dev.apiprevisaotempo.service.impl;

import com.dev.apiprevisaotempo.dto.ForecastRequest;
import com.dev.apiprevisaotempo.entity.City;
import com.dev.apiprevisaotempo.entity.Forecast;
import com.dev.apiprevisaotempo.repository.CityRepository;
import com.dev.apiprevisaotempo.repository.ForecastRepository;
import com.dev.apiprevisaotempo.service.CityService;
import com.dev.apiprevisaotempo.service.ForecastService;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ForecastServiceImpl implements ForecastService {

    private final CityRepository cityRepository;

    private final CityService cityService;
    private final ForecastRepository forecastRepository;
    @Autowired
    public ForecastServiceImpl(CityRepository cityRepository, CityService cityService, ForecastRepository forecastRepository) {
        this.cityRepository = cityRepository;
        this.cityService = cityService;
        this.forecastRepository = forecastRepository;
    }

    @Override
    public Forecast getForecastByCityId(Long idCity) {
        return null;
    }

    @Override
    public City getForecastByCityName(ForecastRequest forecastRequest) {
        String name = forecastRequest.getCityName();
        cityService.buscarCidades(name);

        City city = cityRepository.findByNome(forecastRequest.getCityName());
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://servicos.cptec.inpe.br/XML/cidade/" + city.getId() + "/previsao.xml";
        XmlMapper xmlMapper = new XmlMapper();
        MappingJackson2XmlHttpMessageConverter converter = new MappingJackson2XmlHttpMessageConverter(xmlMapper);
        restTemplate.getMessageConverters().add(converter);
        return restTemplate.getForObject(url, City.class);
    }



}
