package com.tts.weatherapp.repository;

import com.tts.weatherapp.models.Request;

import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Request, Long> {
    
}
