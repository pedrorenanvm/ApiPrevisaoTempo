package com.dev.apiprevisaotempo.service.impl;

import com.dev.apiprevisaotempo.entity.City;
import com.dev.apiprevisaotempo.repository.CityRepository;
import com.dev.apiprevisaotempo.service.CityService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

@Service
public class CityDataServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityDataServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    public void fetchAndSaveCities() {
        String citiesUrl = "http://servicos.cptec.inpe.br/XML/listaCidades";
        RestTemplate restTemplate = new RestTemplate();
        String xmlResponse = restTemplate.getForObject(citiesUrl, String.class);

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlResponse)));

            doc.getDocumentElement().normalize();

            NodeList cityNodes = doc.getElementsByTagName("cidade");

            for (int i = 0; i < cityNodes.getLength(); i++) {
                Node cityNode = cityNodes.item(i);
                if (cityNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element cityElement = (Element) cityNode;
                    String cityName = cityElement.getElementsByTagName("nome").item(0).getTextContent();
                    String uf = cityElement.getElementsByTagName("uf").item(0).getTextContent();
                    String cityId = cityElement.getElementsByTagName("id").item(0).getTextContent();

                    City city = new City();
                    city.setId(Long.parseLong(cityId));
                    city.setNome(cityName);
                    city.setUf(uf);
                    cityRepository.save(city);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}
