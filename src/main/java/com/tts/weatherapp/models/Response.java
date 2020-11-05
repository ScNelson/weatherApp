package com.tts.weatherapp.models;

import java.util.List;
import java.util.Map;

public class Response {
    private Map<String, String> coord;
    private List<Map<String, String>> weather;
    private String base;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> clouds;
    private String dt;
    private Map<String, String> sys;
    private String id;
    private String name;
    private String cod;

    public Response() {}


    public Map<String,String> getCoord() {
        return this.coord;
    }

    public void setCoord(Map<String,String> coord) {
        this.coord = coord;
    }

    public List<Map<String,String>> getWeather() {
        return this.weather;
    }

    public void setWeather(List<Map<String,String>> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String,String> getMain() {
        return this.main;
    }

    public void setMain(Map<String,String> main) {
        this.main = main;
    }

    public Map<String,String> getWind() {
        return this.wind;
    }

    public void setWind(Map<String,String> wind) {
        this.wind = wind;
    }

    public Map<String,String> getClouds() {
        return this.clouds;
    }

    public void setClouds(Map<String,String> clouds) {
        this.clouds = clouds;
    }

    public String getDt() {
        return this.dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Map<String,String> getSys() {
        return this.sys;
    }

    public void setSys(Map<String,String> sys) {
        this.sys = sys;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return this.cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "{" +
            " coord='" + getCoord() + "'" +
            ", weather='" + getWeather() + "'" +
            ", base='" + getBase() + "'" +
            ", main='" + getMain() + "'" +
            ", wind='" + getWind() + "'" +
            ", clouds='" + getClouds() + "'" +
            ", dt='" + getDt() + "'" +
            ", sys='" + getSys() + "'" +
            ", id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", cod='" + getCod() + "'" +
            "}";
    }
}
