package com.nikischultz.finalconcertapp.model;

import org.springframework.data.annotation.Id;

public class City {

    @Id
    private int cityId;

    private String cityName;
    private String state;
    private String country;
    private int zipCode;

    public City() {

    }

    public City(int cityId, String cityName, String state, String country, int zipCode) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

