package com.tts.weatherapp.service;

import com.tts.weatherapp.models.Request;
import com.tts.weatherapp.models.Response;
import com.tts.weatherapp.repository.WeatherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    @Autowired
    private WeatherRepository weatherRepository;

    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + 
            zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        try {
            Request request = new Request(zipCode);
            weatherRepository.save(request);
            return restTemplate.getForObject(url, Response.class);
        } catch (HttpClientErrorException exception) {
            Response response = new Response();
            response.setName("ERROR");
            return response;
        }
    }
}
