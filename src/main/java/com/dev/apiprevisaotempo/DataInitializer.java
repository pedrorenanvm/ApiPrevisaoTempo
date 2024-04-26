package com.dev.apiprevisaotempo;

import com.dev.apiprevisaotempo.service.impl.CityDataServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    private final CityDataServiceImpl cityDataService;

    public DataInitializer(CityDataServiceImpl cityDataService) {
        this.cityDataService = cityDataService;
    }


    @PostConstruct
    public void init() {
        // Chama o serviço para buscar e salvar as cidades ao iniciar a aplicação
        cityDataService.fetchAndSaveCities();
    }
}
