package com.nikischultz.finalconcertapp.model;

import org.springframework.data.annotation.Id;

public class Show {

    @Id
    private int showId;

    private Venue venueName;
    private Artist artistName;
    private Genre genreName;
    private String description;
    private String cost;
    private City cityName;
    private Calendar currentDayName;

    public Show() {

    }

    public Show(Venue venueName, Artist artistName, Genre genreName, String description,
                String cost, City cityName, Calendar currentDayName) {
        this.venueName = venueName;
        this.artistName = artistName;
        this.genreName = genreName;
        this.description = description;
        this.cost = cost;
        this.cityName = cityName;
        this.currentDayName = currentDayName;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Venue getVenueName() {
        return venueName;
    }

    public void setVenueName(Venue venueName) {
        this.venueName = venueName;
    }

    public Artist getArtistName() {
        return artistName;
    }

    public void setArtistName(Artist artistName) {
        this.artistName = artistName;
    }

    public Genre getGenreName() {
        return genreName;
    }

    public void setGenreName(Genre genreName) {
        this.genreName = genreName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public City getCityName() {
        return cityName;
    }

    public void setCityName(City cityName) {
        this.cityName = cityName;
    }

    public Calendar getCurrentDayName() {
        return currentDayName;
    }

    public void setCurrentDayName(Calendar currentDayName) {
        this.currentDayName = currentDayName;
    }
}
