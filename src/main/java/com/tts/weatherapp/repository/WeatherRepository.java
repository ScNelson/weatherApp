package com.tts.weatherapp.repository;

import java.util.List;

import com.tts.weatherapp.models.Request;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends CrudRepository<Request, Long> {
    List<Request> findFirst10ByOrderByIdDesc();
}
