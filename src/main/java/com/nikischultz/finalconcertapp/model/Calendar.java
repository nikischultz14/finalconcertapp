package com.nikischultz.finalconcertapp.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Calendar {

    @Id
    private int calendarId;
    private Date date;
    private String month;
    private int year;


    private String currentDayName;

    public Calendar() {

    }

    public Calendar(int calendarId, Date date, String month, int year, String currentDayName) {
        this.calendarId = calendarId;
        this.date = date;
        this.month = month;
        this.year = year;
        this.currentDayName = currentDayName;
    }

    public int getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(int calendarId) {
        this.calendarId = calendarId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCurrentDayName() {
        return currentDayName;
    }

    public void setCurrentDayName(String currentDayName) {
        this.currentDayName = currentDayName;
    }
}
